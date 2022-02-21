package vn.codegym.case_study.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study.dto.ServiceDto;
import vn.codegym.case_study.model.Service;
import vn.codegym.case_study.service.rent_type.IRentTypeService;
import vn.codegym.case_study.service.service.IServiceService;
import vn.codegym.case_study.service.service_type.IServiceTypeService;

import java.util.List;

@RequestMapping("/service")
@Controller
public class ServiceController {
    @Autowired
    IServiceService serviceService;

    @Autowired
    IServiceTypeService serviceTypeService;

    @Autowired
    IRentTypeService rentTypeService;

    @GetMapping
    public String showCreate(Model model){
        model.addAttribute("serviceDto",new ServiceDto());
        model.addAttribute("typeService", serviceTypeService.findAll());
        model.addAttribute("rentType",rentTypeService.findAll());
        return "/service/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated ServiceDto serviceDto, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model){
        List<String> serviceId = (List<String>) serviceService.listServiceId();
        if (bindingResult.hasFieldErrors()) {
            if (serviceId.contains(serviceDto.getServiceId())){
                model.addAttribute("error","id already exist");
            }
            model.addAttribute("serviceType", serviceTypeService.findAll());
            model.addAttribute("rentType", rentTypeService.findAll());
            return "service/create";
        } else {
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto, service);
            serviceService.create(service);
            redirectAttributes.addFlashAttribute("smg","Create Success");
            return "redirect:/service";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable String id,Model model){
        if (serviceService.viewService(id).isPresent()){
            model.addAttribute("service",serviceService.viewService(id).get());
            return "service/edit";
        }
       return "customer/customerUsing";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute @Validated ServiceDto serviceDto, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("serviceType", serviceTypeService.findAll());
            model.addAttribute("rentType", rentTypeService.findAll());
            return "service/edit";
        } else {
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto, service);
            serviceService.create(service);
            redirectAttributes.addFlashAttribute("smg","Edit Success");
            return "redirect:/customer/using";
        }
    }
}
