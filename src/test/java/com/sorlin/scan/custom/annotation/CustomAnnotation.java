package com.sorlin.scan.custom.annotation;

import com.sorlin.annotation.Component;

import java.lang.annotation.*;

/**
 * CustomAnnotation
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface CustomAnnotation {

    String value() default "";

}