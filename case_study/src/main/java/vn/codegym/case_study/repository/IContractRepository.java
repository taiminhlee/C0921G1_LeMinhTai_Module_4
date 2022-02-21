package vn.codegym.case_study.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.Contract;

@Repository
public interface IContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value="select att.attach_service_name, att.attach_service_cost, att.attach_service_unit, att.attach_service_status, c.customer_name\n" +
            "from customer as c\n" +
            "inner join contract as con on con.customer_id=c.customer_id\n" +
            "left join contract_detail as cond on cond.contract_id=con.contract_id\n" +
            "left join attach_service as att on cond.attach_service_id=att.attach_service_id\n" +
            "where c.customer_status=1",nativeQuery=true)
    Page<Contract> customerUsing(Pageable pageable);
}
