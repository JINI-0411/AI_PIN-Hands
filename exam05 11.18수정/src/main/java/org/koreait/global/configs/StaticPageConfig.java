package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticPageConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/mypage/**") // 회원로그인을 해야만 사용가능하게 제한하기 위해 /**를 붙인거
               .setViewName("member/mypage");
    }
}
