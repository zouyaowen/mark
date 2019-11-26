package com.top.suiyueran;

import java.time.LocalDateTime;

import org.junit.Test;

import top.suiyueran.mark.entity.UserDO;
import top.suiyueran.mark.response.CommonResponse;

public class MainTest {
	public static void main(String[] args) {
		CommonResponse<Object> commonResponse = new CommonResponse<>(200, "success");
		UserDO userDO = new UserDO();
		userDO.setId(2);
		userDO.setAge(22);
		userDO.setUserName("邹耀文");
		userDO.setGender(1);
		userDO.setCreateTime(LocalDateTime.now());
		userDO.setUpdateTime(LocalDateTime.now());
		commonResponse.success(userDO);
		System.out.println(commonResponse);
	}

	@Test
	public void test() {

	}
}
