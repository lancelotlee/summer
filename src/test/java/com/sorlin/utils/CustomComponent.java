package com.sorlin.utils;

import com.sorlin.annotation.Component;

import java.lang.annotation.*;

/**
 * CustomComponent
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface CustomComponent {

    String value() default "";

}