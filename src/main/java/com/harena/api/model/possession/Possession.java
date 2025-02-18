package com.harena.api.model.possession;

import static com.harena.api.model.Devise.NON_NOMMEE;

import com.harena.api.model.Devise;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Getter
public abstract sealed class Possession implements Serializable /*note(no-serializable)*/
    permits Argent,
        FluxArgent,
        TransfertArgent,
        Materiel,
        AchatMaterielAuComptant,
        GroupePossession {
  protected final String nom;
  protected final LocalDate t;
  protected final int valeurComptable;
  protected final Devise devise;

  public Possession(String nom, LocalDate t, int valeurComptable) {
    this.nom = nom;
    this.t = t;
    this.valeurComptable = valeurComptable;
    this.devise = NON_NOMMEE;
  }

  public final int valeurComptableFuture(LocalDate tFutur) {
    return projectionFuture(tFutur).getValeurComptable(this.devise, tFutur);
  }

  public abstract Possession projectionFuture(LocalDate tFutur);

  public final int getValeurComptable(Devise autreDevise, LocalDate tFutur) {
    double valeurEnAriaryAutreDeviseATempsT = autreDevise.valeurEnAriary(tFutur);
    return (int)
        ((this.valeurComptable * this.devise.valeurEnAriary(tFutur))
            / valeurEnAriaryAutreDeviseATempsT);
  }
}
