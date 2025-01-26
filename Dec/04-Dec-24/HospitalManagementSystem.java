
package dec_o4_24;

class hospitalstaff
{
	private String name;
	private int age;
	private String role;
	public hospitalstaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	public void work()
	{
		System.out.println(role+" "+name+"is working.");
		
	}
	public String getname() 
	{
		return name;
	}
	public String getrole() {
		
		return role;
	}
	
}

class doctor extends hospitalstaff
 {
	 private String specialization;

	public doctor(String specialization,String name,int age,String role) {
		super(name,age,role);
		this.specialization = specialization;
	} 
 
	public void work() {
		System.out.println(super.toString()+"with specialization in"+specialization+"is treating patients");
	}

}
class nurse extends hospitalstaff 
{
	private int yearsofexperience;

	public nurse(String name,int age,String role,int yearsofexperience )
	{
		super(name,age,role);
		this.yearsofexperience = yearsofexperience;
	}
	public void work()
	{
System.out.println(	super.toString()+ " with " + yearsofexperience + " years of experience is taking care of patients.");	
	

}
}

public class HospitalManagementSystem 
{
public static void main(String []args)
{
	hospitalstaff dr=new doctor("doctor","Chinna",21,"gyncologist");
	hospitalstaff n=new nurse("gyncologist",21,"nurse",8);
	dr.work();
	n.work();
	if(dr instanceof doctor)
	{
		System.out.println(dr.getname() + "is  a doctor");
	}
	else if(n instanceof nurse)
	{
		System.out.println(n.getname() + "is a nurse");
	}
}
}
