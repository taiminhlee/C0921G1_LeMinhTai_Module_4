package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    @PostMapping("/convert")
    public String convert(@RequestParam int dollars, Model model) {
        model.addAttribute("result", dollars*23000 + " VND");
        return "index";
    }
    @GetMapping("/form")
    public String form(){
        return "index";
    }
}
