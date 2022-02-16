package vn.codegym.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.spring_security.model.Blog;
import vn.codegym.spring_security.service.blog.IBlogService;


@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping
    public ModelAndView list(){
        return new ModelAndView("list","blogs",blogService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        return new ModelAndView("create","blog",new Blog());
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("smg","create success");
        return "redirect:/blog";
    }
}
