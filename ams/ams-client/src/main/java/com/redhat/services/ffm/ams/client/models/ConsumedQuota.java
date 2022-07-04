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


package com.redhat.services.ffm.ams.client.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.redhat.services.ffm.ams.client.models.ConsumedQuotaAllOf;
import com.redhat.services.ffm.ams.client.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConsumedQuota
 */
@JsonPropertyOrder({
  ConsumedQuota.JSON_PROPERTY_HREF,
  ConsumedQuota.JSON_PROPERTY_ID,
  ConsumedQuota.JSON_PROPERTY_KIND,
  ConsumedQuota.JSON_PROPERTY_AVAILABILITY_ZONE_TYPE,
  ConsumedQuota.JSON_PROPERTY_BILLING_MODEL,
  ConsumedQuota.JSON_PROPERTY_BYOC,
  ConsumedQuota.JSON_PROPERTY_CLOUD_PROVIDER_ID,
  ConsumedQuota.JSON_PROPERTY_COUNT,
  ConsumedQuota.JSON_PROPERTY_ORGANIZATION_ID,
  ConsumedQuota.JSON_PROPERTY_PLAN_ID,
  ConsumedQuota.JSON_PROPERTY_RESOURCE_NAME,
  ConsumedQuota.JSON_PROPERTY_RESOURCE_TYPE,
  ConsumedQuota.JSON_PROPERTY_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumedQuota {
  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_AVAILABILITY_ZONE_TYPE = "availability_zone_type";
  private String availabilityZoneType;

  public static final String JSON_PROPERTY_BILLING_MODEL = "billing_model";
  private String billingModel;

  public static final String JSON_PROPERTY_BYOC = "byoc";
  private Boolean byoc;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER_ID = "cloud_provider_id";
  private String cloudProviderId;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  public static final String JSON_PROPERTY_PLAN_ID = "plan_id";
  private String planId;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public ConsumedQuota() { 
  }

  public ConsumedQuota href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public ConsumedQuota id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ConsumedQuota kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public ConsumedQuota availabilityZoneType(String availabilityZoneType) {
    this.availabilityZoneType = availabilityZoneType;
    return this;
  }

   /**
   * Get availabilityZoneType
   * @return availabilityZoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityZoneType() {
    return availabilityZoneType;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityZoneType(String availabilityZoneType) {
    this.availabilityZoneType = availabilityZoneType;
  }


  public ConsumedQuota billingModel(String billingModel) {
    this.billingModel = billingModel;
    return this;
  }

   /**
   * Get billingModel
   * @return billingModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingModel() {
    return billingModel;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingModel(String billingModel) {
    this.billingModel = billingModel;
  }


  public ConsumedQuota byoc(Boolean byoc) {
    this.byoc = byoc;
    return this;
  }

   /**
   * Get byoc
   * @return byoc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BYOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getByoc() {
    return byoc;
  }


  @JsonProperty(JSON_PROPERTY_BYOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setByoc(Boolean byoc) {
    this.byoc = byoc;
  }


  public ConsumedQuota cloudProviderId(String cloudProviderId) {
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


  public ConsumedQuota count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public ConsumedQuota organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public ConsumedQuota planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public ConsumedQuota resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceName() {
    return resourceName;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public ConsumedQuota resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public ConsumedQuota version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this ConsumedQuota object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumedQuota consumedQuota = (ConsumedQuota) o;
    return Objects.equals(this.href, consumedQuota.href) &&
        Objects.equals(this.id, consumedQuota.id) &&
        Objects.equals(this.kind, consumedQuota.kind) &&
        Objects.equals(this.availabilityZoneType, consumedQuota.availabilityZoneType) &&
        Objects.equals(this.billingModel, consumedQuota.billingModel) &&
        Objects.equals(this.byoc, consumedQuota.byoc) &&
        Objects.equals(this.cloudProviderId, consumedQuota.cloudProviderId) &&
        Objects.equals(this.count, consumedQuota.count) &&
        Objects.equals(this.organizationId, consumedQuota.organizationId) &&
        Objects.equals(this.planId, consumedQuota.planId) &&
        Objects.equals(this.resourceName, consumedQuota.resourceName) &&
        Objects.equals(this.resourceType, consumedQuota.resourceType) &&
        Objects.equals(this.version, consumedQuota.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, id, kind, availabilityZoneType, billingModel, byoc, cloudProviderId, count, organizationId, planId, resourceName, resourceType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumedQuota {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    availabilityZoneType: ").append(toIndentedString(availabilityZoneType)).append("\n");
    sb.append("    billingModel: ").append(toIndentedString(billingModel)).append("\n");
    sb.append("    byoc: ").append(toIndentedString(byoc)).append("\n");
    sb.append("    cloudProviderId: ").append(toIndentedString(cloudProviderId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
