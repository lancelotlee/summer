package com.sorlin.scan.destory;

import com.sorlin.annotation.Bean;
import com.sorlin.annotation.Configuration;
import com.sorlin.annotation.Value;

/**
 * SpecifyDestroyConfiguration
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Configuration
public class SpecifyDestroyConfiguration {

    @Bean(destroyMethod = "destroy")
    SpecifyDestroyBean createSpecifyDestroyBean(@Value("${app.title}") String appTitle) {
        return new SpecifyDestroyBean(appTitle);
    }
}
