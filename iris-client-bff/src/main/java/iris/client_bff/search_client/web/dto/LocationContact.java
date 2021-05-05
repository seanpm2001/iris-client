/*
 * IRIS-Gateway API
 * ### Encryption of the data to be transmitted (contact data) In order to be not limited in the amount of data, a hybrid encryption with symmetric encryption of the data and asymmetric encryption of the symmetric key is used for the encryption of the contact data.    1. The apps and applications get the public key of the health department as a 4096-bit RSA key from the IRIS+ server. This key is base64-encoded similar to the Private Enhanced Mail (PEM) format but without key markers (-----BEGIN PUBLIC KEY----- / -----END PUBLIC KEY-----).   2. The app generates a 256-bit AES key.   3. The data is encrypted with this key (algorithm: AES/CBC/PKCS5Padding and 16 byte IV)   4. IV bytes are prepended to the cipher text. Those merged bytes represent the encrypted content.   5. The AES key must be encrypted with the public RSA key of the health department. (algorithm: RSA with Optimal Asymmetric Encryption Padding (OAEP) \"RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING\")   6. The encrypted AES key and the encrypted content must be transmitted base64 encoded.    #### Schematic sequence    ```   pubKeyEncryption = publicKeyFromBase64(givenPublicKey);   contentKey = generateAESKey();   iv = generateRandomBytes(16);    encrypted = contentKey.encrypt(content, \"AES/CBC/PKCS5Padding\", iv);   keyEncrypted = pubKeyEncryption.encrypt(contentKey, \"RSA/NONE/OAEPWithSHA3-256AndMGF1Padding\");    submissionDto.encryptedData = base64Encode(concat(iv,encrypted));   submissionDto.secret = base64Encode(keyEncrypted);   ``` 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: jens.kutzsche@gebea.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package iris.client_bff.search_client.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Kontaktperson des Standorts
 */
@ApiModel(description = "Kontaktperson des Standorts")
@JsonPropertyOrder({
		LocationContact.JSON_PROPERTY_OFFICIAL_NAME,
		LocationContact.JSON_PROPERTY_REPRESENTATIVE,
		LocationContact.JSON_PROPERTY_ADDRESS,
		LocationContact.JSON_PROPERTY_OWNER_EMAIL,
		LocationContact.JSON_PROPERTY_EMAIL,
		LocationContact.JSON_PROPERTY_PHONE
})
@JsonTypeName("LocationContact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
		date = "2021-05-03T15:54:40.838481+02:00[Europe/Berlin]")
public class LocationContact {
	public static final String JSON_PROPERTY_OFFICIAL_NAME = "officialName";
	private String officialName;

	public static final String JSON_PROPERTY_REPRESENTATIVE = "representative";
	private String representative;

	public static final String JSON_PROPERTY_ADDRESS = "address";
	private LocationAddress address;

	public static final String JSON_PROPERTY_OWNER_EMAIL = "ownerEmail";
	private String ownerEmail;

	public static final String JSON_PROPERTY_EMAIL = "email";
	private String email;

	public static final String JSON_PROPERTY_PHONE = "phone";
	private String phone;

	public LocationContact officialName(String officialName) {

		this.officialName = officialName;
		return this;
	}

	/**
	 * Offizieller Unternehmensname
	 * 
	 * @return officialName
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(example = "Darfichrein GmbH", value = "Offizieller Unternehmensname")
	@JsonProperty(JSON_PROPERTY_OFFICIAL_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getOfficialName() {
		return officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public LocationContact representative(String representative) {

		this.representative = representative;
		return this;
	}

	/**
	 * Ansprechpartner für dieses Unternehmen
	 * 
	 * @return representative
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(example = "Silke ", value = "Ansprechpartner für dieses Unternehmen")
	@JsonProperty(JSON_PROPERTY_REPRESENTATIVE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public LocationContact address(LocationAddress address) {

		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty(JSON_PROPERTY_ADDRESS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public LocationAddress getAddress() {
		return address;
	}

	public void setAddress(LocationAddress address) {
		this.address = address;
	}

	public LocationContact ownerEmail(String ownerEmail) {

		this.ownerEmail = ownerEmail;
		return this;
	}

	/**
	 * E-Mail des Inhabers
	 * 
	 * @return ownerEmail
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(example = "covid@restaurant.de", value = "E-Mail des Inhabers")
	@JsonProperty(JSON_PROPERTY_OWNER_EMAIL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public LocationContact email(String email) {

		this.email = email;
		return this;
	}

	/**
	 * ggf. E-Mail einer weiteren Kontaktperson
	 * 
	 * @return email
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(example = "covid2@restaurant.de", value = "ggf. E-Mail einer weiteren Kontaktperson")
	@JsonProperty(JSON_PROPERTY_EMAIL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocationContact phone(String phone) {

		this.phone = phone;
		return this;
	}

	/**
	 * Telefonnummer eines Ansprechpartners
	 * 
	 * @return phone
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(example = "die bleibt privat :-)", value = "Telefonnummer eines Ansprechpartners")
	@JsonProperty(JSON_PROPERTY_PHONE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LocationContact locationContact = (LocationContact) o;
		return Objects.equals(this.officialName, locationContact.officialName) &&
				Objects.equals(this.representative, locationContact.representative) &&
				Objects.equals(this.address, locationContact.address) &&
				Objects.equals(this.ownerEmail, locationContact.ownerEmail) &&
				Objects.equals(this.email, locationContact.email) &&
				Objects.equals(this.phone, locationContact.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(officialName, representative, address, ownerEmail, email, phone);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LocationContact {\n");
		sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
		sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
