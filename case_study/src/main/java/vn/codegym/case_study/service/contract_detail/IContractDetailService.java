package vn.codegym.case_study.service.contract_detail;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.ContractDetail;

import java.util.List;

@Service
public interface IContractDetailService {

    Page<ContractDetail> customerUsing(String name, String service,Pageable pageable);

    void save(ContractDetail contractDetail);
}
