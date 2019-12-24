package top.suiyueran.mark.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Profile("prod")
@ConditionalOnExpression("'${spring.profiles.active}'.equals('prod')")
public class SwaggerProdConf {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				// 生成api文档扫描路径
				.apis(RequestHandlerSelectors.basePackage("top.suiyueran.mark.controller.open")).paths(PathSelectors.any()).build().enable(true);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 页面标题
				.title("SpringBootDemo Api")
				// 作者
				.contact(new Contact("dukunbiao(null)", "https://github.com/dkbnull/SpringBootDemo", ""))
				// 版本号
				.version("1.0")
				// 描述
				.description("Base Java 1.8").build();
	}
}
