package vn.codegym.case_study.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @Autowired
    ICustomerTypeService customerTypeService;

    @GetMapping()
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
    public String showEdit(Model model, @PathVariable String id){
        Optional<Customer> customer=customerService.findById(id);
        if (customer.isPresent()){
            model.addAttribute("customerDto",customer.get());
            model.addAttribute("customerType",customerTypeService.findAll());
            return "customer/edit";
        }
        return "/customer/list";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute @Validated CustomerDto customerDto,
                       BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model) {
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType",customerTypeService.findAll());
            return "customer/edit";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customer.setCustomerStatus("1");
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("smg","Edit Success");
            return "redirect:/customer";
        }
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("customerDto",new CustomerDto());
        model.addAttribute("customerType",customerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated CustomerDto customerDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model) {
        new CustomerDto().validate(customerDto, bindingResult);
        List<String> customers=(List<String>) customerService.listIdCustomer();
        if (bindingResult.hasFieldErrors()) {
            if (customers.contains(customerDto.getCustomerId())){
                model.addAttribute("smg","id already exist");
            }
            model.addAttribute("customerType",customerTypeService.findAll());
            return "customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("smg","Create Success");
            return "redirect:/customer";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, RedirectAttributes redirectAttributes){
        Optional<Customer> customer =customerService.findById(id);
        customer.ifPresent(value -> customerService.delete(value));
        redirectAttributes.addFlashAttribute("smg","Delete success");
        return "redirect:/customer";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable String id, Model model){
        Optional<Customer> customer =customerService.findById(id);
        customer.ifPresent(value -> model.addAttribute("customer", value));
        return "customer/view";
    }
}
