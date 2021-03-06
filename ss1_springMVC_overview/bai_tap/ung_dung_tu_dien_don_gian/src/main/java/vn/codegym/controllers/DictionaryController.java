package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.service.DictionaryService;
import vn.codegym.service.IDictionaryService;

@Controller
public class DictionaryController {

    @Autowired
   private DictionaryService dictionaryService;

    @GetMapping("/")
    public String form(){
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String input, Model model){
       String output= dictionaryService.search(input);
       model.addAttribute("result",output);
       return "index";
    }
}
