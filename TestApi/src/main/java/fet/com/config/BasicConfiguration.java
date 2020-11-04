package fet.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Configuration
@PropertySource(value = {"application-${spring.profiles.active}.properties" })
public class BasicConfiguration {
}
