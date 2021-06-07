package com.pjhu.springstarter;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ConfigureInfo implements Serializable {

    /**
     * ID
     */
    private String id;
    /**
     * IP地址
     */
    private String ip;
}
