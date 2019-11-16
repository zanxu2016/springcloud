package info.luckydog.server01.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ApplicationConfig
 *
 * @author eric
 * @since 2019/11/15
 */
@Component
@Data
public class ApplicationConfig {

    @Value("${server.port}")
    private String port;
}
