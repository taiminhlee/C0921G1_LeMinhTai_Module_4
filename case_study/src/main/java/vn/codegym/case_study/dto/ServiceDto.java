package vn.codegym.case_study.dto;

import vn.codegym.case_study.model.RentType;
import vn.codegym.case_study.model.ServiceType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public class ServiceDto {
    @Pattern(regexp = "^DV-\\d{4}$", message ="wrong format")
    private String serviceId;

    private String serviceName;

    @Positive(message = "Not Negative")
    @NotNull(message = "Not empty")
    private Double serviceArea;

    @Positive(message = "Not Negative")
    @NotNull(message = "Not empty")
    private Double serviceCost;

    @Positive(message = "Not Negative")
    @NotNull(message = "Not empty")
    private Integer serviceMaxPeople;

    @NotNull(message = "Choose please")
    private RentType rentType;

    @NotNull(message = "Choose please")
    private ServiceType serviceType;

    private String standardRoom;
    private String descriptionOtherConvenience;

    @Positive(message = "Not Negative")
    @NotNull(message = "Not empty")
    private Double poolArea;

    @Positive(message = "Not Negative")
    @NotNull(message = "Not empty")
    private Integer numberOfFloors;

    public ServiceDto() {
    }

    public ServiceDto(String serviceId, String serviceName, Double serviceArea, Double serviceCost, Integer serviceMaxPeople, RentType rentType, ServiceType serviceType, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(Double serviceArea) {
        this.serviceArea = serviceArea;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Integer getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(Integer serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
