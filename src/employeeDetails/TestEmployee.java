/*
 * This is to test and display emp details
 */

package employeeDetails;

public class TestEmployee {

	public static void main(String[] args) {
		PermanentEmp permanentEmployee = new PermanentEmp(2627, "Sridhar");  // Permanent Employee
		TemporaryEmp temporaryEmployee = new TemporaryEmp(3456,"Amit");		//Temporary leave
		System.out.println("\t\tPermanent Empoyee Details");
		System.out.println("\t\tEmployee Name :"+ permanentEmployee.getEmpName() + "  Employee Id:"+ permanentEmployee.getEmpId());  //To display emp information
		permanentEmployee.avail_leave(2, 'S');  //availing Sick Leave
		permanentEmployee.avail_leave(3, 'C'); //availing casual leave
		permanentEmployee.avail_leave(4, 'P'); //availing paid leave
		permanentEmployee.calculate_salary();  //to display salary details
		permanentEmployee.print_leave_details(); //to print leave details
		permanentEmployee.calculate_balance_leave();  //to display leave balance
		System.out.println("\t\tTemporary Empoyee Details");
		System.out.println("\t\tEmployee Name :"+ temporaryEmployee.getEmpName() + "  Employee Id:"+ temporaryEmployee.getEmpId()); //To display emp information
		temporaryEmployee.avail_leave(3, 'S'); //availing Sick Leave
		temporaryEmployee.avail_leave(3, 'C'); //availing casual leave
		temporaryEmployee.avail_leave(3, 'P');  //availing paid leave
		temporaryEmployee.calculate_salary(); //to display salary details
		temporaryEmployee.calculate_balance_leave(); ////to display leave details 
	}

}
