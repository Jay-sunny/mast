package com.github.mask.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author Yang
 * @version 1.0
 * @date 2020/4/25 22:45
 * @description Mask 服务网关
 */
@SpringCloudApplication
public class MaskGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskGatewayApplication.class);
    }
}
