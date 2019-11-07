package top.suiyueran.mark.controller;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import top.suiyueran.mark.group.FirstGroup;
import top.suiyueran.mark.group.SecondGroup;
import top.suiyueran.mark.model.UserModel;
import top.suiyueran.mark.verify.ValidatorUtil;
import top.suiyueran.mark.verify.ValidatorUtil.VerifyResult;

@RestController
@Slf4j
public class VerifyController {

	@Autowired
	private ValidatorUtil validator;

	@GetMapping("/testVerify")
	public UserModel testVerify() {
		log.info("验证对象");
		UserModel userModel = new UserModel();
		userModel.setId(5);
		userModel.setUserName("邹耀文");
		VerifyResult validate = validator.validate(userModel);
		System.out.println(validate);
		VerifyResult validateWithGroup = validator.validateWithGroup(userModel, FirstGroup.class,SecondGroup.class);
		System.out.println(validateWithGroup);
		return userModel;
	}
}
