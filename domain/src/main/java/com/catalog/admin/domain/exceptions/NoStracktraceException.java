package com.catalog.admin.domain.exceptions;

/**
 * Classe criada para padrozinar o não encher a strack trace
 */
public class NoStracktraceException extends RuntimeException {

    public NoStracktraceException(final String message) {
        this(message, null);
    }

    public NoStracktraceException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}
