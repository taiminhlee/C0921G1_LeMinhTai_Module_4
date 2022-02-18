package vn.codegym.case_study.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import vn.codegym.case_study.model.Customer;
import vn.codegym.case_study.model.Employee;
import vn.codegym.case_study.model.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class ContractDto implements Validator {
    private Integer contractId;

    private String contractStartDate;
    private String contractEndDate;

    @Positive(message = "Not Negative")
    private Double contractDeposit;

    @Positive(message = "Not Negative")
    private Double contractTotalMoney;

    @NotNull(message = "Not empty")
    private Employee employee;

    @NotNull(message = "Not empty")
    private Customer customer;

    @NotNull(message = "Not empty")
    private Service service;

    public ContractDto() {
    }

    public ContractDto(Integer contractId, String contractStartDate, String contractEndDate, Double contractDeposit, Double contractTotalMoney, Employee employee, Customer customer, Service service) {
        this.contractId = contractId;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(Double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public Double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(Double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public static boolean isValid(final String date) {

        boolean valid = false;

        try {

            // ResolverStyle.STRICT for 30, 31 days checking, and also leap year.
            LocalDate.parse(date,
                    DateTimeFormatter.ofPattern("uuuu-MM-dd")
                            .withResolverStyle(ResolverStyle.STRICT)
            );

            valid = true;

        } catch (DateTimeParseException e) {
            e.printStackTrace();
            valid = false;
        }

        return valid;

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractDto contractDto =(ContractDto) target;
        if (! isValid(contractDto.contractStartDate)){
            errors.rejectValue("contractStartDate", "birthday.contract", "wrong format");
        }
        if (! isValid(contractDto.contractEndDate)){
            errors.rejectValue("contractEndDate", "birthday.contract", "wrong format");
        }
    }
}
