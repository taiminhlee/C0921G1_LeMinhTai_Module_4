package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Song;
import vn.codegym.service.ISongService;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    ISongService songService;

    @GetMapping("/list")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Song> songList = songService.display();
        modelAndView.addObject("songList", songList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        return new ModelAndView("create","song",new Song());
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Song song, RedirectAttributes redirectAttributes){
        songService.create(song);
        redirectAttributes.addFlashAttribute("smg","Create success");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable int id){
        return new ModelAndView("create","song",songService.findOne(id));
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Song song, RedirectAttributes redirectAttributes){
        songService.delete(song);
        redirectAttributes.addFlashAttribute("smg","Delete success");
        return "redirect:/list";
    }
}
