package com.harena.api.service.impl;

import com.harena.api.dto.responses.RestPatrimoine;
import com.harena.api.exceptions.InternalServerException;
import com.harena.api.exceptions.ResourceNotFoundException;
import com.harena.api.repository.PatrimoineRepository;
import com.harena.api.repository.PersonRepository;
import com.harena.api.repository.model.Patrimoine;
import com.harena.api.repository.model.possession.Argent;
import com.harena.api.service.PatrimoineService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PatrimoineServiceImpl implements PatrimoineService {
  private final PatrimoineRepository patrimoineRepository;
  private final PersonRepository personRepository;

  @Override
  public List<RestPatrimoine> findAllPatrimoines(Long page, Long pageSize) {
    var allPatrimoines = patrimoineRepository.loadAllData();
    if (page == null || pageSize == null) {
      return allPatrimoines.stream().map(this::toRestPatrimoine).collect(Collectors.toList());
    }
    return allPatrimoines.stream()
        .skip((page - 1) * pageSize)
        .limit(pageSize)
        .map(this::toRestPatrimoine)
        .collect(Collectors.toList());
  }

  @Override
  public List<RestPatrimoine> savePatrimoines(List<RestPatrimoine> restPatrimoines) {
    var patrimoines = new ArrayList<RestPatrimoine>();
    restPatrimoines.forEach(
        restPatrimoine -> {
          var personne = personRepository.findPersonByNom(restPatrimoine.getPossesseur().nom());
          if (personne != null) {
            personRepository.update(restPatrimoine.getPossesseur(), restPatrimoine.getPossesseur());
          } else {
            personRepository.create(restPatrimoine.getPossesseur());
          }
          var patrimoine = patrimoineRepository.findPatrimoineByNom(restPatrimoine.getNom());
          if (patrimoine != null) {
            patrimoines.add(
                toRestPatrimoine(
                    patrimoineRepository
                        .update(toPatrimoine(restPatrimoine), patrimoine)
                        .orElseThrow(
                            () -> new InternalServerException("Error creating patrimoine "))));
          } else {
            patrimoines.add(
                toRestPatrimoine(
                    patrimoineRepository
                        .create(toPatrimoine(restPatrimoine))
                        .orElseThrow(
                            () -> new InternalServerException("Error creating patrimoine "))));
          }
        });
    return patrimoines;
  }

  @Override
  public RestPatrimoine findPatrimoineByNom(String patrimoineNom) {
    var patrimoine = patrimoineRepository.findPatrimoineByNom(patrimoineNom);
    if (patrimoine == null) {
      throw new ResourceNotFoundException(patrimoineNom + " n'existe pas");
    }
    return this.toRestPatrimoine(patrimoine);
  }

  @Override
  public List<RestPatrimoine> projectionFuture(LocalDate futureDate) {
    List<Patrimoine> allPatrimoines = patrimoineRepository.loadAllData();
    return allPatrimoines.stream()
        .map(patrimoine -> projectPatrimoineFuture(patrimoine, futureDate))
        .map(this::toRestPatrimoine)
        .collect(Collectors.toList());
  }

  private Patrimoine projectPatrimoineFuture(Patrimoine patrimoine, LocalDate futureDate) {
    var possessionsFuture =
        patrimoine.possessions().stream()
            .map(possession -> possession.projectionFuture(futureDate))
            .collect(Collectors.toSet());
    return new Patrimoine(patrimoine.nom(), patrimoine.possesseur(), futureDate, possessionsFuture);
  }

  private RestPatrimoine toRestPatrimoine(Patrimoine patrimoine) {
    return new RestPatrimoine(
        patrimoine.nom(), patrimoine.t(), patrimoine.possesseur(), patrimoine.getValeurComptable());
  }

  private Patrimoine toPatrimoine(RestPatrimoine patrimoine) {
    return new Patrimoine(
        patrimoine.getNom(),
        patrimoine.getPossesseur(),
        patrimoine.getT(),
        Set.of(new Argent("ok", LocalDate.now(), LocalDate.now(), 1220000)));
  }
}
