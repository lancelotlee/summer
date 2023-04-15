package com.sorlin.scan.init;

/**
 * SpecifyInitBean
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class SpecifyInitBean {

    String appTitle;

    String appVersion;

    public String appName;

    SpecifyInitBean(String appTitle, String appVersion) {
        this.appTitle = appTitle;
        this.appVersion = appVersion;
    }

    void init() {
        this.appName = this.appTitle + " / " + this.appVersion;
    }
}
