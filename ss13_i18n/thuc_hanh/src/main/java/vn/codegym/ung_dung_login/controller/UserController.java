package vn.codegym.ung_dung_login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.ung_dung_login.model.User;
import vn.codegym.ung_dung_login.service.IUserService;

import java.util.Optional;

@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping
    public ModelAndView login(){
        return new ModelAndView("login","user",new User());
    }

    @PostMapping("/doLogin")
    public String success(@ModelAttribute User user, Model model){
        Optional<User> userOptional= userService.findByUserNameAndPassword(user.getUserName(),user.getPassword());
        if (userOptional.isPresent()){
            model.addAttribute("user",userOptional.get());
        }else {
            model.addAttribute("smg");
        }
        return "dashboard";
    }
}
