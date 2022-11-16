package com.example.snadservice.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;



	@Entity
	@Table(name = "snademployee")
	public class EmployeeModel {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "employee_id")
	    private Long employee_id;
	    @Column(name = " employee_name")
	    private String  employee_name;
	   @Column(name = " employee_project")
	    private String  employee_project;
	   @Column(name = " employee_sal")
	    private String  employee_sal;
	   
	   public Long getEmployee_id() {
	        return employee_id;
	    }
	   public void setEmployee_id(Long employee_id) {
	        this.employee_id = employee_id;
	    }
	   public String getEmployee_name() {
	        return employee_name;
	    }
	   public void setEmployee_name(String employee_name) {
	        this.employee_name = employee_name;
	    }
	   public String getEmployee_project() {
	        return employee_project;
	    }
	   public void setEmployee_project(String employee_project) {
	        this.employee_project = employee_project;
	   }
	   public String getEmployee_sal() {
	        return employee_sal;
	    }
	   public void setEmployee_sal(String employee_sal) {
	        this.employee_sal = employee_sal;
	    }
	   
	   @Override
	    public String toString() {
	        return "EmployeeModel [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_project="
	                + employee_project + ", employee_sal=" + employee_sal + "]";
	    }
}
