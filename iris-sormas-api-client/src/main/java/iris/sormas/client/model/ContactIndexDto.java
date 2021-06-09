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
import iris.sormas.client.model.CaseClassification;
import iris.sormas.client.model.CaseJurisdictionDto;
import iris.sormas.client.model.CaseReferenceDto;
import iris.sormas.client.model.ContactCategory;
import iris.sormas.client.model.ContactClassification;
import iris.sormas.client.model.ContactJurisdictionDto;
import iris.sormas.client.model.ContactProximity;
import iris.sormas.client.model.ContactStatus;
import iris.sormas.client.model.Disease;
import iris.sormas.client.model.FollowUpStatus;
import iris.sormas.client.model.SymptomJournalStatus;
import iris.sormas.client.model.Vaccination;
import java.time.OffsetDateTime;
import java.time.Instant;
/**
 * ContactIndexDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-08T06:53:38.737461+02:00[Europe/Berlin]")
public class ContactIndexDto {
  @JsonProperty("pseudonymized")
  private Boolean pseudonymized = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("caze")
  private CaseReferenceDto caze = null;

  @JsonProperty("disease")
  private Disease disease = null;

  @JsonProperty("diseaseDetails")
  private String diseaseDetails = null;

  @JsonProperty("lastContactDate")
  private Instant lastContactDate = null;

  @JsonProperty("contactProximity")
  private ContactProximity contactProximity = null;

  @JsonProperty("contactClassification")
  private ContactClassification contactClassification = null;

  @JsonProperty("contactStatus")
  private ContactStatus contactStatus = null;

  @JsonProperty("completeness")
  private Float completeness = null;

  @JsonProperty("followUpStatus")
  private FollowUpStatus followUpStatus = null;

  @JsonProperty("followUpUntil")
  private Instant followUpUntil = null;

  @JsonProperty("symptomJournalStatus")
  private SymptomJournalStatus symptomJournalStatus = null;

  @JsonProperty("vaccination")
  private Vaccination vaccination = null;

  @JsonProperty("contactOfficerUuid")
  private String contactOfficerUuid = null;

  @JsonProperty("reportDateTime")
  private Instant reportDateTime = null;

  @JsonProperty("contactCategory")
  private ContactCategory contactCategory = null;

  @JsonProperty("caseClassification")
  private CaseClassification caseClassification = null;

  @JsonProperty("visitCount")
  private Integer visitCount = null;

  @JsonProperty("externalID")
  private String externalID = null;

  @JsonProperty("externalToken")
  private String externalToken = null;

  @JsonProperty("regionName")
  private String regionName = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("caseRegionName")
  private String caseRegionName = null;

  @JsonProperty("caseDistrictName")
  private String caseDistrictName = null;

  @JsonProperty("jurisdiction")
  private ContactJurisdictionDto jurisdiction = null;

  @JsonProperty("caseJurisdiction")
  private CaseJurisdictionDto caseJurisdiction = null;

  @JsonProperty("districtUuid")
  private String districtUuid = null;

  public ContactIndexDto pseudonymized(Boolean pseudonymized) {
    this.pseudonymized = pseudonymized;
    return this;
  }

   /**
   * Get pseudonymized
   * @return pseudonymized
  **/
  @Schema(description = "")
  public Boolean isPseudonymized() {
    return pseudonymized;
  }

  public void setPseudonymized(Boolean pseudonymized) {
    this.pseudonymized = pseudonymized;
  }

  public ContactIndexDto uuid(String uuid) {
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

  public ContactIndexDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactIndexDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactIndexDto caze(CaseReferenceDto caze) {
    this.caze = caze;
    return this;
  }

   /**
   * Get caze
   * @return caze
  **/
  @Schema(description = "")
  public CaseReferenceDto getCaze() {
    return caze;
  }

  public void setCaze(CaseReferenceDto caze) {
    this.caze = caze;
  }

  public ContactIndexDto disease(Disease disease) {
    this.disease = disease;
    return this;
  }

   /**
   * Get disease
   * @return disease
  **/
  @Schema(description = "")
  public Disease getDisease() {
    return disease;
  }

  public void setDisease(Disease disease) {
    this.disease = disease;
  }

  public ContactIndexDto diseaseDetails(String diseaseDetails) {
    this.diseaseDetails = diseaseDetails;
    return this;
  }

   /**
   * Get diseaseDetails
   * @return diseaseDetails
  **/
  @Schema(description = "")
  public String getDiseaseDetails() {
    return diseaseDetails;
  }

  public void setDiseaseDetails(String diseaseDetails) {
    this.diseaseDetails = diseaseDetails;
  }

  public ContactIndexDto lastContactDate(Instant lastContactDate) {
    this.lastContactDate = lastContactDate;
    return this;
  }

   /**
   * Get lastContactDate
   * @return lastContactDate
  **/
  @Schema(description = "")
  public Instant getLastContactDate() {
    return lastContactDate;
  }

  public void setLastContactDate(Instant lastContactDate) {
    this.lastContactDate = lastContactDate;
  }

  public ContactIndexDto contactProximity(ContactProximity contactProximity) {
    this.contactProximity = contactProximity;
    return this;
  }

   /**
   * Get contactProximity
   * @return contactProximity
  **/
  @Schema(description = "")
  public ContactProximity getContactProximity() {
    return contactProximity;
  }

  public void setContactProximity(ContactProximity contactProximity) {
    this.contactProximity = contactProximity;
  }

  public ContactIndexDto contactClassification(ContactClassification contactClassification) {
    this.contactClassification = contactClassification;
    return this;
  }

   /**
   * Get contactClassification
   * @return contactClassification
  **/
  @Schema(description = "")
  public ContactClassification getContactClassification() {
    return contactClassification;
  }

  public void setContactClassification(ContactClassification contactClassification) {
    this.contactClassification = contactClassification;
  }

  public ContactIndexDto contactStatus(ContactStatus contactStatus) {
    this.contactStatus = contactStatus;
    return this;
  }

   /**
   * Get contactStatus
   * @return contactStatus
  **/
  @Schema(description = "")
  public ContactStatus getContactStatus() {
    return contactStatus;
  }

  public void setContactStatus(ContactStatus contactStatus) {
    this.contactStatus = contactStatus;
  }

  public ContactIndexDto completeness(Float completeness) {
    this.completeness = completeness;
    return this;
  }

   /**
   * Get completeness
   * @return completeness
  **/
  @Schema(description = "")
  public Float getCompleteness() {
    return completeness;
  }

  public void setCompleteness(Float completeness) {
    this.completeness = completeness;
  }

  public ContactIndexDto followUpStatus(FollowUpStatus followUpStatus) {
    this.followUpStatus = followUpStatus;
    return this;
  }

   /**
   * Get followUpStatus
   * @return followUpStatus
  **/
  @Schema(description = "")
  public FollowUpStatus getFollowUpStatus() {
    return followUpStatus;
  }

  public void setFollowUpStatus(FollowUpStatus followUpStatus) {
    this.followUpStatus = followUpStatus;
  }

  public ContactIndexDto followUpUntil(Instant followUpUntil) {
    this.followUpUntil = followUpUntil;
    return this;
  }

   /**
   * Get followUpUntil
   * @return followUpUntil
  **/
  @Schema(description = "")
  public Instant getFollowUpUntil() {
    return followUpUntil;
  }

  public void setFollowUpUntil(Instant followUpUntil) {
    this.followUpUntil = followUpUntil;
  }

  public ContactIndexDto symptomJournalStatus(SymptomJournalStatus symptomJournalStatus) {
    this.symptomJournalStatus = symptomJournalStatus;
    return this;
  }

   /**
   * Get symptomJournalStatus
   * @return symptomJournalStatus
  **/
  @Schema(description = "")
  public SymptomJournalStatus getSymptomJournalStatus() {
    return symptomJournalStatus;
  }

  public void setSymptomJournalStatus(SymptomJournalStatus symptomJournalStatus) {
    this.symptomJournalStatus = symptomJournalStatus;
  }

  public ContactIndexDto vaccination(Vaccination vaccination) {
    this.vaccination = vaccination;
    return this;
  }

   /**
   * Get vaccination
   * @return vaccination
  **/
  @Schema(description = "")
  public Vaccination getVaccination() {
    return vaccination;
  }

  public void setVaccination(Vaccination vaccination) {
    this.vaccination = vaccination;
  }

  public ContactIndexDto contactOfficerUuid(String contactOfficerUuid) {
    this.contactOfficerUuid = contactOfficerUuid;
    return this;
  }

   /**
   * Get contactOfficerUuid
   * @return contactOfficerUuid
  **/
  @Schema(description = "")
  public String getContactOfficerUuid() {
    return contactOfficerUuid;
  }

  public void setContactOfficerUuid(String contactOfficerUuid) {
    this.contactOfficerUuid = contactOfficerUuid;
  }

  public ContactIndexDto reportDateTime(Instant reportDateTime) {
    this.reportDateTime = reportDateTime;
    return this;
  }

   /**
   * Get reportDateTime
   * @return reportDateTime
  **/
  @Schema(description = "")
  public Instant getReportDateTime() {
    return reportDateTime;
  }

  public void setReportDateTime(Instant reportDateTime) {
    this.reportDateTime = reportDateTime;
  }

  public ContactIndexDto contactCategory(ContactCategory contactCategory) {
    this.contactCategory = contactCategory;
    return this;
  }

   /**
   * Get contactCategory
   * @return contactCategory
  **/
  @Schema(description = "")
  public ContactCategory getContactCategory() {
    return contactCategory;
  }

  public void setContactCategory(ContactCategory contactCategory) {
    this.contactCategory = contactCategory;
  }

  public ContactIndexDto caseClassification(CaseClassification caseClassification) {
    this.caseClassification = caseClassification;
    return this;
  }

   /**
   * Get caseClassification
   * @return caseClassification
  **/
  @Schema(description = "")
  public CaseClassification getCaseClassification() {
    return caseClassification;
  }

  public void setCaseClassification(CaseClassification caseClassification) {
    this.caseClassification = caseClassification;
  }

  public ContactIndexDto visitCount(Integer visitCount) {
    this.visitCount = visitCount;
    return this;
  }

   /**
   * Get visitCount
   * @return visitCount
  **/
  @Schema(description = "")
  public Integer getVisitCount() {
    return visitCount;
  }

  public void setVisitCount(Integer visitCount) {
    this.visitCount = visitCount;
  }

  public ContactIndexDto externalID(String externalID) {
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

  public ContactIndexDto externalToken(String externalToken) {
    this.externalToken = externalToken;
    return this;
  }

   /**
   * Get externalToken
   * @return externalToken
  **/
  @Schema(description = "")
  public String getExternalToken() {
    return externalToken;
  }

  public void setExternalToken(String externalToken) {
    this.externalToken = externalToken;
  }

  public ContactIndexDto regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * Get regionName
   * @return regionName
  **/
  @Schema(description = "")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public ContactIndexDto districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

   /**
   * Get districtName
   * @return districtName
  **/
  @Schema(description = "")
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public ContactIndexDto caseRegionName(String caseRegionName) {
    this.caseRegionName = caseRegionName;
    return this;
  }

   /**
   * Get caseRegionName
   * @return caseRegionName
  **/
  @Schema(description = "")
  public String getCaseRegionName() {
    return caseRegionName;
  }

  public void setCaseRegionName(String caseRegionName) {
    this.caseRegionName = caseRegionName;
  }

  public ContactIndexDto caseDistrictName(String caseDistrictName) {
    this.caseDistrictName = caseDistrictName;
    return this;
  }

   /**
   * Get caseDistrictName
   * @return caseDistrictName
  **/
  @Schema(description = "")
  public String getCaseDistrictName() {
    return caseDistrictName;
  }

  public void setCaseDistrictName(String caseDistrictName) {
    this.caseDistrictName = caseDistrictName;
  }

  public ContactIndexDto jurisdiction(ContactJurisdictionDto jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @Schema(description = "")
  public ContactJurisdictionDto getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(ContactJurisdictionDto jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public ContactIndexDto caseJurisdiction(CaseJurisdictionDto caseJurisdiction) {
    this.caseJurisdiction = caseJurisdiction;
    return this;
  }

   /**
   * Get caseJurisdiction
   * @return caseJurisdiction
  **/
  @Schema(description = "")
  public CaseJurisdictionDto getCaseJurisdiction() {
    return caseJurisdiction;
  }

  public void setCaseJurisdiction(CaseJurisdictionDto caseJurisdiction) {
    this.caseJurisdiction = caseJurisdiction;
  }

  public ContactIndexDto districtUuid(String districtUuid) {
    this.districtUuid = districtUuid;
    return this;
  }

   /**
   * Get districtUuid
   * @return districtUuid
  **/
  @Schema(description = "")
  public String getDistrictUuid() {
    return districtUuid;
  }

  public void setDistrictUuid(String districtUuid) {
    this.districtUuid = districtUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactIndexDto contactIndexDto = (ContactIndexDto) o;
    return Objects.equals(this.pseudonymized, contactIndexDto.pseudonymized) &&
        Objects.equals(this.uuid, contactIndexDto.uuid) &&
        Objects.equals(this.firstName, contactIndexDto.firstName) &&
        Objects.equals(this.lastName, contactIndexDto.lastName) &&
        Objects.equals(this.caze, contactIndexDto.caze) &&
        Objects.equals(this.disease, contactIndexDto.disease) &&
        Objects.equals(this.diseaseDetails, contactIndexDto.diseaseDetails) &&
        Objects.equals(this.lastContactDate, contactIndexDto.lastContactDate) &&
        Objects.equals(this.contactProximity, contactIndexDto.contactProximity) &&
        Objects.equals(this.contactClassification, contactIndexDto.contactClassification) &&
        Objects.equals(this.contactStatus, contactIndexDto.contactStatus) &&
        Objects.equals(this.completeness, contactIndexDto.completeness) &&
        Objects.equals(this.followUpStatus, contactIndexDto.followUpStatus) &&
        Objects.equals(this.followUpUntil, contactIndexDto.followUpUntil) &&
        Objects.equals(this.symptomJournalStatus, contactIndexDto.symptomJournalStatus) &&
        Objects.equals(this.vaccination, contactIndexDto.vaccination) &&
        Objects.equals(this.contactOfficerUuid, contactIndexDto.contactOfficerUuid) &&
        Objects.equals(this.reportDateTime, contactIndexDto.reportDateTime) &&
        Objects.equals(this.contactCategory, contactIndexDto.contactCategory) &&
        Objects.equals(this.caseClassification, contactIndexDto.caseClassification) &&
        Objects.equals(this.visitCount, contactIndexDto.visitCount) &&
        Objects.equals(this.externalID, contactIndexDto.externalID) &&
        Objects.equals(this.externalToken, contactIndexDto.externalToken) &&
        Objects.equals(this.regionName, contactIndexDto.regionName) &&
        Objects.equals(this.districtName, contactIndexDto.districtName) &&
        Objects.equals(this.caseRegionName, contactIndexDto.caseRegionName) &&
        Objects.equals(this.caseDistrictName, contactIndexDto.caseDistrictName) &&
        Objects.equals(this.jurisdiction, contactIndexDto.jurisdiction) &&
        Objects.equals(this.caseJurisdiction, contactIndexDto.caseJurisdiction) &&
        Objects.equals(this.districtUuid, contactIndexDto.districtUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pseudonymized, uuid, firstName, lastName, caze, disease, diseaseDetails, lastContactDate, contactProximity, contactClassification, contactStatus, completeness, followUpStatus, followUpUntil, symptomJournalStatus, vaccination, contactOfficerUuid, reportDateTime, contactCategory, caseClassification, visitCount, externalID, externalToken, regionName, districtName, caseRegionName, caseDistrictName, jurisdiction, caseJurisdiction, districtUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactIndexDto {\n");
    
    sb.append("    pseudonymized: ").append(toIndentedString(pseudonymized)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    caze: ").append(toIndentedString(caze)).append("\n");
    sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
    sb.append("    diseaseDetails: ").append(toIndentedString(diseaseDetails)).append("\n");
    sb.append("    lastContactDate: ").append(toIndentedString(lastContactDate)).append("\n");
    sb.append("    contactProximity: ").append(toIndentedString(contactProximity)).append("\n");
    sb.append("    contactClassification: ").append(toIndentedString(contactClassification)).append("\n");
    sb.append("    contactStatus: ").append(toIndentedString(contactStatus)).append("\n");
    sb.append("    completeness: ").append(toIndentedString(completeness)).append("\n");
    sb.append("    followUpStatus: ").append(toIndentedString(followUpStatus)).append("\n");
    sb.append("    followUpUntil: ").append(toIndentedString(followUpUntil)).append("\n");
    sb.append("    symptomJournalStatus: ").append(toIndentedString(symptomJournalStatus)).append("\n");
    sb.append("    vaccination: ").append(toIndentedString(vaccination)).append("\n");
    sb.append("    contactOfficerUuid: ").append(toIndentedString(contactOfficerUuid)).append("\n");
    sb.append("    reportDateTime: ").append(toIndentedString(reportDateTime)).append("\n");
    sb.append("    contactCategory: ").append(toIndentedString(contactCategory)).append("\n");
    sb.append("    caseClassification: ").append(toIndentedString(caseClassification)).append("\n");
    sb.append("    visitCount: ").append(toIndentedString(visitCount)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    externalToken: ").append(toIndentedString(externalToken)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    caseRegionName: ").append(toIndentedString(caseRegionName)).append("\n");
    sb.append("    caseDistrictName: ").append(toIndentedString(caseDistrictName)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    caseJurisdiction: ").append(toIndentedString(caseJurisdiction)).append("\n");
    sb.append("    districtUuid: ").append(toIndentedString(districtUuid)).append("\n");
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
