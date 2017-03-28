package com.broduck.enigma.controller;

import com.broduck.enigma.common.BroduckController;
import com.broduck.enigma.controller.rqrs.EnigmaControllerRq;
import com.broduck.enigma.controller.rqrs.EnigmaControllerRs;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 이러면 메인이냐
 * Created by broduck on 2017. 3. 28..
 */
public class MainController extends BroduckController {
    public ModelAndView readMain(HttpServletRequest request, HttpServletResponse response, EnigmaControllerRq rq) {
        EnigmaControllerRs rs = new EnigmaControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        rs.setIsSuccess(true);

        return mv;
    }

    public ModelAndView jsonTest(HttpServletRequest request, HttpServletResponse response, @RequestBody EnigmaControllerRq rq) {
        EnigmaControllerRs rs = new EnigmaControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            rs.setResultMessage(rq.getText());
            rs.setIsSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            rs.setIsSuccess(false);
        }

        return mv;
    }
}
