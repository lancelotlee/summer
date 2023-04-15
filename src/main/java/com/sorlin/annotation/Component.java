package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Component
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    /**
     * Bean name. Default to simple class name with first-letter-lowercase.
     */
    String value() default "";
}
