package vn.codegym.case_study.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Contract;
import vn.codegym.case_study.repository.IContractRepository;

@Service
public class ContractService implements IContractService{
    @Autowired
    IContractRepository contractRepository;
    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }
}
