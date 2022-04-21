package pack_main;

import java.util.Scanner;
import pack_employee.Employee;
import pack_employee.Salary;
import pack_employee_updates.EmployeeUpdates;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name : ");
		
		String firstName = sc.next();
		
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		
		System.out.println("Enter Basic");
		int basic = sc.nextInt();
		
		System.out.println("Enter HRA");
		int hra = sc.nextInt();
		
		System.out.println("Enter Travelling Allowences");
		float ta = sc.nextFloat();
		
		System.out.println("Want NPS ?");
		boolean nps = sc.nextBoolean();
		
		Salary salE1 = new Salary(basic,hra,ta,nps);
		
		Employee e1 = new Employee(firstName, lastName, salE1);
		
		EmployeeUpdates eu = new EmployeeUpdates();
		
		eu.getDetails(e1);
		
	

	}
}
