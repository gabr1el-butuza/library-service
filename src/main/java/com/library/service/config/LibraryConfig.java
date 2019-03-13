package com.library.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.library.service.api",
        "com.library.service.controller",
        "com.library.service.service",
        "com.library.service.repository"
})
@Import({DbConfig.class, WebSecurityConfig.class})
public class LibraryConfig {
}
