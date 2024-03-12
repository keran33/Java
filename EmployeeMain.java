/**
 * EmployeeMain - collect employee details and print the payslip
 * and organization wage bill.
 *
 */

import java.util.*;
class Employee{
	Scanner scan = new Scanner(System.in);
	String name;
	String dob;
	String empnum;
	String position;
	String dpt;
	String gender;
	float salary;
	float hsallowance;
	float travallowance;

	public void setAllowances(){
		hsallowance = (float)0.5 * salary;
		travallowance = (float)0.1 * salary;
	}

	/* getters */
	public float getHseAllowance(){
		return hsallowance;
	}
	public float getTravAllowance(){
		return travallowance;
	}
	public float getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getNumber(){
		return empnum;
	}
	public String getPosition(){
		return position;
	}
	public String getDpt(){
		return dpt;
	}
	public String getDob(){
		return dob;
	}
	public String getGender(){
		return gender;
	}

	/* setters */
	public void setName(String nm){
		name = nm;
	}
	public void setSalary(float s){
		salary = s;
	}
	public void setEmpNum(String num){
		empnum = num;
	}
	public void setDpt(String dpt){
		this.dpt = dpt;
	}
	public void setDob(String db){
		dob = db;
	}
	public void setGender(String gd){
		gender = gd;
	}

	/* method to set employee details */
	public void setDetails(){
		System.out.println("Enter Employee name");
		name = scan.nextLine();
		System.out.println("Enter Employee Number");
		empnum = scan.next();
		System.out.println("Enter Employee Position");
		position = scan.next();
		System.out.println("Enter Employee Salary");
		salary = scan.nextFloat();
		System.out.println("Enter Employee Department");
		dpt = scan.next();
		System.out.println("Enter Employee Date of Birth");
		dob = scan.next();
	}

	/* method to print employee details */
	public void printEmployee(){
		System.out.println(empnum + "\t" + name + "\t" + position + "\t" + dpt);
	}
}
/* End of class Employee */

public class EmployeeMain{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		/* illustrating with a single employee */
		Employee Emp = new Employee();
		Emp.setDetails();
		Emp.setAllowances();
		printPaySlip(Emp);

		/* illustrating with a set of employees */
		/* creating an array of employees myemps */
		Employee myemps[] = new Employee[5];

		/* populating the array */
		for(int i = 0; i < myemps.length; i++){
			myemps[i] = new Employee();
			myemps[i].setDetails();
			myemps[i].setAllowances();
		}
		printWageBill(myemps);
	}
	/*method to get Employee Gross pay */
	public static float getGross(Employee E){
		return E.getSalary() + E.getHseAllowance() + E.getTravAllowance();
	}
	/* method to get Employee Tax */
	public static float getTax(Employee E){
		float gross = getGross(E);
		float tax = 0;

		if(gross <= 10000)
			tax = 0;
		else
			if(gross <= 25000)
				tax = 1000 + 10/100 * (gross - 10000);
			else
				if(gross <= 35000)
					tax = 1500 + 20/100 * (gross - 25000);
				else
					if(gross <= 45000)
						tax = 3500 + 30/100 * (gross - 35000);
					else
						tax = 6500 + 40/100 * (gross - 45000);
		return tax;
	}

	/* method to print Employee PAy Slip */
	public static void printPaySlip(Employee E){
		System.out.println();
		System.out.println("Catholic University of Eastern Africa");
		System.out.println("Employee Monthly Pay Slip\t Month :\t" + getMonth());
		System.out.println();
		System.out.println("Employee Number\t" + E.getNumber() + "\tFull Name\t" + E.getName() + "\tDate:\t" + getDate());
		System.out.println("Position\t" + E.getPosition() + "\tDepartment\t" + E.getDpt());
		System.out.println("Basic Salary\t\t" + E.getSalary());
		System.out.println("House Allowance\t\t" + E.getHseAllowance());
		System.out.println("Travelling Allowance\t" + E.getTravAllowance());
		System.out.println("Gross Income\t\t" + getGross(E));
		System.out.println("Paye\t\t\t" + getTax(E));
		System.out.println("Net Income\t\t" + (getGross(E) - getTax(E)));
	}

	/* method to print company employee wage bill */
	/* receives an array of Employees */
	public static void printWageBill(Employee []Emps){
		System.out.println("Catholic University of Eastern Africa");
		System.out.println("Employee \t" + getMonth() + "\t Wage Bill\tDate:\t" + getDate());
		System.out.println("Employee Number\tFull Name\tGross\tPaye\tNet");
		float sumgross = 0;
		float sumtax = 0;

		for(int i = 0; i < Emps.length; i++){
			float net = getGross(Emps[i]) - getTax(Emps[i]);
			sumgross += getGross(Emps[i]);
			sumtax += getTax(Emps[i]);
			System.out.println(Emps[i].getNumber() + "\t" + Emps[i].getName() + "\t" + getGross(Emp[i]) + "\t" + getTax(Emps[i]) + "\t" + net);
		}
		System.out.println("\t\tTotal Gross\t" + sumgross + "Total Paye\t" + sumtax);
	}

	/* a method to return current month */
	public static String getMonth(){
		String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		Date dt = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH);
		int dte = gc.get(Calendar.DATE);
		String mon = months[month];
		return mon;
	}
	public static String getDate(){
		Date dt = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH);
		int dte = gc.get(Calendar.DATE);
		String date = dte + "/" + month + "/" + year;
		return date;
	}
}
