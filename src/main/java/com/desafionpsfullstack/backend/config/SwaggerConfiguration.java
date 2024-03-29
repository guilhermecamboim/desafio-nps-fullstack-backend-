package com.desafionpsfullstack.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.desafionpsfullstack.backend"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo metadata () {
        return new ApiInfoBuilder()
                .title("API Modelo")
                .description("API de modelo para novos projetos")
                .version("1.0")
                .build();
    }
}
