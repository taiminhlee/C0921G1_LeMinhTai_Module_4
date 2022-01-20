package vn.codegym.song.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.song.dto.SongDto;
import vn.codegym.song.model.Song;
import vn.codegym.song.service.ISongService;


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
    public ModelAndView showCreate() {
        return new ModelAndView("create", "songDto", new SongDto());
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated SongDto songDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
            redirectAttributes.addFlashAttribute("smg", "Create success");
            return "redirect:/list";
        }
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Integer id) {
        return new ModelAndView("edit", "songDto", songService.findById(id));
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute @Validated SongDto songDto,
                       BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "/edit";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
            redirectAttributes.addFlashAttribute("smg", "edit success");
            return "redirect:/list";
        }
    }
}
