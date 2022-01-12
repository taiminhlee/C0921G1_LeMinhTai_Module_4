package vn.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.models.Mailbox;

@Controller
public class MailboxController {

    @GetMapping("/")
    public ModelAndView form(){
        ModelAndView modelAndView=new ModelAndView("/home");
        modelAndView.addObject("mailbox",new Mailbox());
        modelAndView.addObject("language", new String[] {"English","Vietnamese","Chinese","Japanese"});
        modelAndView.addObject("pageSize", new String[] {"5","10","15","15","50","100"});
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("mailbox") Mailbox mailbox){
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("mailbox",mailbox);
        return modelAndView;
    }
}
