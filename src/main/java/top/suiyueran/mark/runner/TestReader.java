package top.suiyueran.mark.runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestReader implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		/*InputStream inputStream = this.getClass().getResourceAsStream("words.txt");
		new Fi
		FileReader fr = new FileReader(inputStream);
		
		BufferedReader bf = new BufferedReader(fr);
		Stream<String> lines = bf.lines();
		List<String> collect = lines.collect(Collectors.toList());
		log.info("collect={}", collect);*/
	}

}
