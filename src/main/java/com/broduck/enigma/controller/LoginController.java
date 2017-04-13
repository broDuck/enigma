package com.broduck.enigma.controller;

import com.broduck.enigma.common.BroduckController;
import com.broduck.enigma.common.MessageException;
import com.broduck.enigma.controller.rqrs.EnigmaControllerRq;
import com.broduck.enigma.controller.rqrs.EnigmaControllerRs;
import com.broduck.enigma.controller.rqrs.SigninProcessRq;
import com.broduck.enigma.controller.rqrs.SignupProcessControllerRq;
import com.broduck.enigma.model.LoginInfo;
import com.broduck.enigma.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 로그인 관련 컨트롤러
 * Created by broduck on 2017. 3. 29..
 */
public class LoginController extends BroduckController {

    @Autowired
    private LoginService loginService;

    /**
     * 회원가입 페이지
     * @param request
     * @param response
     * @param rq
     * @return
     */
    public ModelAndView signup(HttpServletRequest request, HttpServletResponse response, EnigmaControllerRq rq) {
        EnigmaControllerRs rs = new EnigmaControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            rs.setIsSuccess(true);
        } catch (Exception e) {
            rs.setIsSuccess(false);
            rs.setResultMessage("요청 실패");
        }

        return mv;
    }

    public ModelAndView signupProcess(HttpServletRequest request, HttpServletResponse response, SignupProcessControllerRq rq) {
        EnigmaControllerRs rs = new EnigmaControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            loginService.signup(rq.getEmail(), rq.getPassword(), rq.getNickName(), rq.getAge(), rq.getMaleYn());

            rs.setIsSuccess(true);
        } catch (MessageException e) {
            rs.setResultMessage(e.getMessage());
            rs.setIsSuccess(false);
        } catch (Exception e) {
            e.printStackTrace();
            rs.setResultMessage("요청 실패");
            rs.setIsSuccess(false);
        }

        return mv;
    }

    /**
     * 로그인 페이지
     * @param request
     * @param response
     * @param rq
     * @return
     */
    public ModelAndView signin(HttpServletRequest request, HttpServletResponse response, EnigmaControllerRq rq) {
        EnigmaControllerRs rs = new EnigmaControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            HttpSession session = request.getSession(false);
            if (session != null) {
                LoginInfo loginInfo = (LoginInfo) session.getAttribute(LoginInfo.class.getName());
                if (loginInfo != null) {
                    response.sendRedirect("/");
                }
            }

            rs.setIsSuccess(true);
        } catch (Exception e) {
            rs.setIsSuccess(false);
            rs.setResultMessage("요청 실패");
        }

        return mv;
    }

    public ModelAndView signinProcess(HttpServletRequest request, HttpServletResponse response, @RequestBody SigninProcessRq rq) {
        EnigmaControllerRs rs = new EnigmaControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            loginService.signin(rq.getEmail(), rq.getPassword());
            HttpSession session = request.getSession(false);
            if (session != null) {
                LoginInfo loginInfo = loginService.readLoginInfo(rq.getEmail());

                session.setAttribute(loginInfo.getClass().getName(), loginInfo);
            }

            rs.setIsSuccess(true);
        } catch (MessageException e) {
            rs.setResultMessage(e.getMessage());
            rs.setIsSuccess(false);
        } catch (Exception e) {
            e.printStackTrace();
            rs.setIsSuccess(false);
        }

        return mv;
    }
}
