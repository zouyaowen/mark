package top.suiyueran.mark.verify;

import java.util.HashMap;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.Data;
 
@Component
public class ValidatorUtil implements InitializingBean {
	
	private Validator validator;

	@Override
	public void afterPropertiesSet() throws Exception {
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}
	
	public VerifyResult validate(Object obj) {
		VerifyResult validationResult = new VerifyResult();
		Set<ConstraintViolation<Object>> constraintViolation = validator.validate(obj);
		if (constraintViolation.size() > 0) {
			validationResult.setHasErrors(true);
			constraintViolation.forEach(item -> {
				String errMsg = item.getMessage();
				String propetyName = item.getPropertyPath().toString();
				validationResult.getErrMsgMap().put(propetyName, errMsg);
			});
		}
		return validationResult;
	}
	
	public VerifyResult validateWithGroup(Object obj,Class<?>... clazz) {
		VerifyResult validationResult = new VerifyResult();
		Set<ConstraintViolation<Object>> constraintViolation = validator.validate(obj,clazz);
		if (constraintViolation.size() > 0) {
			validationResult.setHasErrors(true);
			constraintViolation.forEach(item -> {
				String errMsg = item.getMessage();
				String propetyName = item.getPropertyPath().toString();
				validationResult.getErrMsgMap().put(propetyName, errMsg);
			});
		}
		return validationResult;
	}
	
	@Data
	public static class VerifyResult{
		private boolean hasErrors = false;
		private HashMap<String, String> errMsgMap = new HashMap<String, String>();

		public String getErrMsg() {
			return String.join(",", errMsgMap.values());
		}
	}

}
