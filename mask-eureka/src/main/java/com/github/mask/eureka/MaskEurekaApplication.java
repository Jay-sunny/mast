package com.github.mask.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Yang
 * @version 1.0
 * @date 2020/4/19 19:23
 * @description Mask的服务中心
 */
@EnableEurekaServer
@SpringBootApplication
public class MaskEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskEurekaApplication.class, args);
    }

    @EnableWebSecurity
    public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
            super.configure(http);
        }
    }
}
