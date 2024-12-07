package com.klef.jfsd.exam;


	import java.util.List;

	public class Employee {
	    private Integer employeeId;
	    private String name;
	    private Double salary;
	    private String department;
	    private List<String> skills;

	 
	    public Employee(Integer employeeId, String name, Double salary, String department, List<String> skills) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	        this.skills = skills;
	    }

	 
	    public Integer getEmployeeId() {
	        return employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public Double getSalary() {
	        return salary;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public List<String> getSkills() {
	        return skills;
	    }

	    @Override
	    public String toString() {
	        return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", department="
	                + department + ", skills=" + skills + "]";
	    }
	}



