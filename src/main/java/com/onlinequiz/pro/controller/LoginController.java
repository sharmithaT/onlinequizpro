package com.onlinequiz.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @Autowired
    LoginController loginController;

    @RequestMapping(value = "/login")
    public ModelAndView login() {

        return new ModelAndView("Login");

    }
}
