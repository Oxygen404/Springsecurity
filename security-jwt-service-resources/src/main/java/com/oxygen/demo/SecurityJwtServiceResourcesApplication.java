package com.oxygen.demo;

import com.oxygen.demo.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan("com.oxygen.demo.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)
public class SecurityJwtServiceResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJwtServiceResourcesApplication.class, args);
    }

}
