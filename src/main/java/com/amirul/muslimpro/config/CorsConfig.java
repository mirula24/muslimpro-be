package com.amirul.muslimpro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Mengizinkan semua path/endpoint
                .allowedOrigins("*") // Mengizinkan semua origin
                .allowedMethods("*") // Mengizinkan semua metode HTTP (GET, POST, PUT, DELETE, dll.)
                .allowedHeaders("*") // Mengizinkan semua header
                .allowCredentials(true); // Mengizinkan penggunaan credentials (cookie, authorization headers)
    }
}