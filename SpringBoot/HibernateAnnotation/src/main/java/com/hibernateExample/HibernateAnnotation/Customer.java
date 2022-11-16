package com.hibernateExample.HibernateAnnotation;

import javax.persistence.Entity; 
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity  
@Table(name= "customer")   
public class Customer {
	@Id   
	private int cid;    
	private String cname;
	private String customer_branch;  
	private long customer_salary;
	private long customer_acc_no;
	
	public int getId() {    
	    return cid;    
	}    
	public void setId(int id) {    
	    this.cid = id;    
	}    
	public String getCustomer_branch() {
		return customer_branch;
	}
	public void setCustomer_branch(String customer_branch) {
		this.customer_branch = customer_branch;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCustomer_salary() {
		return customer_salary;
	}
	public void setCustomer_salary(long customer_salary) {
		this.customer_salary = customer_salary;
	}
	public long getCustomer_acc_no() {
		return customer_acc_no;
	}
	public void setCustomer_acc_no(long customer_acc_no) {
		this.customer_acc_no = customer_acc_no;
	}
	
}
