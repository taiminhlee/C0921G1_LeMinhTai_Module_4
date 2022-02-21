package vn.codegym.case_study.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Contract;
import vn.codegym.case_study.repository.IContractRepository;

import java.util.List;

@Service
public class ContractService implements IContractService{
    @Autowired
    IContractRepository contractRepository;
    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Page<Contract> customerUsing(Pageable pageable) {
        return contractRepository.customerUsing(pageable);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
