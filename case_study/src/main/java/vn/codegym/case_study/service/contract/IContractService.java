package vn.codegym.case_study.service.contract;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Contract;

@Service
public interface IContractService {
    void save(Contract contract);
}
