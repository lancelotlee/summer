package com.sorlin.scan.destory;

/**
 * SpecifyDestroyBean
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class SpecifyDestroyBean {

    public String appTitle;

    SpecifyDestroyBean(String appTitle) {
        this.appTitle = appTitle;
    }

    void destroy() {
        this.appTitle = null;
    }
}