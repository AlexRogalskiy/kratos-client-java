/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.10
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Credentials represents a specific credential type
 */
@ApiModel(description = "Credentials represents a specific credential type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T14:44:50.402860Z[Etc/UTC]")
public class IdentityCredentials {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<String> identifiers = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public IdentityCredentials config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getConfig() {
    return config;
  }


  public void setConfig(Object config) {
    this.config = config;
  }


  public IdentityCredentials identifiers(List<String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public IdentityCredentials addIdentifiersItem(String identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Identifiers represents a list of unique identifiers this credential type matches.
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifiers represents a list of unique identifiers this credential type matches.")

  public List<String> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
  }


  public IdentityCredentials type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * and so on.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "and so on.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityCredentials identityCredentials = (IdentityCredentials) o;
    return Objects.equals(this.config, identityCredentials.config) &&
        Objects.equals(this.identifiers, identityCredentials.identifiers) &&
        Objects.equals(this.type, identityCredentials.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, identifiers, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCredentials {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

