package com.github.mask.mask.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Yang
 * @version 1.0
 * @date 2020/4/20 09:49
 * @description Mask 配置中心
 */
@EnableConfigServer
@SpringCloudApplication
public class MaskConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskConfigApplication.class, args);
    }
}
