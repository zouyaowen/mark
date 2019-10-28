package top.suiyueran.mark.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	@Async
	public void run(ApplicationArguments args) throws Exception {
		log.info("--------MyApplicationRunner run--------");
		
	}
}
