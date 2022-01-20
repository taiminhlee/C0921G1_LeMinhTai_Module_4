package vn.codegym.validate_form_login.dto;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto {
    private Integer id;
    @NotBlank(message = "empty!!!")
    @Size(min = 5, max = 45, message = "from 5 to 45 characters")
    private String firstName;

    @NotBlank(message = "empty!!!")
    @Size(min = 5, max = 45, message = "from 5 to 45 characters")
    private String lastName;

    @NotBlank(message = "empty!!!")
    @Pattern(regexp = "^\\d{9,10}$",message = "wrong format")
    private String phoneNumber;

    @NotNull(message = "empty!!")
    @Min(value = 18, message = "18 and older")
    private Integer age;

    @Email(message = "wrong format")
    @NotEmpty(message = "empty!!!")
    private String email;

    public UserDto() {
    }

    public UserDto( @NotBlank @Size(min = 5, max = 45) String firstName, @NotBlank @Size(min = 5, max = 45) String lastName, String phoneNumber, @Size(min = 18) Integer age, @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
