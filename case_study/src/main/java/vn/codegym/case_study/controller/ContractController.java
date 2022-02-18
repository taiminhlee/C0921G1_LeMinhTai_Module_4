package vn.codegym.case_study.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study.dto.ContractDto;
import vn.codegym.case_study.dto.EmployeeDto;
import vn.codegym.case_study.model.Contract;
import vn.codegym.case_study.model.Employee;
import vn.codegym.case_study.service.contract.IContractService;
import vn.codegym.case_study.service.customer.ICustomerService;
import vn.codegym.case_study.service.employee.IEmployeeService;
import vn.codegym.case_study.service.service.IServiceService;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService contractService;

    @Autowired
    ICustomerService customerService;

    @Autowired
    IEmployeeService employeeService;

    @Autowired
    IServiceService serviceService;

    @GetMapping
    public String showCreate(Model model){
        model.addAttribute("employee",employeeService.findAll());
        model.addAttribute("customer",customerService.findAll());
        model.addAttribute("service",serviceService.findAll());
        model.addAttribute("contractDto",new ContractDto());
        return "/contract/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated ContractDto contractDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new ContractDto().validate(contractDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("employee",employeeService.findAll());
            model.addAttribute("customer",customerService.findAll());
            model.addAttribute("service",serviceService.findAll());
            return "contract/create";
        } else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            contractService.save(contract);
            redirectAttributes.addFlashAttribute("smg","Create Success");
            return "redirect:/employee";
        }
    }
}
