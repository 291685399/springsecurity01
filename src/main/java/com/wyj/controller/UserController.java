package com.wyj.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wyj
 * @create 2018-12-08 11:10
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {

    /**
     * 用户管理
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public String list() {
        return "user_list";
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123"));
    }

}
