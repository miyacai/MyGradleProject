package org.gradle.third.patry.extensions;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configurable
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages={"org.gradle.rest.service"})
public class SpringWebSwaggerConfig {

	@Bean
	public Docket custonDocket() {
	      return new Docket(DocumentationType.SWAGGER_2);  
	}
}
