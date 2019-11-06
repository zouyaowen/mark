package top.suiyueran.mark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MarkApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarkApplication.class, args);
	}
}
