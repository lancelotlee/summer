package com.sorlin.exception;

/**
 * BeansException
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class BeansException extends NestedRuntimeException {
    public BeansException() {
    }

    public BeansException(String message) {
        super(message);
    }

    public BeansException(Throwable cause) {
        super(cause);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
