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
 * Gets or Sets PathogenTestResultType
 */
public enum PathogenTestResultType {
  INDETERMINATE("INDETERMINATE"),
  PENDING("PENDING"),
  NEGATIVE("NEGATIVE"),
  POSITIVE("POSITIVE"),
  NOT_DONE("NOT_DONE");

  private String value;

  PathogenTestResultType(String value) {
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
  public static PathogenTestResultType fromValue(String text) {
    for (PathogenTestResultType b : PathogenTestResultType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
