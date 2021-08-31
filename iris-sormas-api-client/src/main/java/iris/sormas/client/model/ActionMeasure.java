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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ActionMeasure
 */
public enum ActionMeasure {
  PROHIBITION_OF_ENTRY_AND_WORK_CASES("PROHIBITION_OF_ENTRY_AND_WORK_CASES"),
  SAMPLE_COLLECTION("SAMPLE_COLLECTION"),
  FORWARDING_TO_NATIONAL_REFERENCE_CENTER("FORWARDING_TO_NATIONAL_REFERENCE_CENTER"),
  CONTACT_FOLLOW_UP("CONTACT_FOLLOW_UP"),
  VERIFICATION_OF_VACCINATION_IMMUNIZATION("VERIFICATION_OF_VACCINATION_IMMUNIZATION"),
  POST_EXPOSURE_PROPHYLAXIS_VACCINATION("POST_EXPOSURE_PROPHYLAXIS_VACCINATION"),
  CLOSURE_OF_FACILITY("CLOSURE_OF_FACILITY"),
  PROHIBITION_OF_ENTRY_AND_WORK_CONTACTS("PROHIBITION_OF_ENTRY_AND_WORK_CONTACTS"),
  POPULATION_INFORMATION("POPULATION_INFORMATION"),
  OTHER("OTHER");

  private String value;

  ActionMeasure(String value) {
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
  public static ActionMeasure fromValue(String text) {
    for (ActionMeasure b : ActionMeasure.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
