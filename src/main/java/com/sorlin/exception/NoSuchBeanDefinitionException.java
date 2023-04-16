package com.sorlin.exception;

/**
 * NoSuchBeanDefinitionException
 *
 * @author lisongling 2023/4/16
 * @since 1.0.0
 */
public class NoSuchBeanDefinitionException  extends BeanDefinitionException {

    public NoSuchBeanDefinitionException() {
    }

    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }
}
