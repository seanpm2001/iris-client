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
 * Gets or Sets MedicallyAssociatedTransmissionMode
 */
public enum MedicallyAssociatedTransmissionMode {
  OPERATIVE_OR_DIAGNOSTIC_PROCEDURE("OPERATIVE_OR_DIAGNOSTIC_PROCEDURE"),
  BLOOD_PRODUCTS("BLOOD_PRODUCTS"),
  ORGAN_TRANSPLANTATION("ORGAN_TRANSPLANTATION"),
  DIALYSIS("DIALYSIS"),
  INJECTION_FOR_MEDICAL_PURPOSES("INJECTION_FOR_MEDICAL_PURPOSES");

  private String value;

  MedicallyAssociatedTransmissionMode(String value) {
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
  public static MedicallyAssociatedTransmissionMode fromValue(String text) {
    for (MedicallyAssociatedTransmissionMode b : MedicallyAssociatedTransmissionMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
