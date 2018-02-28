package com.org.practice;

import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorExampleTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Employee,String> tm=new TreeMap<Employee,String>(new EmployeeIdComparator() );
		tm.put(new Employee(1001,"Sidharth"),"tyfone");
		tm.put(new Employee(1003,"Satish"),"Allstate");
		tm.put(new Employee(1002,"Ritesh"),"Arricent");
for (Employee key : tm.keySet()) {
	System.out.println(key+": "+tm.get(key));
	
}
System.out.println("=======================================");
TreeMap<Employee,String> tm2=new TreeMap<Employee,String>(new EmployeeNameComparator() );
tm.put(new Employee(1001,"Sidharth"),"tyfone");
tm.put(new Employee(1003,"Satish"),"Allstate");
tm.put(new Employee(1002,"Ritesh"),"Arricent");
for (Employee ks : tm2.keySet()) {
System.out.println(ks+": "+tm2.get(ks));

}

	}

}

class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getEmployeeId()>emp2.getEmployeeId()){
		return 1;
		}
		else {
			return -1;
		}
	}

	
	
}

class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
	}

	
	
}



class Employee {
	
	private int employeeId;
	private String employeeName;
	
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
	
	
	
}