package vn.codegym.case_study.model;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contractId;

    private String contractStartDate;
    private String contractEndDate;
    private Double contractDeposit;
    private Double contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "serviceId")
    private Service service;

    public Contract() {
    }

    public Contract(Integer id, String contractStartDate, String contractEndDate, Double contractDeposit, Double contractTotalMoney, Employee employee, Customer customer, Service service) {
        this.contractId = id;
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

    public void setContractStartDate(String startDate) {
        this.contractStartDate = startDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String endDate) {
        this.contractEndDate = endDate;
    }

    public Double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(Double deposit) {
        this.contractDeposit = deposit;
    }

    public Double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(Double totalMoney) {
        this.contractTotalMoney = totalMoney;
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
}
