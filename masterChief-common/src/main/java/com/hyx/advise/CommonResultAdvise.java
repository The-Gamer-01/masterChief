package com.hyx.advise;

import com.alibaba.fastjson.JSON;
import com.hyx.common.CommonResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 统一返回类切面.
 *
 * @author hyx
 **/

@RestControllerAdvice
public class CommonResultAdvise implements ResponseBodyAdvice<Object> {
    
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }
    
    /**
     * 统一返回类包装.
     * @param body 响应体
     * @param returnType 放回类型
     * @param selectedContentType 请求头类型.
     * @param selectedConverterType 请求头类型.
     * @param request 请求.
     * @param response 响应.
     * @return 封装完成的响应.
     */
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
            Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
            ServerHttpResponse response) {
        String returnClassType = returnType.getParameterType().getSimpleName();
        CommonResult result = null;
        if (Void.TYPE.getSimpleName().equals(returnClassType)) {
            result = CommonResult.success(null);
        } else if (String.class.getSimpleName().equals(returnClassType)) {
            result = CommonResult.success(body);
            return JSON.toJSONString(result);
        } else {
            result = CommonResult.success(body);
        }
        return result;
    }
}
