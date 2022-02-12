package vn.codegym.case_study.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study.dto.CustomerDto;
import vn.codegym.case_study.model.Customer;
import vn.codegym.case_study.service.customer.ICustomerService;
import vn.codegym.case_study.service.customer_type.ICustomerTypeService;

import java.util.Optional;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @Autowired
    ICustomerTypeService customerTypeService;

    @GetMapping
    public String list(@PageableDefault(value = 5) Pageable pageable,
                       Model model, Optional<String> name, Optional<Long> customerTypeId  ){
        model.addAttribute("customerType",customerTypeService.findAll());
        if (!name.isPresent() || name.get().equals("")){
            if (!customerTypeId.isPresent()){
                model.addAttribute("customer",customerService.findAll(pageable));
            }else {
                model.addAttribute("customerTypeId",customerTypeId.get());
                model.addAttribute("customer",customerService.findByCustomerType_CustomerTypeId(customerTypeId.get(), pageable));
            }
        }else if (!customerTypeId.isPresent()){
            model.addAttribute("name",name.get());
            model.addAttribute("customer",customerService.findByCustomerNameContaining(name.get(), pageable));
        }else {
            model.addAttribute("name",name.get());
            model.addAttribute("customerTypeId",customerTypeId.get());
            model.addAttribute("customer",customerService.findByCustomerNameContainingAndCustomerType_CustomerTypeId(name.get(),
                    customerTypeId.get(),pageable));

        }
        return "customer/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable Long id){
        model.addAttribute("customer",customerService.findById(id));
        model.addAttribute("customerType",customerTypeService.findAll());
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("smg","edit success");
        return "redirect:/customer";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("customerDto",new CustomerDto());
        model.addAttribute("customerType",customerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated CustomerDto customerDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("smg","Create Success");
            return "redirect:/customer";
        }
    }
}
