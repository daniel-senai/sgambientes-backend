package org.sgambeintes.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

	private static final String EMAIL = "danielcs.senai@sistemafieg.org.br";
	private static final String URL = "https://github.com/daniel-senai";
	private static final String AUTOR = "Daniel Corrêa da Silva";
	private static final String VERSION = "1.0.0";
	private static final String DESCRICAO = "API Sistema de Gestão de ambientes";
	private static final String NOME_APP = "SG-Ambientes";
	private static final String PATH = "org.sgambeintes.api";


	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(PATH))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(buildApiInfo());
	}

	
	private ApiInfo buildApiInfo() {

		return new ApiInfoBuilder()
				.title(NOME_APP)
				.description(DESCRICAO)
				.version(VERSION)
				.contact(new Contact(AUTOR
						,URL
						,EMAIL)).build();
	}
}

