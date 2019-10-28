package top.suiyueran.mark.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import lombok.extern.slf4j.Slf4j;
import top.suiyueran.mark.conf.TxtFileConfig;
import top.suiyueran.mark.error.BusinessError;
import top.suiyueran.mark.exception.BusinessException;

//@Component
@Slf4j
public class FileLoadRunner implements CommandLineRunner {

	@Autowired
	private TxtFileConfig txtFileConfig;

	@Override
	@Async
	public void run(String... args) throws Exception {
		String path = txtFileConfig.getPath();
		System.out.println("path=" + path);
		Path path2 = Paths.get(path);
		System.out.println(path2);
		
		List<String> loadTxtFile = loadTxtFile(path);
		System.out.println(loadTxtFile);
		/*Paths.get(url)
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		List<String> collect = bufferedReader.lines().collect(Collectors.toList());
		System.out.println(collect);*/
	}

	private List<String> loadTxtFile(String path) throws FileNotFoundException {
		//URL uri = ResourceUtils.getURL(path);
		File file = ResourceUtils.getFile("classpath:words.txt");
		
		
		//File file = ResourceUtils.getFile(path);
		FileReader fileReader = new FileReader(file);
		try (BufferedReader br = new BufferedReader(fileReader)) {
			return br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			log.error("文件不存在", e);
			throw new BusinessException(BusinessError.UNKNOW_ERROR);
		}
		/*try (BufferedReader br = Files.newBufferedReader(Paths.get(url))) {
			return br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("文件不存在", e);
			throw new BusinessException(BusinessError.UNKNOW_ERROR);
		}*/
	}

}
