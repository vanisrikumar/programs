package week1.day2;

public class EmployeeDetails {
	public void empName(String empName, int empId, String empAddress, double empSalary, long mobNum) {
		System.out.println("Employee name : "+empName);
		System.out.println("EmpID : "+empId);
		System.out.println("EmpAddress : "+empAddress);
		System.out.println("EmpSalary : "+empSalary);
		System.out.println("Mobile Num : "+mobNum);
	}
	

	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.empName("Yaas",213,"chennai", 35000, 9273273268l);
		emp.empName("sri", 102, "Trichy", 25000, 9844777653l);
		
	}

}
