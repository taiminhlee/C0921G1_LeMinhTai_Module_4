package vn.codegym.case_study.service.contract;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Contract;

import java.util.List;

@Service
public interface IContractService {
    void save(Contract contract);

    Page<Contract> customerUsing(Pageable pageable);

    List<Contract> findAll();
}
