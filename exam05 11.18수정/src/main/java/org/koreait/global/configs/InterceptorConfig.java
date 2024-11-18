package org.koreait.global.configs;

import lombok.RequiredArgsConstructor;
import org.koreait.global.interceptors.CommonInterceptor;
import org.koreait.global.interceptors.MemberOnlyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
    private final CommonInterceptor commonInterceptor;
    private final MemberOnlyInterceptor memberOnlyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor); // /**동일 모든범위는 자주 사용하기때문에 생략가능함
                //.addPathPatterns("/**");

        registry.addInterceptor(memberOnlyInterceptor)
                .addPathPatterns("/mypage/**");
    }
}
