package com.sorlin.imported;

import com.sorlin.annotation.Bean;
import com.sorlin.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * ZonedDateConfiguration
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Configuration
public class ZonedDateConfiguration {

    @Bean
    ZonedDateTime startZonedDateTime() {
        return ZonedDateTime.now();
    }
}