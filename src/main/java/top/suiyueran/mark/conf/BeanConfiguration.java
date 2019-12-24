package top.suiyueran.mark.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import top.suiyueran.mark.model.TestBean;

@Configuration
//冒号后面指的是默认值
@ConditionalOnExpression("${test.enabled:false}")
public class BeanConfiguration {
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
}
