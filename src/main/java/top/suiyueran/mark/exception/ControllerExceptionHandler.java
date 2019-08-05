package top.suiyueran.mark.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.slf4j.Slf4j;
import top.suiyueran.mark.error.BusinessError;
import top.suiyueran.mark.response.CommonResponse;

@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

	/**
	 * @Desc 系统异常处理
	 * @param ex
	 * @return CommonResponse<?>
	 * @Author zyw
	 * @Date 2019年6月19日下午7:29:25
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public CommonResponse<?> handleRuntimeException(RuntimeException ex) {
		log.error("异常信息", ex);
		if (ex instanceof BusinessException) {
			BusinessException businessException = (BusinessException) ex;
			log.error("errMsg={}", businessException.getErrMsg());
			return CommonResponse.error(businessException);
		} else {
			log.error("errMsg={}", ex.getMessage());
			log.error("execption className={}", ex.getClass().getName());
			return CommonResponse.error(BusinessError.UNKNOW_ERROR);
		}
	}

	/**
	 * @Desc 捕获404错误
	 * @param ex
	 * @return CommonResponse<?>
	 * @Author zyw
	 * @Date 2019年6月26日下午11:24:01
	 */
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public CommonResponse<?> handleRuntimeException(NoHandlerFoundException ex) {
		log.error("404异常信息", ex);
		log.error("errMsg={}", ex.getMessage());
		return CommonResponse.error(BusinessError.REQUEST_URL_NOT_EXIST);
	}

	/**
	 * @Desc 捕获405错误
	 * @param ex
	 * @return CommonResponse<?>
	 * @Author zyw
	 * @Date 2019年6月26日下午11:23:47
	 */
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	public CommonResponse<?> handleRuntimeException(HttpRequestMethodNotSupportedException ex) {
		log.error("405异常信息", ex);
		log.error("errMsg={}", ex.getMessage());
		return CommonResponse.error(BusinessError.REQUEST_METHOD_NOT_ALLOWED);
	}

}
