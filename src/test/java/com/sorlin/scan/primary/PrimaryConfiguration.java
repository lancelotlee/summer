package com.sorlin.scan.primary;

import com.sorlin.annotation.Bean;
import com.sorlin.annotation.Primary;

/**
 * PrimaryConfiguration
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class PrimaryConfiguration {

    @Primary
    @Bean
    DogBean husky() {
        return new DogBean("Husky");
    }

    @Bean
    DogBean teddy() {
        return new DogBean("Teddy");
    }

}
