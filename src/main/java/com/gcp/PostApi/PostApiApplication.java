package com.gcp.PostApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gcp.PostApi.*" })
@EntityScan("com.gcp.PostApi.entity")
@EnableSwagger2
@Configuration
public class PostApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApiApplication.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Post Component").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.gcp.PostApi.controller")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Post APP- Component Layer Swagger")
				.description("Post APP- Component Layer Swagger").license("Apache License Version 2.0").licenseUrl("")
				.version("2.0").build();
	}
}
