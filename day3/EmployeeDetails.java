package week1.day3;

public class EmployeeDetails {
public void employeeName(String name) {
	System.out.println(name);
}
public void employeeId(int id) {
	System.out.println(id);
}
public void employeeDesignation(String role) {
	System.out.println(role);
}
public void employeeSalary(float salary) {
	System.out.println(salary);
}
public void employeeMobileNumber(long mobileNumber) {
	System.out.println(mobileNumber);
}

public static void main(String[] args) {
	EmployeeDetails detail=new EmployeeDetails();
	detail.employeeName("Aravind");
	detail.employeeId(10001);
	detail.employeeDesignation("QA Engineer");
	detail.employeeSalary(25000.00f);
	detail.employeeMobileNumber(9976749433L);
}
}
