package com.sorlin.scan.destory;

import com.sorlin.annotation.Component;
import com.sorlin.annotation.Value;
import jakarta.annotation.PreDestroy;

/**
 * AnnotationDestroyBean
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Component
public class AnnotationDestroyBean {

    @Value("${app.title}")
    public String appTitle;

    @PreDestroy
    void destroy() {
        this.appTitle = null;
    }
}