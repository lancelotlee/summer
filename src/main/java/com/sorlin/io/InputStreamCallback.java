package com.sorlin.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * InputStreamCallback
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@FunctionalInterface
public interface InputStreamCallback<T> {

    T doWithInputStream(InputStream stream) throws IOException;
}
