package com.sorlin.annotation;

import java.lang.annotation.*;

/**
 * Import
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Import {

    Class<?>[] value();

}
