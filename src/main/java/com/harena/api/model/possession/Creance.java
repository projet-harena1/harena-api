package com.harena.api.model.possession;

import static com.harena.api.model.Devise.NON_NOMMEE;

import com.harena.api.model.Devise;
import java.time.LocalDate;

public final class Creance extends Argent {

  public Creance(String nom, LocalDate t, int valeurComptable, Devise devise) {
    super(nom, t, valeurComptable, devise);
    if (valeurComptable < 0) {
      throw new IllegalArgumentException();
    }
  }

  public Creance(String nom, LocalDate t, int valeurComptable) {
    this(nom, t, valeurComptable, NON_NOMMEE);
  }

  private Creance(Argent argent) {
    this(argent.nom, argent.t, argent.valeurComptable, argent.devise);
  }

  @Override
  public Creance projectionFuture(LocalDate tFutur) {
    return new Creance(super.projectionFuture(tFutur));
  }
}
