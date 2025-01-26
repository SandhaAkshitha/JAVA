
package dec_11_24;

import java.util.Scanner;

interface Employee{
	public double calculateSalary();
	public void generatePayroll();
}
class FullTimeEmployee implements Employee
{
	private int employeeId;
	private String employeeName;
	private double monthlySalary;
	private double benefits;
	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
		if(monthlySalary <=0)
		{
			System.err.println("Error: Monthly salary cannot be negative.");
			System.exit(0);
		}
		if(employeeName==null||employeeName.isEmpty()) 
		{
			System.err.println("Error: Employee name cannot be empty.");
			System.out.println(0);
		}
	}
	@Override
	public double calculateSalary() {
		return monthlySalary+benefits;
	}
	@Override
	public void generatePayroll() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Monthly Salary :"+monthlySalary);
		System.out.println("Employee benefits :"+benefits);	
		System.out.println("Total Salary : "+calculateSalary());	
	}
}
 class EmployeeManagementSystem
{
	public static void Main(String[] args) {
		FullTimeEmployee full = new FullTimeEmployee(101, "Chinna", 55000, 10000);
		full.generatePayroll();
	}
}
public class AdvanceArithmetic5
{
      public static void Main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a postive number: ");
       int n = sc.nextInt();
       MyCalculator calculator = new MyCalculator();
       int Results = calculator.divisorSum(n);
       System.out.println("Total Divisor sum: "+Results);
       sc.close();
	}
}
