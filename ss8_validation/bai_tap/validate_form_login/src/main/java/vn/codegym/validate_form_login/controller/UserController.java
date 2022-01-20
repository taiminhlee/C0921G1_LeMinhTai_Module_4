package vn.codegym.validate_form_login.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.validate_form_login.dto.UserDto;
import vn.codegym.validate_form_login.model.User;
import vn.codegym.validate_form_login.service.IUserService;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/create")
    public ModelAndView form(){
        return new ModelAndView("create","userDto",new UserDto());
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated UserDto userDto,
                         BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "/create";
        }else {
            User user =new User();
            BeanUtils.copyProperties(userDto,user);
            userService.save(user);
            model.addAttribute("smg","Login success");
            return "/success";
        }
    }
}
