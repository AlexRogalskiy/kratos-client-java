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

/**
 * Port An open port on a container
 */
@ApiModel(description = "Port An open port on a container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T15:38:46.869759Z[Etc/UTC]")
public class Port {
  public static final String SERIALIZED_NAME_I_P = "IP";
  @SerializedName(SERIALIZED_NAME_I_P)
  private String IP;

  public static final String SERIALIZED_NAME_PRIVATE_PORT = "PrivatePort";
  @SerializedName(SERIALIZED_NAME_PRIVATE_PORT)
  private Integer privatePort;

  public static final String SERIALIZED_NAME_PUBLIC_PORT = "PublicPort";
  @SerializedName(SERIALIZED_NAME_PUBLIC_PORT)
  private Integer publicPort;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Port IP(String IP) {
    
    this.IP = IP;
    return this;
  }

   /**
   * IP
   * @return IP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP")

  public String getIP() {
    return IP;
  }


  public void setIP(String IP) {
    this.IP = IP;
  }


  public Port privatePort(Integer privatePort) {
    
    this.privatePort = privatePort;
    return this;
  }

   /**
   * Port on the container
   * @return privatePort
  **/
  @ApiModelProperty(required = true, value = "Port on the container")

  public Integer getPrivatePort() {
    return privatePort;
  }


  public void setPrivatePort(Integer privatePort) {
    this.privatePort = privatePort;
  }


  public Port publicPort(Integer publicPort) {
    
    this.publicPort = publicPort;
    return this;
  }

   /**
   * Port exposed on the host
   * @return publicPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port exposed on the host")

  public Integer getPublicPort() {
    return publicPort;
  }


  public void setPublicPort(Integer publicPort) {
    this.publicPort = publicPort;
  }


  public Port type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type")

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
    Port port = (Port) o;
    return Objects.equals(this.IP, port.IP) &&
        Objects.equals(this.privatePort, port.privatePort) &&
        Objects.equals(this.publicPort, port.publicPort) &&
        Objects.equals(this.type, port.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IP, privatePort, publicPort, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Port {\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    privatePort: ").append(toIndentedString(privatePort)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
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

