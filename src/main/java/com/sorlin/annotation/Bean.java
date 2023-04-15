package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Bean
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bean {

    /**
     * Bean name. default to method name.
     */
    String value() default "";

    String initMethod() default "";

    String destroyMethod() default "";
}
