/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: latest
 * 
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
import sh.ory.kratos.model.Error;
import sh.ory.kratos.model.FormField;

/**
 * RequestMethodConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-05T10:06:21.081401Z[GMT]")
public class RequestMethodConfig {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FormField> fields = new ArrayList<FormField>();

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;


  public RequestMethodConfig action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action should be used as the form action URL `<form action=\"{{ .Action }}\" method=\"post\">`.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public RequestMethodConfig errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public RequestMethodConfig addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Errors contains all form errors. These will be duplicates of the individual field errors.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Errors contains all form errors. These will be duplicates of the individual field errors.")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public RequestMethodConfig fields(List<FormField> fields) {
    
    this.fields = fields;
    return this;
  }

  public RequestMethodConfig addFieldsItem(FormField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields contains multiple fields
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "Fields contains multiple fields")

  public List<FormField> getFields() {
    return fields;
  }


  public void setFields(List<FormField> fields) {
    this.fields = fields;
  }


  public RequestMethodConfig method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the form method (e.g. POST)
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method is the form method (e.g. POST)")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestMethodConfig requestMethodConfig = (RequestMethodConfig) o;
    return Objects.equals(this.action, requestMethodConfig.action) &&
        Objects.equals(this.errors, requestMethodConfig.errors) &&
        Objects.equals(this.fields, requestMethodConfig.fields) &&
        Objects.equals(this.method, requestMethodConfig.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, errors, fields, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestMethodConfig {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

