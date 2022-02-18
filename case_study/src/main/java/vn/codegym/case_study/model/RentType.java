package vn.codegym.case_study.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rentTypeId;
    private String rentTypeName;
    private Double rentTypeCost;

    @OneToMany(mappedBy = "rentType")
    private List<Service> services;

    public RentType() {
    }

    public RentType(Integer rentTypeId, String rentTypeName, Double rentTypeCost) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public Double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(Double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }
}
