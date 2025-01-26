
package dec_20_24;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic 
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Even a number: ");
		int num=sc.nextInt();
		
		Predicate<Integer> isEven=(Integer n)-> n%2==0;
		System.out.println(num+" is even: "+testPredicate(num,isEven));
		
		Predicate<Integer> isGreater=(Integer n)-> n>10;
		System.out.println(num+" is greater than 10: "+testPredicate(num,isGreater));
		
		Predicate<Integer> isPrime=(Integer n)->n%2==1;
		
		 
		 System.out.println(num+" is prime: "+testPredicate(num,isPrime));
		 sc.close();
	}
		  public static boolean testPredicate(int n, Predicate <Integer> predicate)
		  {
			  if(n>0)
			  {
				  return predicate.test(n);
			  }
			  else
			  {
				  System.err.println("Error: Invalid Number");
				  System.exit(0);;
				  return false;
			  }
			  
		  }
		
		
	}
