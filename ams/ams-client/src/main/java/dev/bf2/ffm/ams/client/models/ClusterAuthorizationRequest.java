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
import dev.bf2.ffm.ams.client.models.ReservedResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ClusterAuthorizationRequest
 */
@JsonPropertyOrder({
  ClusterAuthorizationRequest.JSON_PROPERTY_ACCOUNT_USERNAME,
  ClusterAuthorizationRequest.JSON_PROPERTY_AVAILABILITY_ZONE,
  ClusterAuthorizationRequest.JSON_PROPERTY_BYOC,
  ClusterAuthorizationRequest.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  ClusterAuthorizationRequest.JSON_PROPERTY_CLOUD_PROVIDER_ID,
  ClusterAuthorizationRequest.JSON_PROPERTY_CLUSTER_ID,
  ClusterAuthorizationRequest.JSON_PROPERTY_DISCONNECTED,
  ClusterAuthorizationRequest.JSON_PROPERTY_DISPLAY_NAME,
  ClusterAuthorizationRequest.JSON_PROPERTY_EXTERNAL_CLUSTER_ID,
  ClusterAuthorizationRequest.JSON_PROPERTY_MANAGED,
  ClusterAuthorizationRequest.JSON_PROPERTY_PRODUCT_CATEGORY,
  ClusterAuthorizationRequest.JSON_PROPERTY_PRODUCT_ID,
  ClusterAuthorizationRequest.JSON_PROPERTY_QUOTA_VERSION,
  ClusterAuthorizationRequest.JSON_PROPERTY_RESERVE,
  ClusterAuthorizationRequest.JSON_PROPERTY_RESOURCES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClusterAuthorizationRequest {
  public static final String JSON_PROPERTY_ACCOUNT_USERNAME = "account_username";
  private String accountUsername;

  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availability_zone";
  private String availabilityZone;

  public static final String JSON_PROPERTY_BYOC = "byoc";
  private Boolean byoc;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloud_account_id";
  private String cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER_ID = "cloud_provider_id";
  private String cloudProviderId;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_DISCONNECTED = "disconnected";
  private Boolean disconnected;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_EXTERNAL_CLUSTER_ID = "external_cluster_id";
  private String externalClusterId;

  public static final String JSON_PROPERTY_MANAGED = "managed";
  private Boolean managed;

  /**
   * Gets or Sets productCategory
   */
  public enum ProductCategoryEnum {
    ASSISTEDINSTALL("assistedInstall");

    private String value;

    ProductCategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductCategoryEnum fromValue(String value) {
      for (ProductCategoryEnum b : ProductCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRODUCT_CATEGORY = "product_category";
  private ProductCategoryEnum productCategory;

  /**
   * Gets or Sets productId
   */
  public enum ProductIdEnum {
    OCP("ocp"),
    
    OSD("osd"),
    
    OSDTRIAL("osdtrial"),
    
    MOA("moa"),
    
    RHMI("rhmi");

    private String value;

    ProductIdEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductIdEnum fromValue(String value) {
      for (ProductIdEnum b : ProductIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRODUCT_ID = "product_id";
  private ProductIdEnum productId = ProductIdEnum.OSD;

  public static final String JSON_PROPERTY_QUOTA_VERSION = "quota_version";
  private String quotaVersion;

  public static final String JSON_PROPERTY_RESERVE = "reserve";
  private Boolean reserve;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<ReservedResource> resources = null;

  public ClusterAuthorizationRequest() { 
  }

  public ClusterAuthorizationRequest accountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
    return this;
  }

   /**
   * Get accountUsername
   * @return accountUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountUsername() {
    return accountUsername;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }


  public ClusterAuthorizationRequest availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Get availabilityZone
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityZone() {
    return availabilityZone;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public ClusterAuthorizationRequest byoc(Boolean byoc) {
    this.byoc = byoc;
    return this;
  }

   /**
   * Get byoc
   * @return byoc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BYOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getByoc() {
    return byoc;
  }


  @JsonProperty(JSON_PROPERTY_BYOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setByoc(Boolean byoc) {
    this.byoc = byoc;
  }


  public ClusterAuthorizationRequest cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public ClusterAuthorizationRequest cloudProviderId(String cloudProviderId) {
    this.cloudProviderId = cloudProviderId;
    return this;
  }

   /**
   * Get cloudProviderId
   * @return cloudProviderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudProviderId() {
    return cloudProviderId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudProviderId(String cloudProviderId) {
    this.cloudProviderId = cloudProviderId;
  }


  public ClusterAuthorizationRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public ClusterAuthorizationRequest disconnected(Boolean disconnected) {
    this.disconnected = disconnected;
    return this;
  }

   /**
   * Get disconnected
   * @return disconnected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisconnected() {
    return disconnected;
  }


  @JsonProperty(JSON_PROPERTY_DISCONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisconnected(Boolean disconnected) {
    this.disconnected = disconnected;
  }


  public ClusterAuthorizationRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ClusterAuthorizationRequest externalClusterId(String externalClusterId) {
    this.externalClusterId = externalClusterId;
    return this;
  }

   /**
   * Get externalClusterId
   * @return externalClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalClusterId() {
    return externalClusterId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalClusterId(String externalClusterId) {
    this.externalClusterId = externalClusterId;
  }


  public ClusterAuthorizationRequest managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getManaged() {
    return managed;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  public ClusterAuthorizationRequest productCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
    return this;
  }

   /**
   * Get productCategory
   * @return productCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }


  public ClusterAuthorizationRequest productId(ProductIdEnum productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductIdEnum getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductId(ProductIdEnum productId) {
    this.productId = productId;
  }


  public ClusterAuthorizationRequest quotaVersion(String quotaVersion) {
    this.quotaVersion = quotaVersion;
    return this;
  }

   /**
   * Get quotaVersion
   * @return quotaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuotaVersion() {
    return quotaVersion;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotaVersion(String quotaVersion) {
    this.quotaVersion = quotaVersion;
  }


  public ClusterAuthorizationRequest reserve(Boolean reserve) {
    this.reserve = reserve;
    return this;
  }

   /**
   * Get reserve
   * @return reserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESERVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReserve() {
    return reserve;
  }


  @JsonProperty(JSON_PROPERTY_RESERVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReserve(Boolean reserve) {
    this.reserve = reserve;
  }


  public ClusterAuthorizationRequest resources(List<ReservedResource> resources) {
    this.resources = resources;
    return this;
  }

  public ClusterAuthorizationRequest addResourcesItem(ReservedResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReservedResource> getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(List<ReservedResource> resources) {
    this.resources = resources;
  }


  /**
   * Return true if this ClusterAuthorizationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterAuthorizationRequest clusterAuthorizationRequest = (ClusterAuthorizationRequest) o;
    return Objects.equals(this.accountUsername, clusterAuthorizationRequest.accountUsername) &&
        Objects.equals(this.availabilityZone, clusterAuthorizationRequest.availabilityZone) &&
        Objects.equals(this.byoc, clusterAuthorizationRequest.byoc) &&
        Objects.equals(this.cloudAccountId, clusterAuthorizationRequest.cloudAccountId) &&
        Objects.equals(this.cloudProviderId, clusterAuthorizationRequest.cloudProviderId) &&
        Objects.equals(this.clusterId, clusterAuthorizationRequest.clusterId) &&
        Objects.equals(this.disconnected, clusterAuthorizationRequest.disconnected) &&
        Objects.equals(this.displayName, clusterAuthorizationRequest.displayName) &&
        Objects.equals(this.externalClusterId, clusterAuthorizationRequest.externalClusterId) &&
        Objects.equals(this.managed, clusterAuthorizationRequest.managed) &&
        Objects.equals(this.productCategory, clusterAuthorizationRequest.productCategory) &&
        Objects.equals(this.productId, clusterAuthorizationRequest.productId) &&
        Objects.equals(this.quotaVersion, clusterAuthorizationRequest.quotaVersion) &&
        Objects.equals(this.reserve, clusterAuthorizationRequest.reserve) &&
        Objects.equals(this.resources, clusterAuthorizationRequest.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUsername, availabilityZone, byoc, cloudAccountId, cloudProviderId, clusterId, disconnected, displayName, externalClusterId, managed, productCategory, productId, quotaVersion, reserve, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterAuthorizationRequest {\n");
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    byoc: ").append(toIndentedString(byoc)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudProviderId: ").append(toIndentedString(cloudProviderId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    disconnected: ").append(toIndentedString(disconnected)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    externalClusterId: ").append(toIndentedString(externalClusterId)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quotaVersion: ").append(toIndentedString(quotaVersion)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
