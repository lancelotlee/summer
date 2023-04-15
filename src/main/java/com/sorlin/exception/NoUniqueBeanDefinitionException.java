package com.sorlin.exception;

/**
 * NoUniqueBeanDefinitionException
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class NoUniqueBeanDefinitionException extends BeanDefinitionException {

    public NoUniqueBeanDefinitionException() {
    }

    public NoUniqueBeanDefinitionException(String message) {
        super(message);
    }
}