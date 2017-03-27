package com.broduck.enigma.view;

import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Text View
 * Created by broduck on 2017-03-27.
 */
public class TextView extends AbstractView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/plain");
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setHeader("Cache-Control", "no-cache");

        if (map != null) {
            Object rs = map.get("rs");
            if (rs instanceof Textable) {
                Textable textable = (Textable)rs;
                String text = textable.toText();
                httpServletResponse.setContentLength(text.getBytes("UTF-8").length);
                httpServletResponse.getWriter().print(text);
            }
        }

        httpServletResponse.flushBuffer();
    }
}
