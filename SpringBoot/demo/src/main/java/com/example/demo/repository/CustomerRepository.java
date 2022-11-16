package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CustomerModel;

@Repository

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
	@Query(value="select * from Snad_customer where c_name=?1", nativeQuery = true)
    List<CustomerModel> findByCustomerName(String name);
	@Query(value="select * from Snad_customer where c_acc=?1", nativeQuery = true)
    List<CustomerModel> findByCustomerAcc(long acc);
}
