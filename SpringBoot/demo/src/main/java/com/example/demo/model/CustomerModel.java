package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "snad_customer")

public class CustomerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private int c_id;
	
	@Column(name = "c_name")
	private String c_name;

	@Column(name = "c_acc")
	private long c_acc;

	@Column(name = "c_isfc")
	private String c_ifsc ;

	@Column(name = "c_branch")
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

	@Override
	public String toString() {
		return "CustomerModel [c_id=" + c_id + ", c_name=" + c_name + ", c_acc=" + c_acc + ", c_ifsc=" + c_ifsc
				+ ", c_branch=" + c_branch + "]";
	}
	

}
