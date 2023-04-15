package com.sorlin.scan.init;

import com.sorlin.annotation.Bean;
import com.sorlin.annotation.Configuration;
import com.sorlin.annotation.Value;

/**
 * SpecifyInitConfiguration
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Configuration
public class SpecifyInitConfiguration {

    @Bean(initMethod = "init")
    SpecifyInitBean createSpecifyInitBean(@Value("${app.title}") String appTitle, @Value("${app.version}") String appVersion) {
        return new SpecifyInitBean(appTitle, appVersion);
    }
}