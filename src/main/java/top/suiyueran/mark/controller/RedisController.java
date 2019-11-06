package top.suiyueran.mark.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import top.suiyueran.mark.entity.UserDO;
import top.suiyueran.mark.service.DataServcie;

@RestController
@Slf4j
public class RedisController {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Autowired
	private DataServcie dataServcie;

	@GetMapping("/redisTest")
	public void redisTest() {
		log.info("-----------redisTest----------");
		// ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		opsForValue.set("aaa", "abc");
		redisTemplate.expire("aaa", 5, TimeUnit.MINUTES);
	}
	
	@PostMapping("/findByUserId")
	public UserDO findByUserId(Integer id) {
		UserDO dataById = dataServcie.getDataById(id);
		System.out.println(dataById);
		return dataById;
	}
	
	@PostMapping("/findByUserName")
	public UserDO findByUserId(String userName) {
		UserDO dataByName = dataServcie.getDataByName(userName);
		System.out.println(dataByName);
		return dataByName;
	}
}
