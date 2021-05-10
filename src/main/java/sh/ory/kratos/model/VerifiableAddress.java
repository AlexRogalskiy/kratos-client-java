/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.12
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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * VerifiableAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T15:38:46.869759Z[Etc/UTC]")
public class VerifiableAddress {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_VERIFIED_AT = "verified_at";
  @SerializedName(SERIALIZED_NAME_VERIFIED_AT)
  private OffsetDateTime verifiedAt;

  public static final String SERIALIZED_NAME_VIA = "via";
  @SerializedName(SERIALIZED_NAME_VIA)
  private String via;


  public VerifiableAddress id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public VerifiableAddress status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VerifiableAddress value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public VerifiableAddress verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public VerifiableAddress verifiedAt(OffsetDateTime verifiedAt) {
    
    this.verifiedAt = verifiedAt;
    return this;
  }

   /**
   * Get verifiedAt
   * @return verifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getVerifiedAt() {
    return verifiedAt;
  }


  public void setVerifiedAt(OffsetDateTime verifiedAt) {
    this.verifiedAt = verifiedAt;
  }


  public VerifiableAddress via(String via) {
    
    this.via = via;
    return this;
  }

   /**
   * Get via
   * @return via
  **/
  @ApiModelProperty(required = true, value = "")

  public String getVia() {
    return via;
  }


  public void setVia(String via) {
    this.via = via;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiableAddress verifiableAddress = (VerifiableAddress) o;
    return Objects.equals(this.id, verifiableAddress.id) &&
        Objects.equals(this.status, verifiableAddress.status) &&
        Objects.equals(this.value, verifiableAddress.value) &&
        Objects.equals(this.verified, verifiableAddress.verified) &&
        Objects.equals(this.verifiedAt, verifiableAddress.verifiedAt) &&
        Objects.equals(this.via, verifiableAddress.via);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, value, verified, verifiedAt, via);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiableAddress {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
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

