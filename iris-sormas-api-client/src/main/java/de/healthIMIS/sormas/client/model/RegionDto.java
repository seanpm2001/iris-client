/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.55.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.healthIMIS.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.healthIMIS.sormas.client.model.AreaReferenceDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * RegionDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class RegionDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("epidCode")
	private String epidCode = null;

	@JsonProperty("growthRate")
	private Float growthRate = null;

	@JsonProperty("archived")
	private Boolean archived = null;

	@JsonProperty("externalID")
	private String externalID = null;

	@JsonProperty("area")
	private AreaReferenceDto area = null;

	public RegionDto creationDate(Instant creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get creationDate
	 * 
	 * @return creationDate
	 **/
	@Schema(description = "")
	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public RegionDto changeDate(Instant changeDate) {
		this.changeDate = changeDate;
		return this;
	}

	/**
	 * Get changeDate
	 * 
	 * @return changeDate
	 **/
	@Schema(description = "")
	public Instant getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Instant changeDate) {
		this.changeDate = changeDate;
	}

	public RegionDto uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	/**
	 * Get uuid
	 * 
	 * @return uuid
	 **/
	@Schema(description = "")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public RegionDto name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@Schema(description = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RegionDto epidCode(String epidCode) {
		this.epidCode = epidCode;
		return this;
	}

	/**
	 * Get epidCode
	 * 
	 * @return epidCode
	 **/
	@Schema(description = "")
	public String getEpidCode() {
		return epidCode;
	}

	public void setEpidCode(String epidCode) {
		this.epidCode = epidCode;
	}

	public RegionDto growthRate(Float growthRate) {
		this.growthRate = growthRate;
		return this;
	}

	/**
	 * Get growthRate
	 * 
	 * @return growthRate
	 **/
	@Schema(description = "")
	public Float getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(Float growthRate) {
		this.growthRate = growthRate;
	}

	public RegionDto archived(Boolean archived) {
		this.archived = archived;
		return this;
	}

	/**
	 * Get archived
	 * 
	 * @return archived
	 **/
	@Schema(description = "")
	public Boolean isArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public RegionDto externalID(String externalID) {
		this.externalID = externalID;
		return this;
	}

	/**
	 * Get externalID
	 * 
	 * @return externalID
	 **/
	@Schema(description = "")
	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public RegionDto area(AreaReferenceDto area) {
		this.area = area;
		return this;
	}

	/**
	 * Get area
	 * 
	 * @return area
	 **/
	@Schema(description = "")
	public AreaReferenceDto getArea() {
		return area;
	}

	public void setArea(AreaReferenceDto area) {
		this.area = area;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RegionDto regionDto = (RegionDto) o;
		return Objects.equals(this.creationDate, regionDto.creationDate)
				&& Objects.equals(this.changeDate, regionDto.changeDate) && Objects.equals(this.uuid, regionDto.uuid)
				&& Objects.equals(this.name, regionDto.name) && Objects.equals(this.epidCode, regionDto.epidCode)
				&& Objects.equals(this.growthRate, regionDto.growthRate) && Objects.equals(this.archived, regionDto.archived)
				&& Objects.equals(this.externalID, regionDto.externalID) && Objects.equals(this.area, regionDto.area);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid, name, epidCode, growthRate, archived, externalID, area);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegionDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    epidCode: ").append(toIndentedString(epidCode)).append("\n");
		sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
		sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
		sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
		sb.append("    area: ").append(toIndentedString(area)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
