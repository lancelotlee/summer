package com.sorlin.imported;

import com.sorlin.annotation.Bean;
import com.sorlin.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * LocalDateConfiguration
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Configuration
public class LocalDateConfiguration {

    @Bean
    LocalDate startLocalDate() {
        return LocalDate.now();
    }

    @Bean
    LocalDateTime startLocalDateTime() {
        return LocalDateTime.now();
    }
}