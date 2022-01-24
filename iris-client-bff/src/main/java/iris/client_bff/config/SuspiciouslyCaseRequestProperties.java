package iris.client_bff.config;

import lombok.Value;

import javax.validation.constraints.Positive;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

/**
 * @author Jens Kutzsche
 */
@ConfigurationProperties(prefix = "iris.suspiciously.request.case")
@ConstructorBinding
@Validated
@Value
public class SuspiciouslyCaseRequestProperties {

	@Positive
	long dataWarningThreshold;

	@Positive
	long dataBlockingThreshold;
}
