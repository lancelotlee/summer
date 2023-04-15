package com.sorlin.scan.nested;

import com.sorlin.annotation.Component;

/**
 * OuterBean
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Component
public class OuterBean {

    @Component
    public static class NestedBean {

    }
}
