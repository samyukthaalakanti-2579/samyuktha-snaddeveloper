package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.ResponseWrapper;
import com.example.demo.dto.UserDto;
import com.example.demo.services.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	@PostMapping(value = "/postcustomerdata")
	public ResponseWrapper postCustomerData(@RequestBody CustomerDto CustomerDto, HttpServletRequest request,
			HttpServletResponse response) {
		ResponseWrapper rw = new ResponseWrapper(true);
		try {
			customerservice.MyData(CustomerDto);

			// rw.setData(gfg);
		} catch (Exception e) {
			rw.setSuccess(false);
		}
		rw.setMessage("Inserted Successfully");
		return rw;
	}
	
	@GetMapping(value="/getcustomerdata")
    public ResponseWrapper getcustomerData(HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<CustomerDto> listOfCustomer = customerservice.getCustomerRecords();
            rw.setData(listOfCustomer);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Customers");

        return rw;

    }
	@GetMapping(value="/getCustomerdataByName/{name}")
    public ResponseWrapper getCustomerdataByName(@PathVariable String name,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<CustomerDto> Customerdata = customerservice.getCustomerRecordsByname(name);
            rw.setData(Customerdata);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Customers");

        return rw;
}
	@GetMapping(value="/getCustomerdataByacc/{acc}")
    public ResponseWrapper getCustomerdataByAcc(@PathVariable long acc,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<CustomerDto> Customerdata = customerservice.getCustomerRecordsByacc(acc);
            rw.setData(Customerdata);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Customers");

        return rw;
}
	@PutMapping(value="/updateCustomerdata/{c_id}")
    public ResponseWrapper updateCustomerdata(@PathVariable int c_id,@RequestBody CustomerDto CustomerDto ,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
        	CustomerDto.setC_id(c_id);
        	customerservice.updateCustomerdata(CustomerDto);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("updated successfully");

        return rw;
}
	

}
