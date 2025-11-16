package com.example.demo.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Demo API")
                        .description("This is a sample Spring Boot RESTful service using springdoc-openapi."))
                .servers(List.of(
                        new Server().url("http://localhost:8081").description("local"),
                        new Server().url("http://localhost:8082").description("live")
                ));
    }
}
