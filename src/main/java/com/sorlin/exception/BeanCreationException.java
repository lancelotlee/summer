package com.sorlin.exception;

/**
 * BeanCreationException
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class BeanCreationException extends BeansException{

    public BeanCreationException() {
    }

    public BeanCreationException(String message) {
        super(message);
    }

    public BeanCreationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanCreationException(Throwable cause) {
        super(cause);
    }
}
