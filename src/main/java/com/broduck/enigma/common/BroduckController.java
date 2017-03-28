package com.broduck.enigma.common;

import com.broduck.enigma.model.LoginInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Broduck 최상위 컨트롤러
 * Created by ydh0624 on 2017-03-27.
 */
public class BroduckController extends MultiActionController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String REQUEST_KEY = "RQ";

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv;

        try {
            this.preHandleRequest(request);
            mv = super.handleRequest(request, response);
            this.postHandleRequest(request);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }


        return mv;
    }

    /**
     * 후처리
     * @param request
     */
    protected void postHandleRequest(HttpServletRequest request) throws Exception {
        logger.info("===== End Request Info =================================== {}", request.getAttribute(REQUEST_KEY));
    }

    /**
     * 모든 요청에 대한 전처리
     * @param request
     * @throws Exception
     */
    protected void preHandleRequest(HttpServletRequest request) throws Exception {
        String requestKey = REQUEST_KEY + "-" + UUID.randomUUID().toString().replaceAll("-", "");
        request.setAttribute(REQUEST_KEY, requestKey);
        logger.info("\n\n===============================================================================================================");
        logger.info("==== Start Request Info ========================================== {}", request.getAttribute(REQUEST_KEY));
        logger.info("KEY_RQ : {}", request.getAttribute(REQUEST_KEY));
        logger.info("getRequestURL : {}", request.getRequestURL().toString());
        logger.info("getRequestURI : {}", request.getRequestURI());
        logger.info("getRequestedSessionId : {}", request.getRequestedSessionId());
        logger.info("getContextPath : {}", request.getContextPath());
        logger.info("sessionTimeout : {}", request.getSession().getMaxInactiveInterval());
        logger.info("===== Start Request Info =================================");
    }

    /**
     * ModelAndView 에 login 정보를 담기 위함
     * @param request
     * @param rq
     * @param rs
     * @return
     */
    protected ModelAndView initModel(HttpServletRequest request, HttpServletResponse response, BroduckControllerRq rq, BroduckControllerRs rs) {
        HttpSession session = request.getSession();
        if (session != null) {
            LoginInfo loginInfo = (LoginInfo) session.getAttribute(LoginInfo.class.getName());
            rq.setLoginInfo(loginInfo);

            if (rq.getLoginInfo() != null)
                rq.setLoginSn(rq.getLoginInfo().getMemberSn());
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject(BroduckControllerRq.RQ_KEY, rq);
        mv.addObject(BroduckControllerRs.RS_KEY, rs);

        return mv;
    }

}
