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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study.dto.EmployeeDto;
import vn.codegym.case_study.model.Employee;
import vn.codegym.case_study.model.Position;
import vn.codegym.case_study.service.division.IDivisionService;
import vn.codegym.case_study.service.education_degree.IEducationDegreeService;
import vn.codegym.case_study.service.employee.IEmployeeService;
import vn.codegym.case_study.service.position.IPositionService;
import vn.codegym.case_study.service.position.PositionService;

import java.util.List;
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
                       Model model, @RequestParam(defaultValue = "") String name,
                       @RequestParam(defaultValue = "") String positionId,
                       @RequestParam(defaultValue = "") String divisionId,
                       @RequestParam(defaultValue = "") String educationDegreeId) {
        model.addAttribute("position", positionService.findAll());
        model.addAttribute("division", divisionService.findAll());
        model.addAttribute("education", educationDegreeService.findAll());
        model.addAttribute("employee", employeeService.findAll(pageable));
        if (!name.equals("") || !positionId.equals("") || !divisionId.equals("") || !educationDegreeId.equals("")) {
            model.addAttribute("employee", employeeService.search(name, positionId,
                    divisionId, educationDegreeId, pageable));
        }
        return "employee/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("position", positionService.findAll());
        model.addAttribute("division", divisionService.findAll());
        model.addAttribute("education", educationDegreeService.findAll());
        model.addAttribute("employeeDto", new EmployeeDto());
        return "employee/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated EmployeeDto employeeDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new EmployeeDto().validate(employeeDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("position", positionService.findAll());
            model.addAttribute("division", divisionService.findAll());
            model.addAttribute("education", educationDegreeService.findAll());
            return "employee/create";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employee.setEmployeeStatus("1");
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("smg","Create Success");
            return "redirect:/employee";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        Optional<Employee> employee = employeeService.findById(id);
        employee.ifPresent(value -> employeeService.delete(value));
        redirectAttributes.addFlashAttribute("smg", "Delete success");
        return "redirect:/employee";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable Long id){
        model.addAttribute("employee",employeeService.findById(id).get());
        model.addAttribute("position",positionService.findAll());
        model.addAttribute("division",divisionService.findAll());
        model.addAttribute("education",educationDegreeService.findAll());
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        employee.setEmployeeStatus("1");
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("smg","success edit");
        return "redirect:/employee";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model){
        Optional<Employee> employee =employeeService.findById(id);
        employee.ifPresent(value -> model.addAttribute("employee", value));
        return "employee/view";
    }
}