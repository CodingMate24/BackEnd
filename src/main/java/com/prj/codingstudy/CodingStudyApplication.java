package com.prj.codingstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;

@Slf4j
@EnableJpaAuditing // Auditing 기능 활성화
@SpringBootApplication
public class CodingStudyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        Environment env = SpringApplication.run(CodingStudyApplication.class, args).getEnvironment();

        log.info("========================================================");
        log.info("app name       : " + env.getProperty("spring.application.name"));
        log.info("run profile    : " + env.getProperty("spring.profiles.active"));
        log.info("========================================================");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CodingStudyApplication.class);
    }
}
