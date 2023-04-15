package com.sorlin.exception;

/**
 * BeanDefinitionException
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class BeanDefinitionException extends BeansException{
    public BeanDefinitionException() {
    }

    public BeanDefinitionException(String message) {
        super(message);
    }

    public BeanDefinitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanDefinitionException(Throwable cause) {
        super(cause);
    }
}
