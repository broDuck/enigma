package com.broduck.enigma.controller;

import com.broduck.enigma.common.BroduckController;
import com.broduck.enigma.common.BroduckControllerRq;
import com.broduck.enigma.common.BroduckControllerRs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 홈 컨트롤러
 * Created by ydh0624 on 2017-03-27.
 */
@Controller
@RequestMapping(value = "/**")
public class HomeController extends BroduckController {

    /**
     * Main !!!
     * @param request
     * @param rq
     * @return
     */
    @RequestMapping(value = "main", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView main(HttpServletRequest request, BroduckControllerRq rq) {
        BroduckControllerRs rs = new BroduckControllerRs();
        ModelAndView mv = this.initModel(request, rq, rs);

        try {
            rs.setIsSuccess(true);
        } catch (Exception e) {
            rs.setResultMessage("요청 실패");
            rs.setIsSuccess(false);
        }

        return mv;
    }
}
