package vn.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.model.Calculator;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String calculator(){
        return "index";
    }
    @GetMapping("/result")
    public String result(@RequestParam("operator") String operator, @RequestParam("num1") Integer num1,
                         @RequestParam("num2") Integer num2, Model model){
        model.addAttribute("result", Calculator.calculate(num1,num2,operator));
        return "index";
    }
}
