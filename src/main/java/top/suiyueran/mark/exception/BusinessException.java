package top.suiyueran.mark.exception;

import top.suiyueran.mark.error.BusinessError;
import top.suiyueran.mark.error.CommonError;

/**
 * 自定义业务异常
 * 
 * @author zyw
 *
 */
public class BusinessException extends RuntimeException implements CommonError {

	private static final long serialVersionUID = 1L;

	private BusinessError businessError;

	@Override
	public String getMessage() {
		return this.businessError.getErrMsg();
	}

	public BusinessException(BusinessError businessError) {
		super();
		this.businessError = businessError;
	}

	public BusinessException(BusinessError businessError, String errMessage) {
		super();
		this.businessError = businessError;
		this.businessError.setErrMsg(errMessage);
	}

	@Override
	public Integer getErrCode() {
		return this.businessError.getErrCode();
	}

	@Override
	public String getErrMsg() {
		return this.businessError.getErrMsg();
	}

	@Override
	public CommonError setErrMsg(String errMsg) {
		this.businessError.setErrMsg(errMsg);
		return this;
	}

}
