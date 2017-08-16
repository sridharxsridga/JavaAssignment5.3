/*
 * This class holds details of temporary employees
 */

package employeeDetails;

import java.util.LinkedList;
import java.util.List;

public class TemporaryEmp extends Employee {

	TemporaryEmp(int empId, String empName) { // Initializing default values
		this.empId = empId;
		this.empName = empName;
		this.total_leaves=20;// total leaves for temporary employees =20
		this.total_salary=30000;// total salary for temporary employees =30000

	}

	@Override
	void calculate_balance_leave() { // Method to calculate the balance leaves left and print details
		System.out.println("\t\t\t\tBalance Leaves :");
		System.out.println("\nTotal Balance Leaves" + this.total_leaves);
		System.out.println("\nTotal leaves Availed:"+(20-this.total_leaves));

	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) { // Method to avail leaves
	
		 // if("asdhAkldffl".matches(".*[scpSCP].*"))ABCDEFGH
		if (Character.toString(type_of_leave).matches(".*[scpSCP].*")){  //if leave type is sick,casual or paid

			if (no_of_leaves <= this.total_leaves) {//if applied leave is less than available leaves

				this.total_leaves = this.total_leaves - no_of_leaves;
				
				return true;

			} else {
				System.out.println(" No More Leaves avaiable");
				return false;
			}

		}

	else {
			System.out.println("Invalid Leave Type");
			return false;
		}

	}

	@Override
	void calculate_salary() { // Method to calculate total salary and print details
		System.out.println("\t\t\t\tSalary Details");
		System.out.println("\nTotal Salary:"+ this.total_salary);
	}
	
	public String getEmpName(){ //getter method to get emp name
		return this.empName;
	}

	public int getEmpId(){//getter method to get emp id
		return this.empId;
	}

}
