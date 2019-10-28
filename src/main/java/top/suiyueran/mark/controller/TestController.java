package top.suiyueran.mark.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@GetMapping("/getData")
	public void getData() {
		log.info("getData获取成功请求数据,localDateTime={}", LocalDateTime.now());
	}

	@PostMapping("/postData")
	public void postData() {
		log.info("postData获取成功请求数据,localDateTime={}", LocalDateTime.now());
	}
}
