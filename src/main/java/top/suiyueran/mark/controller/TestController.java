package top.suiyueran.mark.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Api(tags = "测试接口")
public class TestController {

	@GetMapping("/getData")
	@ApiOperation("Get请求获取数据")
	public void getData() {
		log.info("getData获取成功请求数据,localDateTime={}", LocalDateTime.now());
	}

	@ApiOperation("Post请求获取数据")
	@PostMapping("/postData")
	public void postData() {
		log.info("postData获取成功请求数据,localDateTime={}", LocalDateTime.now());
	}
}
