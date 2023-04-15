package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Primary
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Primary {
}
