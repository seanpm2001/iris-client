/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.61.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package iris.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import iris.sormas.client.model.DistrictReferenceDto;
import iris.sormas.client.model.RegionReferenceDto;
import java.time.OffsetDateTime;
import java.time.Instant;
/**
 * CommunityDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-08T06:53:38.737461+02:00[Europe/Berlin]")
public class CommunityDto {
  @JsonProperty("creationDate")
  private Instant creationDate = null;

  @JsonProperty("changeDate")
  private Instant changeDate = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("growthRate")
  private Float growthRate = null;

  @JsonProperty("region")
  private RegionReferenceDto region = null;

  @JsonProperty("district")
  private DistrictReferenceDto district = null;

  @JsonProperty("archived")
  private Boolean archived = null;

  @JsonProperty("externalID")
  private String externalID = null;

  public CommunityDto creationDate(Instant creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public Instant getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Instant creationDate) {
    this.creationDate = creationDate;
  }

  public CommunityDto changeDate(Instant changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Get changeDate
   * @return changeDate
  **/
  @Schema(description = "")
  public Instant getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(Instant changeDate) {
    this.changeDate = changeDate;
  }

  public CommunityDto uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public CommunityDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommunityDto growthRate(Float growthRate) {
    this.growthRate = growthRate;
    return this;
  }

   /**
   * Get growthRate
   * @return growthRate
  **/
  @Schema(description = "")
  public Float getGrowthRate() {
    return growthRate;
  }

  public void setGrowthRate(Float growthRate) {
    this.growthRate = growthRate;
  }

  public CommunityDto region(RegionReferenceDto region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public RegionReferenceDto getRegion() {
    return region;
  }

  public void setRegion(RegionReferenceDto region) {
    this.region = region;
  }

  public CommunityDto district(DistrictReferenceDto district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @Schema(description = "")
  public DistrictReferenceDto getDistrict() {
    return district;
  }

  public void setDistrict(DistrictReferenceDto district) {
    this.district = district;
  }

  public CommunityDto archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @Schema(description = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public CommunityDto externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * Get externalID
   * @return externalID
  **/
  @Schema(description = "")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunityDto communityDto = (CommunityDto) o;
    return Objects.equals(this.creationDate, communityDto.creationDate) &&
        Objects.equals(this.changeDate, communityDto.changeDate) &&
        Objects.equals(this.uuid, communityDto.uuid) &&
        Objects.equals(this.name, communityDto.name) &&
        Objects.equals(this.growthRate, communityDto.growthRate) &&
        Objects.equals(this.region, communityDto.region) &&
        Objects.equals(this.district, communityDto.district) &&
        Objects.equals(this.archived, communityDto.archived) &&
        Objects.equals(this.externalID, communityDto.externalID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, changeDate, uuid, name, growthRate, region, district, archived, externalID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunityDto {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
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
