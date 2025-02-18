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

/** FluxArgentAllOf */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-23T10:20:14.118552532+03:00[Indian/Antananarivo]")
public class FluxArgentAllOf {
  public static final String SERIALIZED_NAME_ARGENT = "argent";

  @SerializedName(SERIALIZED_NAME_ARGENT)
  private Argent argent;

  public static final String SERIALIZED_NAME_DEBUT = "debut";

  @SerializedName(SERIALIZED_NAME_DEBUT)
  private LocalDate debut;

  public static final String SERIALIZED_NAME_FIN = "fin";

  @SerializedName(SERIALIZED_NAME_FIN)
  private LocalDate fin;

  public static final String SERIALIZED_NAME_FLUX_MENSUEL = "flux_mensuel";

  @SerializedName(SERIALIZED_NAME_FLUX_MENSUEL)
  private Integer fluxMensuel;

  public static final String SERIALIZED_NAME_DATE_D_OPERATION = "date_d_operation";

  @SerializedName(SERIALIZED_NAME_DATE_D_OPERATION)
  private Integer dateDOperation;

  public FluxArgentAllOf() {}

  public FluxArgentAllOf argent(Argent argent) {

    this.argent = argent;
    return this;
  }

  /**
   * Get argent
   *
   * @return argent
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Argent getArgent() {
    return argent;
  }

  public void setArgent(Argent argent) {
    this.argent = argent;
  }

  public FluxArgentAllOf debut(LocalDate debut) {

    this.debut = debut;
    return this;
  }

  /**
   * Get debut
   *
   * @return debut
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public LocalDate getDebut() {
    return debut;
  }

  public void setDebut(LocalDate debut) {
    this.debut = debut;
  }

  public FluxArgentAllOf fin(LocalDate fin) {

    this.fin = fin;
    return this;
  }

  /**
   * Get fin
   *
   * @return fin
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public LocalDate getFin() {
    return fin;
  }

  public void setFin(LocalDate fin) {
    this.fin = fin;
  }

  public FluxArgentAllOf fluxMensuel(Integer fluxMensuel) {

    this.fluxMensuel = fluxMensuel;
    return this;
  }

  /**
   * Get fluxMensuel
   *
   * @return fluxMensuel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getFluxMensuel() {
    return fluxMensuel;
  }

  public void setFluxMensuel(Integer fluxMensuel) {
    this.fluxMensuel = fluxMensuel;
  }

  public FluxArgentAllOf dateDOperation(Integer dateDOperation) {

    this.dateDOperation = dateDOperation;
    return this;
  }

  /**
   * Get dateDOperation
   *
   * @return dateDOperation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getDateDOperation() {
    return dateDOperation;
  }

  public void setDateDOperation(Integer dateDOperation) {
    this.dateDOperation = dateDOperation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FluxArgentAllOf fluxArgentAllOf = (FluxArgentAllOf) o;
    return Objects.equals(this.argent, fluxArgentAllOf.argent)
        && Objects.equals(this.debut, fluxArgentAllOf.debut)
        && Objects.equals(this.fin, fluxArgentAllOf.fin)
        && Objects.equals(this.fluxMensuel, fluxArgentAllOf.fluxMensuel)
        && Objects.equals(this.dateDOperation, fluxArgentAllOf.dateDOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argent, debut, fin, fluxMensuel, dateDOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FluxArgentAllOf {\n");
    sb.append("    argent: ").append(toIndentedString(argent)).append("\n");
    sb.append("    debut: ").append(toIndentedString(debut)).append("\n");
    sb.append("    fin: ").append(toIndentedString(fin)).append("\n");
    sb.append("    fluxMensuel: ").append(toIndentedString(fluxMensuel)).append("\n");
    sb.append("    dateDOperation: ").append(toIndentedString(dateDOperation)).append("\n");
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
    openapiFields.add("argent");
    openapiFields.add("debut");
    openapiFields.add("fin");
    openapiFields.add("flux_mensuel");
    openapiFields.add("date_d_operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to FluxArgentAllOf
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (FluxArgentAllOf.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in FluxArgentAllOf is not found in the empty JSON string",
                FluxArgentAllOf.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!FluxArgentAllOf.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `FluxArgentAllOf`"
                    + " properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `argent`
    if (jsonObj.get("argent") != null && !jsonObj.get("argent").isJsonNull()) {
      Argent.validateJsonObject(jsonObj.getAsJsonObject("argent"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!FluxArgentAllOf.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'FluxArgentAllOf' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<FluxArgentAllOf> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(FluxArgentAllOf.class));

      return (TypeAdapter<T>)
          new TypeAdapter<FluxArgentAllOf>() {
            @Override
            public void write(JsonWriter out, FluxArgentAllOf value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public FluxArgentAllOf read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of FluxArgentAllOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FluxArgentAllOf
   * @throws IOException if the JSON string is invalid with respect to FluxArgentAllOf
   */
  public static FluxArgentAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FluxArgentAllOf.class);
  }

  /**
   * Convert an instance of FluxArgentAllOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
