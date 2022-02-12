package vn.codegym.case_study.model;

public class AttachService {
    private int attachServiceId;
    private String attachServiceName;
    private double attachServiceCost;
    private int attachServiceUnit;
    private String attachServiceStatus;

    public AttachService(String attachServiceName, double attachServiceCost, int attachServiceUnit, String attachServiceStatus) {
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
    }

    public AttachService(int attachServiceId, String attachServiceName, double attachServiceCost, int attachServiceUnit, String attachServiceStatus) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
    }

    public AttachService(int id, String name, String status) {
        this.attachServiceId=id;
        this.attachServiceName=name;
        this.attachServiceStatus=status;
    }

    public AttachService(int attachServiceId) {
        this.attachServiceId=attachServiceId;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }

    @Override
    public String toString() {
        return "AttachService{" +
                "attachServiceId=" + attachServiceId +
                ", attachServiceName='" + attachServiceName + '\'' +
                ", attachServiceCost=" + attachServiceCost +
                ", attachServiceUnit=" + attachServiceUnit +
                ", attachServiceStatus='" + attachServiceStatus + '\'' +
                '}';
    }
}
