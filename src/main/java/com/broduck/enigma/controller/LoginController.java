package com.broduck.enigma.controller;

import com.broduck.enigma.common.BroduckController;
import com.broduck.enigma.controller.rqrs.EnigmaControllerRq;
import com.broduck.enigma.controller.rqrs.EnigmaControllerRs;
import com.broduck.enigma.controller.rqrs.SigninProcessRq;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 로그인 관련 컨트롤러
 * Created by broduck on 2017. 3. 29..
 */
public class LoginController extends BroduckController {

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
            rs.setEmail(rq.getEmail());
            rs.setPassword(rq.getPassword());

            rs.setIsSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            rs.setIsSuccess(false);
        }

        return mv;
    }
}
