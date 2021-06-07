package com.pjhu.springstarter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(value = ExampleProperties.class)
public class ExampleAutoConfigure {

    /**
     * 配置ExampleService
     *
     * @return {@link ExampleService}
     */
    @Bean
    @ConditionalOnMissingBean
    public ExampleService exampleService() {
        log.info("Config ExampleService Start...");
        ExampleServiceImpl service = new ExampleServiceImpl(properties.getId(), properties.getIp());
        log.info("Config ExampleService End.");
        return service;
    }

    /**
     * 注入ExampleProperties
     */
    private final ExampleProperties properties;

    public ExampleAutoConfigure(ExampleProperties properties) {
        this.properties = properties;
    }
}
