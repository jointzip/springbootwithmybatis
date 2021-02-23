//package com.athome.springbootwithmybatis.common.interceptor;
//
//import com.athome.springbootwithmybatis.entity.User;
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @Author:Zhaopo
// * @Date: 2021/1/18 20:32
// * @Description:
// */
//
////@Slf4j
//@Component
//public class UserInterceptor implements HandlerInterceptor {
//
////    private static final Logger logger= LoggerFactory.getLogger(UserInterceptor.class);
//    /*
//     * 进入controller层之前拦截请求
//     * 返回值：表示是否将当前的请求拦截下来  false：拦截请求，请求别终止。true：请求不被拦截，继续执行
//     * Object obj:表示被拦的请求的目标对象（controller中方法）
//     */
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("执行到了preHandle方法");
//        System.out.println(handler.toString());
//        User user = (User) request.getSession().getAttribute("session_user");
//        if(user == null){
//            //重定向回首页
//            response.sendRedirect(request.getContextPath() + "/user/toIndex");
//            System.out.println("已成功拦截并转发跳转");
//            return false;
//        }
//        System.out.println("符合要求，不需要拦截，放行");
//        return true;
//    }
//
//    /*
//     * 处理请求完成后视图渲染之前的处理操作
//     * 通过ModelAndView参数改变显示的视图，或发往视图的方法
//     */
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("执行了postHandler方法");
//    }
//
//    /*
//     * 视图渲染之后的操作
//     */
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("执行到了afterCompletion方法");
//    }
//}
