package vn.codegym.case_study.model;

public class ContractDetail {
    private int id;
    private Contract contract;
    private AttachService attachService;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int id, Contract contract, AttachService attachService, int quantity) {
        this.id = id;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContractDetail(Contract contract, AttachService attachService, int quantity) {
        this.contract=contract;
        this.attachService=attachService;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ContractDetail{" +
                "id=" + id +
                ", contract=" + contract +
                ", attachService=" + attachService +
                ", quantity=" + quantity +
                '}';
    }
}
