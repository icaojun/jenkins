package com.cj.jenkins.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        /*
        ParameterBuilder token = new ParameterBuilder();
        List<Parameter> parameterList = new ArrayList<>();
        token.name("token")
                .description("token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        parameterList.add(token.build());
        */
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("jenkins")
                .ignoredParameterTypes(HttpSession.class, HttpServletRequest.class, HttpServletResponse.class)
                .select()
                .apis(//Predicates.or(RequestHandlerSelectors.basePackage("com.jcbank.riskcontrol.*"),
                        RequestHandlerSelectors.basePackage("com.cj.jenkins"))//)
                .paths(PathSelectors.any())
                .build();
                //.globalOperationParameters(parameterList);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Jenkins 测试 0.1")
                .description("测试服务")
                .termsOfServiceUrl("https://www.cj.com/")
                .version("0.1")
                .build();
    }
}
