package vn.codegym.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer serviceTypeId;
    private String serviceTypeName;

    @OneToMany(mappedBy = "serviceType")
    private List<Service> services;

    public ServiceType() {
    }

    public ServiceType(Integer serviceTypeId, String serviceTypeName, List<Service> services) {
        this.serviceTypeId = serviceTypeId;
        this.serviceTypeName = serviceTypeName;
        this.services = services;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
