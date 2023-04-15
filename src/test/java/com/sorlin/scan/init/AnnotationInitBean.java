package com.sorlin.scan.init;

import com.sorlin.annotation.Component;
import com.sorlin.annotation.Value;
import jakarta.annotation.PostConstruct;

/**
 * AnnotationInitBean
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@Component
public class AnnotationInitBean {

    @Value("${app.title}")
    String appTitle;

    @Value("${app.version}")
    String appVersion;

    public String appName;

    @PostConstruct
    void init() {
        this.appName = this.appTitle + " / " + this.appVersion;
    }
}