package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.models.Mailbox;
import vn.codegym.service.IMailboxService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailboxController {

    @Autowired
    IMailboxService mailboxService;

    @GetMapping("/home")
    public ModelAndView list(){
//        ModelAndView modelAndView=new ModelAndView("home");
        return new ModelAndView("/home","list",mailboxService.list());
    }

    @GetMapping("/edit/{email}")
    public String formEdit(@PathVariable String email, Model model){
        Mailbox mailbox=mailboxService.findOne(email);
        List<String> language=new ArrayList<>();
        language.add("English");
        language.add("Vietnamese");
        language.add("Chinese");
        language.add("Japanese");
        List<String> pageSize=new ArrayList<>();
        pageSize.add("5");
        pageSize.add("10");
        pageSize.add("15");
        pageSize.add("50");
        pageSize.add("100");
        model.addAttribute("mailbox",mailbox);
        model.addAttribute("languageList", language);
        model.addAttribute("pageSizeList", pageSize);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Mailbox mailbox,
                        RedirectAttributes redirectAttributes ){
        mailboxService.update(mailbox);
        redirectAttributes.addFlashAttribute("smg","success");
        return "redirect:/home";
    }
}
