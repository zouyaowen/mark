package top.suiyueran.mark.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import top.suiyueran.mark.annotation.IgnoreResponseAdvice;
import top.suiyueran.mark.response.CommonResponse;

/**
 * @Author: zouyaowen
 * @Description:
 * @Date: 20:48 2019/8/05
 * @Modifyed by:
 */
@RestControllerAdvice("top.suiyueran.mark.controller")
@SuppressWarnings("unchecked")
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		if (returnType.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)) {
			return false;
		}
		if (returnType.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class)) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("static-access")
	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {

		CommonResponse<Object> res = new CommonResponse<>(200, "success");
		if (null == body) {
			return res;
		} else if (body instanceof CommonResponse) {
			res = (CommonResponse<Object>) body;
		} else {
			res.setData(body);
		}
		return res;
	}
}