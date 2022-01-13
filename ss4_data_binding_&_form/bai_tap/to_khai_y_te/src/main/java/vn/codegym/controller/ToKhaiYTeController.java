package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.ToKhaiYTe;
import vn.codegym.service.IToKhaiYTeService;

import java.util.Map;

@Controller
public class ToKhaiYTeController {

    @Autowired
    IToKhaiYTeService iToKhaiYTeService;

    @GetMapping("/list")
    public ModelAndView list(){
        return new ModelAndView("/list","list", iToKhaiYTeService.list());
    }
    @GetMapping("/create")
    public String form(Model model){
        ToKhaiYTe toKhaiYTe=new ToKhaiYTe();
        model.addAttribute("thongTinDiLaiList",new String[] {"Tàu bay","Tàu thuyền","Ô tô","Khác(Ghi rõ)"});
        model.addAttribute("toKhaiYTe",toKhaiYTe);
        return "create";
    }
    @PostMapping("/created")
    public String create(@ModelAttribute ToKhaiYTe toKhaiYTe, RedirectAttributes redirectAttributes){
        iToKhaiYTeService.create(toKhaiYTe);
        redirectAttributes.addFlashAttribute("smg","Thêm thành công");
        return "redirect:/list";
    }
}
