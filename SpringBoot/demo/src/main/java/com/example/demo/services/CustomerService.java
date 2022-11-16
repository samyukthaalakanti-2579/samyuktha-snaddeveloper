package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;

@Component
public class CustomerService {
	@Autowired
    CustomerRepository un;
	
	 public void MyData(CustomerDto CustomerDto) {
	        CustomerModel uc = new CustomerModel();
	        uc.setC_id(CustomerDto.getC_id());
	        uc.setC_name(CustomerDto.getC_name());
	        uc.setC_acc(CustomerDto.getC_acc());
	        uc.setC_ifsc(CustomerDto.getC_ifsc());
	        uc.setC_branch(CustomerDto.getC_branch());
	        un.save(uc);

}
	 public List<CustomerDto> getCustomerRecords() {
	        Iterable<CustomerModel> uc = un.findAll();   
	        List<CustomerDto> cdto = new ArrayList<CustomerDto>();
	        for(CustomerModel i:uc)
	        {
	            cdto.add(CustomerDto.getDto(i));
	        }
	        return cdto;
	    }
	 public List<CustomerDto> getCustomerRecordsByname(String c_name) {
	        Iterable<CustomerModel> uc = un.findByCustomerName(c_name);   //1( 2 to 100
	        List<CustomerDto> cdto = new ArrayList<CustomerDto>();
	        for(CustomerModel i:uc)
	        {
	            cdto.add(CustomerDto.getDto(i));
	        }
	        return cdto;
	    }
	 public List<CustomerDto>getCustomerRecordsByacc(long c_acc) {
	        Iterable<CustomerModel> uc = un.findByCustomerAcc(c_acc);   //1( 2 to 100
	        List<CustomerDto> cdto = new ArrayList<CustomerDto>();
	        for(CustomerModel i:uc)
	        {
	            cdto.add(CustomerDto.getDto(i));
	        }
	        return cdto;
	    }
	 public void updateCustomerdata(CustomerDto CustomerDto) {
	        CustomerModel uc = new CustomerModel();
	        uc.setC_id(CustomerDto.getC_id());
	        uc.setC_name(CustomerDto.getC_name());
	        uc.setC_acc(CustomerDto.getC_acc());
	        uc.setC_ifsc(CustomerDto.getC_ifsc());
	        uc.setC_branch(CustomerDto.getC_branch());
	        un.save(uc);

}
	
		
}
