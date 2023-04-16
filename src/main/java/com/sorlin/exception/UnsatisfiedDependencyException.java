package com.sorlin.exception;

/**
 * UnsatisfiedDependencyException
 *
 * @author lisongling 2023/4/16
 * @since 1.0.0
 */
public class UnsatisfiedDependencyException extends BeanCreationException{
    public UnsatisfiedDependencyException() {
    }

    public UnsatisfiedDependencyException(String message) {
        super(message);
    }

    public UnsatisfiedDependencyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsatisfiedDependencyException(Throwable cause) {
        super(cause);
    }

}
