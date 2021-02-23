//package com.athome.springbootwithmybatis.common.interceptor;
//
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.ArrayList;
//
///**
// * @Author:Zhaopo
// * @Date: 2021/1/18 20:53
// * @Description:
// */
//public class SessionInterceptor implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        ArrayList list = new ArrayList();
//        list.add("/user/toIndex");
//        list.add("/user/loginUser");
//        list.add("/user/toRegister");
//        list.add("/user/register");
//        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);//排除掉
//    }
//}
