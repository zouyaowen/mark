package top.suiyueran.mark.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ApiController {

	@GetMapping("/getData")
	public void getData() {
		log.info("api/v1 getData获取成功请求数据,localDateTime={}", LocalDateTime.now());
	}

	@PostMapping("/postData")
	public void postData() {
		log.info("api/v1 postData获取成功请求数据,localDateTime={}", LocalDateTime.now());
	}
}
