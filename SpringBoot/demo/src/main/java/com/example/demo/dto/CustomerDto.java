package com.example.demo.dto;

import com.example.demo.model.CustomerModel;
import com.example.demo.model.UserModel;

public class CustomerDto {
	

	private int c_id;
    private String c_name;
    private long c_acc;
    private String c_ifsc;
    private String c_branch;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public long getC_acc() {
		return c_acc;
	}
	public void setC_acc(long c_acc) {
		this.c_acc = c_acc;
	}
	public String getC_ifsc() {
		return c_ifsc;
	}
	public void setC_ifsc(String c_ifsc) {
		this.c_ifsc = c_ifsc;
	}
	public String getC_branch() {
		return c_branch;
	}
	public void setC_branch(String c_branch) {
		this.c_branch = c_branch;
	}
	 public static CustomerDto getDto(CustomerModel i) {

	        CustomerDto cdto = new CustomerDto();
	        cdto.setC_id(i.getC_id());
	        cdto.setC_name(i.getC_name());
	        cdto.setC_acc(i.getC_acc());
	        cdto.setC_ifsc(i.getC_ifsc());
	        cdto.setC_branch(i.getC_branch());
	        
	        return cdto;
	    }
	
	

}
