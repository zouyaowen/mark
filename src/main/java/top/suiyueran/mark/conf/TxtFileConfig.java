package top.suiyueran.mark.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix="wordsfile")
@Data
public class TxtFileConfig {
	private String path;
}
