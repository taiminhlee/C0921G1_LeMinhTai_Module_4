package vn.codegym.ung_dung_muon_sach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.ung_dung_muon_sach.model.Book;
import vn.codegym.ung_dung_muon_sach.model.CodeBook;
import vn.codegym.ung_dung_muon_sach.service.IBookService;
import vn.codegym.ung_dung_muon_sach.service.ICodeBookService;

@Controller
public class BookController {
    @Autowired
    IBookService bookService;

    @Autowired
    ICodeBookService codeBookService;

    @GetMapping("/list")
    public ModelAndView list(@PageableDefault(value = 3)Pageable pageable){
        return new ModelAndView("list","book",bookService.findAll(pageable));
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("book",bookService.findById(id));
        return "/view";
    }

    @PostMapping("/rent")
    public String rent(@ModelAttribute Book book, Model model){
        if (book.getQuantity()>0){
            double random=Math.random()*99999+10000;
            CodeBook codeBook=new CodeBook((long) random, book);
            model.addAttribute("code","book rental code is: " + (int)random);
            book.setQuantity(book.getQuantity()-1);
            codeBookService.save(codeBook);
            bookService.save(book);
            return "/view";
        }
        return "/view";
    }
}
