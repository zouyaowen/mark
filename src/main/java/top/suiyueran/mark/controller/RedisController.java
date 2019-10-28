package top.suiyueran.mark.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RedisController {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@GetMapping("/redisTest")
	public void redisTest() {
		log.info("-----------redisTest----------");
		// ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		opsForValue.set("aaa", "abc");
		redisTemplate.expire("aaa", 5, TimeUnit.MINUTES);
	}
}
