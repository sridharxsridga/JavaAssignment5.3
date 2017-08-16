/*
 * This class holds details of permanent employees
 */

package employeeDetails;

public class PermanentEmp extends Employee {

	private static int paid_leave;
	private static int sick_leave;
	private static int casual_leave;
	private double basic;
	private double hra;
	private double pf;
	public static final String P = "paid_type_of_leave";
	public static final String C = "casual_type_of_leave";
	public static final String S = "sick_type_of_leave";

	PermanentEmp(int empId, String empName) { // Initializing default values
		this.empId = empId;
		this.empName = empName;
		this.paid_leave = 5;  // paid leaves for permanent employees =5
		this.casual_leave = 15;// casual leaves for permanent employees =15
		this.sick_leave = 5;// sick leaves for permanent employees =5
		this.basic = 10000;// basic salary for permanent employees =10000


	}

	@Override
	void calculate_balance_leave() { // Method to calculate the balance leaves
										// left and print details
		System.out.println("\t\t\t\tBalance Leaves :");
		this.total_leaves = this.paid_leave + this.casual_leave + this.sick_leave;
		System.out.println("Paid Leaves:" + this.paid_leave + " \nCasual Leaves:" + this.casual_leave
				+ " \nSick Leaves:" + this.sick_leave + " \nTotal Balance Leaves" + this.total_leaves);

	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) { // Method to
																// avail leaves

		if (Character.toString(type_of_leave).equalsIgnoreCase("P")) {  //for paid leaves

			if (no_of_leaves <= this.paid_leave) { //if applied leave is less than avaiable leaves

				this.paid_leave = this.paid_leave - no_of_leaves;
				
				return true;

			} else {
				System.out.println(" No More Leaves avaiable");
				return false;
			}

		} else if (Character.toString(type_of_leave).equalsIgnoreCase("S")) { //for sick leaves
			if (no_of_leaves <= sick_leave) { //if applied leave is less than avaiable leaves
				this.sick_leave = this.sick_leave - no_of_leaves;
				return true;
			} else {
				System.out.println(" No More Leaves avaiable");
				return false;
			}

		}
		if (Character.toString(type_of_leave).equalsIgnoreCase("C")) { //for casual leaves
			if (no_of_leaves <= casual_leave) { //if applied leave is less than avaiable leaves
				this.casual_leave = this.casual_leave - no_of_leaves;
				return true;
			} else {
				System.out.println(" No More Leaves avaiable");
				return false;
			}

		} else {
			System.out.println("Invalid Leave Type"); //if invalid leave 
			return false;
		}

	}

	@Override
	void calculate_salary() { // Method to calculate total salary(total_sal = basic + hra – pf) and print details
		System.out.println("\t\t\t\tSalary Details");
		hra=(12*basic)/100;  //Pf = 12% of basic
		pf=(50*basic)/100;  //hra = 50% of basic
		this.total_salary = this.basic + this.hra - this.pf;
		System.out.println("Basic :" + this.basic + "  \nHRA:" + this.hra + "  \nPF:" + this.pf + "\nTotal Salary:"
				+ this.total_salary);
	}

	void print_leave_details() { // Method to calculate leave availed and print details
		System.out.println("\t\t\t\tLeave Details:");
		System.out.println("Paid Leaves availed:" + (5 - this.paid_leave) + " \nCasual leaves availed:"
				+ (15 - this.casual_leave) + " \nSick leave availed:" + (5 - this.sick_leave));
	}

	public static int getPaid_leave() {  //getter method for paid_leave
		return paid_leave;
	}

	public static void setPaid_leave(int paid_leave) { //setter method for paid_leave
		PermanentEmp.paid_leave = paid_leave;
	}

	public static int getSick_leave() { //getter method for sick_leave
		return sick_leave;
	}

	public static void setSick_leave(int sick_leave) {//Setter method for sick_leave
		PermanentEmp.sick_leave = sick_leave;
	}

	public static int getCasual_leave() {//getter method for casual_leave
		return casual_leave;
	}

	public static void setCasual_leave(int casual_leave) {//setter method for casual_leave
		PermanentEmp.casual_leave = casual_leave; 
	}
	
	
	public String getEmpName(){//getter method to get emp name
		return this.empName;
	}

	public int getEmpId(){//getter method to get emp id
		return this.empId;
	}
}
