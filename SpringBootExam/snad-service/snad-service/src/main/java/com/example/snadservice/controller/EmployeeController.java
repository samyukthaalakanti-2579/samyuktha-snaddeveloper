package com.example.snadservice.controller;



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

import com.example.snadservice.dto.EmployeeDto;
import com.example.snadservice.dto.ResponseWrapper;
import com.example.snadservice.model.EmployeeModel;
import com.example.snadservice.services.EmployeeService;

@RestController
public class EmployeeController {

   @Autowired
    EmployeeService employeeservice;

   @PostMapping(value = "/postemployeedata")
    public ResponseWrapper postUserData(@RequestBody EmployeeDto employeeDto, HttpServletRequest request,
            HttpServletResponse response) {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            employeeservice.saveMyData(employeeDto);
  
        } catch (Exception e) {
            rw.setSuccess(false);
        }
        rw.setMessage("Inserted Successfully");
        return rw;
    }
   @GetMapping(value="/getemployeedata")
   public ResponseWrapper getEmployeeData(HttpServletRequest request, HttpServletResponse response)
   {
       ResponseWrapper rw = new ResponseWrapper(true);
       try {
           List<EmployeeDto> listOfEmployee = employeeservice.getEmployeeRecords();
           rw.setData(listOfEmployee);
       }
       catch (Exception e)
       {
           rw.setSuccess(false);
       }
       rw.setMessage("List of Employees");

       return rw;
   }
   @GetMapping(value="/getEmployeedataByName/{name}")
   public ResponseWrapper getEmployeedataByName(@PathVariable String name,HttpServletRequest request, HttpServletResponse response)
   {
       ResponseWrapper rw = new ResponseWrapper(true);
       try {
           List<EmployeeDto> Employeedata = employeeservice.getEmployeeRecordsByname(name);
           rw.setData(Employeedata);
       }
       catch (Exception e)
       {
           rw.setSuccess(false);
       }
       rw.setMessage("List of Employees");

       return rw;
}
   @PutMapping(value="/updateEmployeerdata/{employee_id}")
   public ResponseWrapper updateEmployeedata(@PathVariable int c_id,@RequestBody EmployeeDto EmployeeDto ,HttpServletRequest request, HttpServletResponse response)
   {
       ResponseWrapper rw = new ResponseWrapper(true);
       try {
       	EmployeeDto.setEmployee_id(employee_id);
       	employeeservice.updateEmployeedata(EmployeeDto);
       }
       catch (Exception e)
       {
           rw.setSuccess(false);
       }
       rw.setMessage("updated successfully");

       return rw;
}
	
}
