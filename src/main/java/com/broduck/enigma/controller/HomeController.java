package com.broduck.enigma.controller;

import com.broduck.enigma.common.BroduckController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 홈 컨트롤러
 * Created by ydh0624 on 2017-03-27.
 */


public class HomeController extends BroduckController {

    private String redirectPath;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.sendRedirect(request.getServletContext().getContextPath() + redirectPath);
        return null;
    }

    public String getRedirectPath() {
        return redirectPath;
    }

    public void setRedirectPath(String redirectPath) {
        this.redirectPath = redirectPath;
    }
}
