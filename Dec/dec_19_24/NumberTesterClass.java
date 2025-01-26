
package dec_19_24;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTesterClass
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number : ");
		int num=sc.nextInt();
		
	
		Predicate<Integer>p1=(Integer a)-> a%2==0;
		System.out.println("is"+num+"even?"+p1.test(num));
		
		Predicate<Integer>p2=(Integer b)->b%2==1;
		System.out.println("is"+num+"prime?"+p2.test(num));
		sc.close();
		
		
	}

}
