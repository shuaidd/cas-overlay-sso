package org.apereo.cas.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * 描述
 *
 * @author ddshuai
 * @date 2021-07-27 12:58
 **/

public class MyCustomBean implements InitializingBean {
    private String version;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterPropertiesSet() {
        this.version = "2.0.0";
        logger.info("MyCustomBean 初始化完成");
    }

    public String getVersion() {
        return version;
    }
}
