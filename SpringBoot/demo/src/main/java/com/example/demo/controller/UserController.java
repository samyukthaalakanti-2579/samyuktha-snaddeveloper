package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseWrapper;
import com.example.demo.dto.UserDto;
import com.example.demo.model.UserModel;
import com.example.demo.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;

	@PostMapping(value = "/postuserdata")
	public ResponseWrapper postUserData(@RequestBody UserDto userDto, HttpServletRequest request,
			HttpServletResponse response) {
		ResponseWrapper rw = new ResponseWrapper(true);
		try {
			userservice.saveMyData(userDto);

			// rw.setData(gfg);
		} catch (Exception e) {
			rw.setSuccess(false);
		}
		rw.setMessage("Inserted Successfully");
		return rw;
	}
	@GetMapping(value="/getUserdata")
    public ResponseWrapper getUserData(HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<UserDto> listOfEmployee = userservice.getEmployeeRecords();
            rw.setData(listOfEmployee);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Employees");

        return rw;

    }
	@GetMapping(value="/getUserdataByName/{name}")
    public ResponseWrapper getUserdataByName(@PathVariable String name,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<UserDto> Employeedata = userservice.getEmployeeRecordsByname(name);
            rw.setData(Employeedata);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Employees");

        return rw;
}
	@PutMapping(value="/updateUserdata/{user_id}")
    public ResponseWrapper updateUserdata(@PathVariable long user_id,@RequestBody UserDto userDto ,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            userDto.setUser_id(user_id);
            userservice.updateUserdata(userDto);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("updated successfully");

       return rw;
}
	@DeleteMapping(value="/DeleteUserdata/{user_id}")
    public ResponseWrapper deleteUserData(@PathVariable long user_id,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {

            userservice.deleteRecordById(user_id);

        }
        catch (Exception e) {
            rw.setSuccess(false);
        }
        rw.setMessage("Deleted  Successfully");
        return rw;
    }
}