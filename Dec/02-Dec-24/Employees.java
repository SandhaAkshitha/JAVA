package dec_02;
class Employee
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer)
	{
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}
	public double calculateGrossSalary()
	{
		return  basicSalary +HRAPer +DAPer;
	}
	public void Display()
	{
		System.out.println("Id is:" +id);
		System.out.println("Name is : "+name);
	}
}
class Manager extends Employee
{
	double projectAllowance;

	public Manager(int id,String name ,double basicSalary, double HRAPer, double DAPer, double projectAllowance)
	{

	super(id,name,basicSalary,HRAPer,DAPer);	
	}
	
	public double calculateGrossSalary()
	{
		if(basicSalary < 0)
		{
			return -1;
			
		}
		return basicSalary+HRAPer+DAPer+projectAllowance;
	}
}
class Trainer extends Employee
{
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) 
	{
		super(id, name, basicSalary, hRAPer, dAPer);
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	public double calculateGrossSalary()
	{
		if(basicSalary < 0) 
		{
			return -1;
		}
	return basicSalary+HRAPer+DAPer+(batchCount*perkPerBatch);
	}
}
class Sourcing extends Employee
{
	int enrollmentTarget;
	int enrollmentReached;
	int perkPerEnrollment;
	public Sourcing(int id, String name, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
			int enrollmentReached, int perkPerEnrollment)
	{
		super(id, name, basicSalary, hRAPer, dAPer);
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	public double calculateGrossSalary() 
	{
		if(basicSalary <0)
		{
			return -1;
		}
		return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);

	}
}
class TaxUtil
{
	public double calculateTax(Employee e)
	{
		if(e.calculateGrossSalary()>3000) 
		{
			return e.calculateGrossSalary()*0.20;
		}
		else
		{
			return e.calculateGrossSalary()*0.05;	
		}
	}
	public double calculateTax(Manager m) 
	{
		if(m.calculateGrossSalary()>3000) 
		{
			return m.calculateGrossSalary()*0.20;
		}
		else
		{
			return m.calculateGrossSalary()*0.05;	
		}
	}
	public double calculateTax(Trainer t)
	{
		if(t.calculateGrossSalary()>3000) 
		{
			return t.calculateGrossSalary()*0.20;
		}
		else
		{
			return t.calculateGrossSalary()*0.05;	
		}
	}
	public double calculateTax(Sourcing s)
	{
		if(s.calculateGrossSalary()>3000) 
		{
			return s.calculateGrossSalary()*0.20;
		}
		else
		{
			return s.calculateGrossSalary()*0.05;	
		}
	}
}

public class Employees
{

	public static void main(String[] args) 
	{
		TaxUtil tax = new TaxUtil();
		Manager manager = new Manager( 101, "Akki", 1500,5000,3000,5.5);
		manager.Display();
		if(manager.calculateGrossSalary()!=-1)
		{
			System.out.println("Manager Gross Salary:"+manager.calculateGrossSalary());
			System.out.println("Manager Tax: "+tax.calculateTax(manager));
		}
		else
		{
			System.out.println("Error.Salary components must be non-negative");
			
		}
		System.out.println();
		
		Trainer trainer= new Trainer(101,"Akshu", 1500,5000,3000,39,3.3);
		
		trainer.Display();
		
		if(trainer.calculateGrossSalary()!=-1)
		{
			System.out.println("Trainer Gross Salary:"+trainer.calculateGrossSalary());
			System.out.println("Trainer Tax:"+tax.calculateTax(trainer));
			}
		else
		{
			System.out.println("Error: Salary components must beb non-negative");
		}
		System.out.println();
		
		Sourcing  sourcing = new Sourcing(101,"Akshu",-1500,5000,3000,0,0,0);
		
		sourcing.Display();
		
		if(sourcing.calculateGrossSalary()!=-1)
		{
			System.out.println("Sourcing Gross Salary:"+sourcing.calculateGrossSalary());
			System.out.println("sourcing Tax:"+tax.calculateTax(sourcing));
			}
		else
		{
			System.out.println("Error: Salary components must beb non-negative");
		}
		
		}
	}
