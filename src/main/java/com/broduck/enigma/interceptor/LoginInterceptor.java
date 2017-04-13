package com.broduck.enigma.interceptor;

import com.broduck.enigma.model.LoginInfo;
import org.apache.ibatis.plugin.Intercepts;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 로그인 인터셉터
 * Created by ydh0624 on 2017-03-27.
 */

public class LoginInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);

        if (session == null) {
            response.sendRedirect("/login/signin");

            return false;
        }

        LoginInfo loginInfo = (LoginInfo)session.getAttribute(LoginInfo.class.getName());

        if (loginInfo == null) {
            response.sendRedirect("/login/signin");
            return false;
        }

        return super.preHandle(request, response, handler);
    }
}
