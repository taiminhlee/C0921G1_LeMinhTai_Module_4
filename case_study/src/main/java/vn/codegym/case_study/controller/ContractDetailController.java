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
import vn.codegym.case_study.dto.ContractDetailDto;
import vn.codegym.case_study.dto.ContractDto;
import vn.codegym.case_study.model.Contract;
import vn.codegym.case_study.model.ContractDetail;
import vn.codegym.case_study.service.attach_service.IAttachServiceService;
import vn.codegym.case_study.service.contract.IContractService;
import vn.codegym.case_study.service.contract_detail.IContractDetailService;
import vn.codegym.case_study.service.customer.ICustomerService;

@Controller
@RequestMapping("/contractDetail")
public class ContractDetailController {
    @Autowired
    private IContractDetailService contractDetailService;

    @Autowired
    private IContractService contractService;

    @Autowired
    private IAttachServiceService attachServiceService;

    @GetMapping
    public String showCreate(Model model){
        model.addAttribute("contract",contractService.findAll());
        model.addAttribute("attachService",attachServiceService.findAll());
        model.addAttribute("contractDetailDto",new ContractDetailDto());
        return "contract_detail/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated ContractDetailDto contractDetailDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("contract",contractService.findAll());
            model.addAttribute("attachService",attachServiceService.findAll());
            return "contract_detail/create";
        } else {
            ContractDetail contractDetail = new ContractDetail();
            BeanUtils.copyProperties(contractDetailDto, contractDetail);
            contractDetailService.save(contractDetail);
            redirectAttributes.addFlashAttribute("smg","Create Success");
            return "redirect:/contractDetail";
        }
    }
}
