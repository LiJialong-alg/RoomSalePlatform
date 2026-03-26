package org.example.lease.web.admin.custom.config;

import org.example.lease.web.admin.custom.converter.StringToBaseEnumConverterFactory;
import org.example.lease.web.admin.custom.interceptor.AuthenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private StringToBaseEnumConverterFactory stringToBaseEnumConverterFactory;
    @Autowired
    private AuthenInterceptor authenInterceptor;
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(this.stringToBaseEnumConverterFactory);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.authenInterceptor).addPathPatterns("/admin/**").excludePathPatterns("/admin/login/**");
    }
}
