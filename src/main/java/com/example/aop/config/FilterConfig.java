package com.example.aop.config;

import com.example.aop.config.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Filter : HTTP 요청과 응답을 변경할 수 있는 재사용 가능 코드 (Web Application 에서 등록)
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<TestFilter> filterRegistrationBean() {
        FilterRegistrationBean<TestFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new TestFilter());
        registrationBean.addUrlPatterns("/filter/*");
        return registrationBean;
    }

}
