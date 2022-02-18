package vn.codegym.case_study.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import vn.codegym.case_study.model.Division;
import vn.codegym.case_study.model.EducationDegree;
import vn.codegym.case_study.model.Position;
import vn.codegym.case_study.model.User;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class EmployeeDto implements Validator {
    private Long employeeId;
    private String employeeName;

    private String employeeBirthday;

    @Pattern(regexp = "^(\\d{9}|\\d{12})$", message = "9 or 12 numbers")
    private String employeeIdCard;

    @NotNull(message = "Not empty")
    @Positive(message = "Not Negative")
    private Double employeeSalary;

    @Pattern(regexp = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91){1}\\d{7}$", message = "wrong format")
    private String employeePhone;

    @Email(message = "wrong format")
    private String employeeEmail;
    private String employeeAddress;

    @NotNull(message = "Choose please")
    private Position position;
    @NotNull(message = "Choose please")
    private EducationDegree educationDegree;
    @NotNull(message = "Choose please")
    private Division division;
    private User user;
    private String employeeStatus;

    public EmployeeDto() {
    }

    public EmployeeDto(Long employeeId, String employeeName, String employeeBirthday, String employeeIdCard, Double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, Position position, EducationDegree educationDegree, Division division, User user, String employeeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.user = user;
        this.employeeStatus = employeeStatus;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
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
        EmployeeDto employeeDto = (EmployeeDto) target;
        if (!isValid(employeeDto.employeeBirthday)) {
            errors.rejectValue("employeeBirthday", "birthday.employee", "wrong format");
        }
    }
}
