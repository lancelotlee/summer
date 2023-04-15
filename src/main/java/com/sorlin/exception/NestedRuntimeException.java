package com.sorlin.exception;

/**
 * NestedRuntimeException
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class NestedRuntimeException extends RuntimeException {

    public NestedRuntimeException() {
    }

    public NestedRuntimeException(String message) {
        super(message);
    }

    public NestedRuntimeException(Throwable cause) {
        super(cause);
    }

    public NestedRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
