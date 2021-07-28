package org.apereo.cas.config;

import org.apereo.cas.configuration.CasConfigurationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("CasOverlayOverrideConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class CasOverlayOverrideConfiguration {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public MyCustomBean myCustomBean(CasConfigurationProperties properties) {
        logger.info("secret---{}",properties.getTgc().isSecure());
        logger.info("tgt-name---{}",properties.getTgc().getName());
        return new MyCustomBean();
    }
}
