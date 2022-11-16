package com.example.snadservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.snadservice.dto.EmployeeDto;
import com.example.snadservice.model.EmployeeModel;
import com.example.snadservice.repository.EmployeeRepository;
  
@Component
public class EmployeeService {
    
    @Autowired
    EmployeeRepository er;

   public void saveMyData(EmployeeDto employeedto) {
        EmployeeModel em = new EmployeeModel();
        em.setEmployee_id(employeedto.getEmployee_id());
        em.setEmployee_name(employeedto.getEmployee_name());
        em.setEmployee_project(employeedto.getEmployee_project());
        em.setEmployee_sal(employeedto.getEmployee_sal());
        er.save(em);
    }
	  public List<EmployeeDto> getEmployeeRecords() {
	         Iterable<EmployeeModel> em = er.findAll();   //1( 2 to 100
	            List<EmployeeDto> edto = new ArrayList<EmployeeDto>();
	            for(EmployeeModel i:em)
	            {
	                edto.add(EmployeeDto.getDto(i));
	            }
	            return edto;
	   
}
	  public List<EmployeeDto> getEmployeeRecordsByname(String name) {
	        Iterable<EmployeeModel> em = er.findByEmployeeName(name);   //1( 2 to 100
	        List<EmployeeDto> edto = new ArrayList<EmployeeDto>();
	        for(EmployeeModel i:em)
	        {
	            edto.add(EmployeeDto.getDto(i));
	        }
	        return edto;
	    }
	public void updateEmployeedata(EmployeeDto employeeDto) {
		EmployeeModel ec = new EmployeeModel();
        ec.setEmployee_id(employeeDto.getEmployee_id());
        ec.setEmployee_name(employeeDto.getEmployee_name());
        ec.setEmployee_project(employeeDto.getEmployee_project());
        ec.setEmployee_sal(employeeDto.getEmployee_sal());
        er.save(ec);
	}
}