package vn.codegym.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.service.blog.IBlogService;
import vn.codegym.blog.service.category.ICategoryService;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    IBlogService<Blog> blogService;

    @Autowired
    ICategoryService<Category> categoryService;


    @GetMapping("/list")
        public ResponseEntity<List<Blog>> list() {
        List<Blog> blogs=(List<Blog>) blogService.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
        }

    @GetMapping("/search")
    public ResponseEntity<List<Blog>> findByName(@RequestParam String name){
        List<Blog> blogs= (List<Blog>) blogService.findByNameContaining(name);
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
    }

}
