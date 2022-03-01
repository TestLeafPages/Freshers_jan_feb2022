package week4.day2;

import net.bytebuddy.asm.Advice.This;

public class Employee {

	String employeeName;
    String companyName;
	int employeeId;
	double employeeSalary;
	boolean isActive;
	
	Employee(){
		System.out.println("Default constructor");
	}
	Employee(String employeeName,String companyName,int employeeId){
		this();
		this.employeeName=employeeName;
		this.companyName=companyName;
		this.employeeId=employeeId;
		System.out.println("Parameterized  constructor");
	
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee("Anil","Test leaf",101);
		System.out.println(emp.employeeName);
		System.out.println(emp.companyName);
		System.out.println(emp.employeeId);
	
		/*
		 * stem.out.println(emp2.employeeName); System.out.println(emp2.companyName);
		 * System.out.println(emp2.employeeId); System.out.println(emp3.employeeName);
		 * System.out.println(emp3.companyName); System.Syout.println(emp3.employeeId);
		 */
		
	}
}
