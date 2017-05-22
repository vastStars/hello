package hello.system.controllers;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zili.wang@hand-china.com 2017/5/22 15:09
 * @version 1.0
 * @name LoginController
 * @description
 **/
@Controller
public class LoginController implements InitializingBean {

    /**
     * 显示登陆界面.
     *
     * @param request
     *            HttpServletRequest
     * @param response
     *            HttpServletResponse
     * @return view
     */
    @RequestMapping(value = { "/login.html", "/login" })
    public void loginView(final HttpServletRequest request, final HttpServletResponse response) {
        System.out.println("success !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
