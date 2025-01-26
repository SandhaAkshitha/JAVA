

package dec_10_24;

import java.util.Scanner;

abstract  class Food {
	 double proteins;
	 double fats;
	 double carbs;
	 double tastyScore;
	abstract public void getMacroNutrients();
	
	public Food(double proteins, double fats, double carbs) 
	{
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		
	}
	
}
class Egg extends Food
{
    public Egg(double proteins,double fats, double carbs) 
    {
		super(proteins, fats, carbs);
	}
    int tastyScore = 7;
    String type = "non-vegetarian";
    
	@Override
    public void getMacroNutrients()
    {
		
   	 System.out.println("An egg has "+proteins+" gms of protein,"+fats+" gms of fats and "+carbs+" gms of carbohydrates.");
   	 
    }
 }
class Bread extends Food{
	String type1 = "vegetarian";
	public Bread(double proteins,double fats, double carbs)
	{
		super(proteins, fats, carbs);
		
	}
	int tastyScore = 8;
	String type = "vegetarian";
	@Override
   public void getMacroNutrients()
   {
    
  	 System.out.println("An egg has "+proteins+" gms of protein,"+fats+" gms of fats and "+carbs+" gms of carbohydrates.");
  	 
   }
}

public class Testing{
	public static void main(String[] args)
{
		int n, numberOfFoodItems;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Food Menu");
		System.out.println("Egg");
		System.out.println("Bread");
		System.out.println("Exit");
		System.out.println("Enter your option");
		String choice=sc.nextLine();
		
		if(choice.equals("egg") || choice.equals("Egg") || choice.equals("EGG")) 
		{
        	Egg egg = new Egg(6.2, 5.1, 0);
            System.out.println("Egg is "+egg.type);
            egg.getMacroNutrients();
            System.out.println("Taste: "+egg.tastyScore);
        }
		else if(choice.equals("bread") || choice.equals("Bread") || choice.equals("BREAD")) 
        {
        	Bread bread = new Bread(4.0,1.1,13.8);
        	System.out.println("Bread is "+bread.type);
            bread.getMacroNutrients();
            System.out.println("Taste: "+bread.tastyScore);
        }
		else if(choice.equals("Exit") || choice.equals("exit") || choice.equals("EXIT"))
        {
        	System.exit(0);
        }
		else 
		{
        	System.out.println("Invalid choice");
        }
		sc.close();
    }
	

		
		
    
}
