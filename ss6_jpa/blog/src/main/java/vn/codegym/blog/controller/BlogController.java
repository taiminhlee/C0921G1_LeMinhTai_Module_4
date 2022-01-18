package vn.codegym.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.service.IBlogService;

@Controller
public class BlogController {

    @Autowired
    IBlogService blogService;

    @GetMapping("/list")
    public ModelAndView list(){
        return new ModelAndView("list","blog",blogService.findAll());
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("smg","creat success");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(Model model, @PathVariable Integer id){
        model.addAttribute("blog",blogService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.remove(blog);
        redirectAttributes.addFlashAttribute("smg","delete success");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable Integer id){
        model.addAttribute("blog",blogService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("smg","edit success");
        return "redirect:/list";
    }

}
