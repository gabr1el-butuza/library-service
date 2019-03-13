package com.library.service;

import com.library.service.config.LibraryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import({ LibraryConfig.class })
public class LibraryServiceServer {
    public static void main(String [] args) {
        SpringApplication.run(LibraryServiceServer.class, args);
    }
}
