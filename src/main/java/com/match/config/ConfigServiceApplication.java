package com.match.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author zhangchao
 * @Date 2019/7/31 17:08
 * @Version v1.0
 */
@Slf4j
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {

    public static void main(String[] args) {
        log.debug("ConfigServiceApplication startup main");
        SpringApplication application = new SpringApplication(ConfigServiceApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}