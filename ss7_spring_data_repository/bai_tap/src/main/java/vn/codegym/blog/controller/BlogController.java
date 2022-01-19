package vn.codegym.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.service.blog.IBlogService;
import vn.codegym.blog.service.catetgory.ICategoryService;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    IBlogService blogService;

    @Autowired
    ICategoryService categoryService;

    @GetMapping("/list")
    public String list(@PageableDefault(value = 5)Pageable pageable,
                       Model model, Optional<String> name, Optional<Integer> categoryId  ){

        model.addAttribute("categoryList",categoryService.findAll());
        if (!name.isPresent() || name.get().equals("")){
            if (!categoryId.isPresent()){
                model.addAttribute("blog",blogService.findAll(pageable));
            }else {
                model.addAttribute("categoryId",categoryId.get());
                model.addAttribute("blog",blogService.findBlogByCategoryId(categoryId.get(), pageable));
            }
        }else if (!categoryId.isPresent()){
            model.addAttribute("name",name.get());
            model.addAttribute("blog",blogService.findByNameContaining(name.get(), pageable));
        }else {
            model.addAttribute("name",name.get());
            model.addAttribute("categoryId",categoryId.get());
            model.addAttribute("blog",blogService.findByNameContainingAndCategoryId(name.get(),
                    categoryId.get(),pageable));

        }
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("categoryList",categoryService.findAll());
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
        model.addAttribute("category",categoryService.findAll());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("smg","edit success");
        return "redirect:/list";
    }

}
