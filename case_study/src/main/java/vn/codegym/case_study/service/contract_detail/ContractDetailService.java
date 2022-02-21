package vn.codegym.case_study.service.contract_detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.ContractDetail;
import vn.codegym.case_study.repository.IContractDetailRepository;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService{
    @Autowired
    IContractDetailRepository contractDetailRepository;


    @Override
    public Page<ContractDetail> customerUsing(String name, String service, Pageable pageable) {
        return contractDetailRepository.customerUsing(name,service,pageable);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}
