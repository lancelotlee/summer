package com.sorlin.exception;

/**
 * BeanNotOfRequiredTypeException
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class BeanNotOfRequiredTypeException extends BeansException {

    public BeanNotOfRequiredTypeException() {
    }

    public BeanNotOfRequiredTypeException(String message) {
        super(message);
    }
}
