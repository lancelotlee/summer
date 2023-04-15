package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Value
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    String value();
}
