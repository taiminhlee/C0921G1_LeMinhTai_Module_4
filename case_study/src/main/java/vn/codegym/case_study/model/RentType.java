package vn.codegym.case_study.model;

public class RentType {
    private int rentTypeId;
    private String rentTypeName;
    private double rentTypeCost;

    public RentType(String rentTypeName, double rentTypeCost) {
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
    }

    public RentType(int rentTypeId, String rentTypeName, double rentTypeCost) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
    }

    public RentType(int rentType) {
        this.rentTypeId=rentType;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    @Override
    public String toString() {
        return "RentType{" +
                "rentTypeId=" + rentTypeId +
                ", rentTypeName='" + rentTypeName + '\'' +
                ", rentTypeCost=" + rentTypeCost +
                '}';
    }
}
