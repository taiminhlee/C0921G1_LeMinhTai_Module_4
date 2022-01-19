package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Product;
import vn.codegym.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product,RedirectAttributes redirectAttributes) {
        productService.save(product);
       redirectAttributes.addFlashAttribute("success","Create success");
        return "redirect:/product";
    }

    @GetMapping("/{index}/update")
    public String update(@PathVariable int index, Model model) {
        model.addAttribute("product",productService.findByIndex(index) );
        return "update";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
       productService.update(product);
       redirectAttributes.addFlashAttribute("success","Edit success");
        return "redirect:/product";
    }
    @GetMapping("/{index}/delete")
    public String delete(@PathVariable int index, Model model) {
        model.addAttribute("product", productService.findByIndex(index));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.remove(product);
        redirectAttributes.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/product";
    }
    @GetMapping("/{index}/view")
    public String view(@PathVariable int index, Model model) {
        model.addAttribute("product", productService.findByIndex(index));
        return "/demo";
    }
}
