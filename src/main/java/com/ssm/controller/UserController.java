package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user", user);
        mv.setViewName("selectUser");
        return mv;
    }
    @RequestMapping("/loginform")
    public ModelAndView loginform() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("loginForm");
        return mv;
    }
    @RequestMapping("/login")
    public ModelAndView login() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

}
