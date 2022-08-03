/*
 * Account Management Service API
 * Manage user subscriptions and clusters
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.bf2.ffm.ams.client.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ClusterTransferRequest
 */
@JsonPropertyOrder({
  ClusterTransferRequest.JSON_PROPERTY_CLUSTER_UUID,
  ClusterTransferRequest.JSON_PROPERTY_OWNER,
  ClusterTransferRequest.JSON_PROPERTY_RECIPIENT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClusterTransferRequest {
  public static final String JSON_PROPERTY_CLUSTER_UUID = "cluster_uuid";
  private String clusterUuid;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_RECIPIENT = "recipient";
  private String recipient;

  public ClusterTransferRequest() { 
  }

  public ClusterTransferRequest clusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

   /**
   * Get clusterUuid
   * @return clusterUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClusterUuid() {
    return clusterUuid;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterUuid(String clusterUuid) {
    this.clusterUuid = clusterUuid;
  }


  public ClusterTransferRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public ClusterTransferRequest recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipient() {
    return recipient;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  /**
   * Return true if this ClusterTransferRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterTransferRequest clusterTransferRequest = (ClusterTransferRequest) o;
    return Objects.equals(this.clusterUuid, clusterTransferRequest.clusterUuid) &&
        Objects.equals(this.owner, clusterTransferRequest.owner) &&
        Objects.equals(this.recipient, clusterTransferRequest.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterUuid, owner, recipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterTransferRequest {\n");
    sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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
