package vn.codegym.case_study.dto;

import vn.codegym.case_study.model.AttachService;
import vn.codegym.case_study.model.Contract;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ContractDetailDto {
    private Integer contract_detail_id;
    @NotNull(message = "choose please")
    private Contract contract;
    @NotNull(message = "choose please")
    private AttachService attachService;
    @Positive(message = "Not negative")
    @NotNull(message = "Not empty")
    private Integer quantity;

    public ContractDetailDto() {
    }

    public ContractDetailDto(Integer contract_detail_id,Contract contract,AttachService attachService,Integer quantity) {
        this.contract_detail_id = contract_detail_id;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public Integer getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(Integer contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
