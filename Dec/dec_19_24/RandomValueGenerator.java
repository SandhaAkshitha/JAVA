
package dec_19_24;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class RandomValueGenerator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Supplier<String> s1=()->
		{
			Random r=new Random();
			int randomNumber=r.nextInt(5000);
			return "NIT"+randomNumber;
		};
		System.out.println("Generates random String:"+s1.get());
		
		Supplier<Integer> s2 =() ->
		{
			Random r=new Random();
			int randomNumber=r.nextInt(50,89);
			return randomNumber;
		};

		System.out.println("Generates random number:"+s2.get());
		
		
		sc.close();
		
		
		

	}

}
