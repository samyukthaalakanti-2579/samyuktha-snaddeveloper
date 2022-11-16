package com.example.snadservice.dto;


import com.example.snadservice.model.EmployeeModel;

public class EmployeeDto {
	private Long employee_id;
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
	private String employee_name ;
    private String employee_project;
    private String employee_sal ;
    
    public static EmployeeDto getDto(EmployeeModel i) {

        EmployeeDto edto = new EmployeeDto();
        edto.setEmployee_id(i.getEmployee_id());
        edto.setEmployee_name(i.getEmployee_name());
        edto.setEmployee_project(i.getEmployee_project());
        edto.setEmployee_sal(i.getEmployee_sal());
		return edto;
        
    }
    
}
