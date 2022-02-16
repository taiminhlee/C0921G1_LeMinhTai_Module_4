package vn.codegym.case_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.case_study.service.division.IDivisionService;
import vn.codegym.case_study.service.education_degree.IEducationDegreeService;
import vn.codegym.case_study.service.employee.IEmployeeService;
import vn.codegym.case_study.service.position.IPositionService;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IPositionService positionService;
    @Autowired
    IDivisionService divisionService;
    @Autowired
    IEducationDegreeService educationDegreeService;

    @GetMapping
    public String list(@PageableDefault(value = 5) Pageable pageable,
                       Model model, Optional<String> name, Optional<Integer> positionId,
                       Optional<Long> divisionId, Optional<Long> educationDegreeId){
        model.addAttribute("position",positionService.findAll());
        model.addAttribute("division",divisionService.findAll());
        model.addAttribute("education",educationDegreeService.findAll());
        if (!name.isPresent() || name.get().equals("")){
            if (!positionId.isPresent()){
                model.addAttribute("employee",employeeService.findAll(pageable));
            }else {
                model.addAttribute("positionId",positionId.get());
                model.addAttribute("employee",employeeService.findByPosition_PositionId(positionId.get(), pageable));
            }
        }
        return "employee/list";
    }
}
