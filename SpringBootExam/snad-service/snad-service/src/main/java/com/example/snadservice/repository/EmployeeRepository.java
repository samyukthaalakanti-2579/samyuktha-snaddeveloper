package com.example.snadservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.snadservice.model.EmployeeModel;

@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeModel, Long>{

	
	@Query(value="select * from snademployee where employee_name=?1", nativeQuery = true)
    List<EmployeeModel> findByEmployeeName(String name);
	

}
