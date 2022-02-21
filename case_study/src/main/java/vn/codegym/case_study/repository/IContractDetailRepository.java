package vn.codegym.case_study.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.ContractDetail;

@Repository
public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    @Query(value="select *\n" +
            "from contract_detail as cond\n" +
            "inner join contract as con on con.contract_id=cond.contract_id\n" +
            "inner join customer c on c.customer_id=con.customer_id\n" +
            "inner join attach_service as att on cond.attach_service_id=att.attach_service_id\n" +
            "inner join service as ser on ser.service_id=con.service_id\n" +
            "where c.customer_status=1 and c.customer_name like %:name% and att.attach_service_name like %:service%",nativeQuery=true)
    Page<ContractDetail> customerUsing(@Param("name") String name, @Param("service") String service, Pageable pageable);
}