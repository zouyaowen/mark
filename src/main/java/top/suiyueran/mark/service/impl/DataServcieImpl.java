package top.suiyueran.mark.service.impl;

import java.time.LocalDateTime;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import top.suiyueran.mark.entity.UserDO;
import top.suiyueran.mark.service.DataServcie;

@Service
public class DataServcieImpl implements DataServcie {

	@Override
	@Cacheable(key = "#id", cacheNames = "user-id-info")
	public UserDO getDataById(Integer id) {
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setAge(22);
		userDO.setUserName("邹耀文");
		userDO.setGender(1);
		userDO.setCreateTime(LocalDateTime.now());
		userDO.setUpdateTime(LocalDateTime.now());
		return userDO;
	}

	@Override
	@Cacheable(key = "#userName", cacheNames = "user-name-info")
	public UserDO getDataByName(String userName) {
		UserDO userDO = new UserDO();
		userDO.setId(1);
		userDO.setAge(22);
		userDO.setUserName(userName);
		userDO.setGender(1);
		userDO.setCreateTime(LocalDateTime.now());
		userDO.setUpdateTime(LocalDateTime.now());
		return userDO;
	}

}
