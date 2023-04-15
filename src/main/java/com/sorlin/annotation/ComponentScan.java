package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * ComponentScan
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ComponentScan {

    /**
     * Package names to scan. Default to current package.
     */
    String[] value() default {};

}
