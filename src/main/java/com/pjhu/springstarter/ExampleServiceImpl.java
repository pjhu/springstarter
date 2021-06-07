package com.pjhu.springstarter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    /**
     * ID
     */
    private String id;
    /**
     * ip
     */
    private String ip;


    @Override
    public ConfigureInfo configInfo() {
        return ConfigureInfo.builder()
                .id(this.id)
                .ip(this.ip).build();
    }
}
