package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Autowired
 *
 * @author lisongling 2023/4/16
 * @since 1.0.0
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {

    /**
     * Is required.
     */
    boolean value() default true;

    /**
     * Bean name if set.
     */
    String name() default "";
}