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
 * Gets or Sets ExposureType
 */
public enum ExposureType {
  WORK("WORK"),
  TRAVEL("TRAVEL"),
  SPORT("SPORT"),
  VISIT("VISIT"),
  GATHERING("GATHERING"),
  HABITATION("HABITATION"),
  PERSONAL_SERVICES("PERSONAL_SERVICES"),
  BURIAL("BURIAL"),
  ANIMAL_CONTACT("ANIMAL_CONTACT"),
  OTHER("OTHER"),
  UNKNOWN("UNKNOWN");

  private String value;

  ExposureType(String value) {
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
  public static ExposureType fromValue(String text) {
    for (ExposureType b : ExposureType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
