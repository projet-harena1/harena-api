/*
 * harena
 * harena
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.client.JSON;

/** PossessionAvecType */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-23T10:20:14.118552532+03:00[Indian/Antananarivo]")
public class PossessionAvecType {
  public static final String SERIALIZED_NAME_T = "t";

  @SerializedName(SERIALIZED_NAME_T)
  private LocalDate t;

  public static final String SERIALIZED_NAME_NOM = "nom";

  @SerializedName(SERIALIZED_NAME_NOM)
  private String nom;

  public static final String SERIALIZED_NAME_VALEUR_COMPTABLE = "valeur_comptable";

  @SerializedName(SERIALIZED_NAME_VALEUR_COMPTABLE)
  private Integer valeurComptable;

  public static final String SERIALIZED_NAME_DEVISE = "devise";

  @SerializedName(SERIALIZED_NAME_DEVISE)
  private Devise devise;

  public PossessionAvecType() {}

  public PossessionAvecType t(LocalDate t) {

    this.t = t;
    return this;
  }

  /**
   * Get t
   *
   * @return t
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public LocalDate getT() {
    return t;
  }

  public void setT(LocalDate t) {
    this.t = t;
  }

  public PossessionAvecType nom(String nom) {

    this.nom = nom;
    return this;
  }

  /**
   * Get nom
   *
   * @return nom
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public PossessionAvecType valeurComptable(Integer valeurComptable) {

    this.valeurComptable = valeurComptable;
    return this;
  }

  /**
   * Get valeurComptable
   *
   * @return valeurComptable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getValeurComptable() {
    return valeurComptable;
  }

  public void setValeurComptable(Integer valeurComptable) {
    this.valeurComptable = valeurComptable;
  }

  public PossessionAvecType devise(Devise devise) {

    this.devise = devise;
    return this;
  }

  /**
   * Get devise
   *
   * @return devise
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Devise getDevise() {
    return devise;
  }

  public void setDevise(Devise devise) {
    this.devise = devise;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PossessionAvecType possessionAvecType = (PossessionAvecType) o;
    return Objects.equals(this.t, possessionAvecType.t)
        && Objects.equals(this.nom, possessionAvecType.nom)
        && Objects.equals(this.valeurComptable, possessionAvecType.valeurComptable)
        && Objects.equals(this.devise, possessionAvecType.devise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t, nom, valeurComptable, devise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PossessionAvecType {\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    valeurComptable: ").append(toIndentedString(valeurComptable)).append("\n");
    sb.append("    devise: ").append(toIndentedString(devise)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("t");
    openapiFields.add("nom");
    openapiFields.add("valeur_comptable");
    openapiFields.add("devise");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to PossessionAvecType
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (PossessionAvecType.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in PossessionAvecType is not found in the empty JSON"
                    + " string",
                PossessionAvecType.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!PossessionAvecType.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `PossessionAvecType`"
                    + " properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("nom") != null && !jsonObj.get("nom").isJsonNull())
        && !jsonObj.get("nom").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `nom` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("nom").toString()));
    }
    // validate the optional field `devise`
    if (jsonObj.get("devise") != null && !jsonObj.get("devise").isJsonNull()) {
      Devise.validateJsonObject(jsonObj.getAsJsonObject("devise"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!PossessionAvecType.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'PossessionAvecType' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<PossessionAvecType> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(PossessionAvecType.class));

      return (TypeAdapter<T>)
          new TypeAdapter<PossessionAvecType>() {
            @Override
            public void write(JsonWriter out, PossessionAvecType value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public PossessionAvecType read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of PossessionAvecType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PossessionAvecType
   * @throws IOException if the JSON string is invalid with respect to PossessionAvecType
   */
  public static PossessionAvecType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PossessionAvecType.class);
  }

  /**
   * Convert an instance of PossessionAvecType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
