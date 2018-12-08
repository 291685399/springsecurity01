package com.wyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wyj
 * @create 2018-12-08 12:58
 */
@Controller
public class LoginController {

    /**
     * /login.shtml
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    /**
     * 登录失败处理方法
     *
     * @return
     */
    @RequestMapping("/login/fail")
    public String loginFail(Model model) {
        model.addAttribute("msg", "账号或密码不正确！");
        return "login";
    }

}
