package com.java.user.config;

import org.springframework.context.annotation.*;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postApi(){
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
		
			}
	private Predicate<String> postPaths() {
		return or(regex("/user.*"), regex("/UserPortal/user.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("UserPortal API")
				.description("UserPoratal for User Management.")
				.termsOfServiceUrl("http://usermanagenet")
				.contact("Sudhir Pandey.").license("UserPortal License")
				.licenseUrl("sudhirpandey.java@gmail.com").version("1.0").build();
	}
}
