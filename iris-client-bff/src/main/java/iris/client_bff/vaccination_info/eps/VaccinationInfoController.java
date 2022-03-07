package iris.client_bff.vaccination_info.eps;

import iris.client_bff.core.validation.Base64;
import iris.client_bff.core.validation.NoSignOfAttack;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotBlank;

import org.springframework.web.server.ResponseStatusException;

import com.googlecode.jsonrpc4j.JsonRpcError;
import com.googlecode.jsonrpc4j.JsonRpcErrors;
import com.googlecode.jsonrpc4j.JsonRpcParam;

/**
 * @author Jens Kutzsche
 */
public interface VaccinationInfoController {

	@JsonRpcErrors({
			@JsonRpcError(exception = ResponseStatusException.class, code = -32600),
			@JsonRpcError(exception = ConstraintViolationException.class, code = -32600),
			@JsonRpcError(exception = InvalidPublicKeyException.class, code = -32600)
	})
	AnnouncementResultDto announceVaccinationInfoList(
			@JsonRpcParam(value = "announcementData") AnnouncementDataDto announcementData);

	// DTOs Announcement
	static record AnnouncementDataDto(@NotBlank @NoSignOfAttack String externalId,
			@NotBlank @Base64 @NoSignOfAttack String submitterPublicKey) {}

	static record AnnouncementResultDto(@NotBlank String hdPublicKey, @NotBlank String iv, @NotBlank String tokens) {}

	static record Tokens(@NotBlank String cat, @NotBlank String dat) {}
}
