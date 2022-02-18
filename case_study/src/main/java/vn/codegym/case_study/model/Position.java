package vn.codegym.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer positionId;
    private String positionName;
    @OneToMany(mappedBy = "position")
    private List<Employee> employees;

    public Position() {
    }

    public Position(Integer positionId, String positionName, List<Employee> employees) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.employees = employees;
    }

    public Position(Integer position) {
        this.positionId=position;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
