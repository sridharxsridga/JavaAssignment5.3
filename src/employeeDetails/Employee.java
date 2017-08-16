/*
 *  abstract class Defining employee details
 */

package employeeDetails;

public abstract class Employee {

int empId;
String empName;
int total_leaves;
double total_salary;
	
abstract void calculate_balance_leave();
abstract boolean avail_leave(int no_of_leaves,char type_of_leave);
abstract void calculate_salary();
	
	
}
