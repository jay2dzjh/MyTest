package com.megvii.demo.configuration;

import com.megvii.biz.core.interceptor.RequestInterceptor;
import com.megvii.biz.core.interceptor.TokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private TokenInterceptor tokenInterceptor;
    @Autowired
    private RequestInterceptor requestInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //不希望校验Token的接口要添加到excludePathPatterns
//    registry.addInterceptor(tokenInterceptor).addPathPatterns("/**")
//        .excludePathPatterns("/swagger-resources/**").excludePathPatterns("/v2/api-docs");
//    //打开注释即可实现权限的校验
//    //registry.addInterceptor(requestInterceptor);
//    super.addInterceptors(registry);
    }
}
