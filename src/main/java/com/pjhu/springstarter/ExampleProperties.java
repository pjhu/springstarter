package com.pjhu.springstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.pjhu.springstarter.ExampleProperties.DEFAULT_PREFIX;

@Data
@ConfigurationProperties(value = DEFAULT_PREFIX)
public class ExampleProperties {

    /**
     * PREFIX
     */
    public static final String DEFAULT_PREFIX = "com.pjhu.springstarter";
    /**
     * ID标识
     */
    private String id;

    /**
     * IP地址
     */
    private String ip;
}
