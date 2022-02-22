package vn.codegym.case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @GetMapping("login")
    public ModelAndView login(){return new ModelAndView("login/login");}

    @GetMapping("403")
    public ModelAndView error(){return new ModelAndView("/login/403");}
}
