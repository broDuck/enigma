package com.broduck.enigma.common;

import com.broduck.enigma.model.LoginInfo;
import com.google.gson.*;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.BooleanConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Broduck 최상위 컨트롤러
 * Created by ydh0624 on 2017-03-27.
 */
public class BroduckController extends MultiActionController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String REQUEST_KEY = "RQ";
    public static final String JSON_KEY = "rq";

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
        bindJsonToRq(request, rq);

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

    private void bindJsonToRq(HttpServletRequest request, BroduckControllerRq rq) {

        String parameter = request.getParameter(BroduckController.JSON_KEY);
        if( parameter != null && parameter.length() > 0 ) {
            try {
                Class<?> targetCls = rq.getClass();

                // 일반 param과 _jsonrq가 동시에 들어온 경우를 위한 process
                Object targetObj = null;
                boolean isTargeted = false;
                String targetName = request.getParameter("target");
                if( targetName != null ) {
                    Method[] methods = rq.getClass().getMethods();
                    for (int i = 0; i < methods.length; i++) {
                        Method mem = methods[i];
                        if( mem.getName().equalsIgnoreCase("get" + targetName) ) {
                            targetObj = mem.invoke(rq);
                            targetCls = targetObj.getClass();
                            isTargeted = true;
                            break;
                        }
                    }
                }


                // json 오브젝트 생성
                Object jsonRq = buildGson().fromJson(parameter, targetCls);
                if (jsonRq != null) {
                    if (!isTargeted) {
                        copyProperties(jsonRq, rq);
                    }
                    else if (targetObj != null) {
                        copyProperties(jsonRq, targetObj);
                    }
                }
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Gson buildGson(){
        final GsonBuilder builder = new GsonBuilder();

        builder.registerTypeAdapter(Boolean.class, new JsonSerializer<Boolean>() {
            /* (non-Javadoc)
             * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
             */
            @Override
            public JsonElement serialize(Boolean json, Type typeOfT, JsonSerializationContext context) {
                try {
                    return new JsonPrimitive(json);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

        });

        builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {

            /* (non-Javadoc)
             * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
             */
            @Override
            public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                try {

                    JsonPrimitive primitive = json.getAsJsonPrimitive();
                    if( primitive.isNumber() ){
                        Long val = Long.parseLong(json.getAsString());
                        return new Date(val);
                    }
                    else{

                        String str = primitive.getAsString();

                        if( str == null || str.isEmpty() || "".equals(str) ){
                            return null;
                        }

                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        Date date = formatter.parse(str);
                        return date;
                    }

                } catch (final Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });

        builder.registerTypeAdapter(Boolean.class, new JsonDeserializer<Boolean>() {

            /* (non-Javadoc)
             * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
             */
            @Override
            public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                try {

                    if( json.getAsJsonPrimitive().isNumber() ){
                        return json.getAsInt() == 1;
                    }
                    else{
                        return json.getAsBoolean();
                    }

                } catch (final Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });

        return builder.setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }

    public static <T> void copyProperties(T from , T to) {
        try {
            registerConverters();
            org.apache.commons.beanutils.BeanUtilsBean2.getInstance().copyProperties(to, from);
        }
        catch (Exception e) {

        }
    }

    private static void registerConverters(){
        BeanUtilsBean beanUtilsBean =org.apache.commons.beanutils.BeanUtilsBean2.getInstance();
        beanUtilsBean.getConvertUtils().register(new DateConverter(null), java.util.Date.class);
        beanUtilsBean.getConvertUtils().register(new BooleanConverter(null), Boolean.class);
        beanUtilsBean.getConvertUtils().register(new BigDecimalConverter(null), BigDecimal.class);
    }
}
