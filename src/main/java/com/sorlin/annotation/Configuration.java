package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Configuration
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {

    /**
     * Bean name. Default to simple class name with first-letter-lower-case.
     */
    String value() default "";

}
