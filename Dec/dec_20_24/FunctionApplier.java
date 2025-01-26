
package dec_20_24;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		
		Function<Integer, Integer> add=num-> number+num;
		System.out.println("After adding 5: "+applyFunction(5, add));
		
		Function<Integer,Integer> multiply = num -> number * num;
		System.out.println("After multiplying by 2: "+applyFunction(2, multiply));
		
		Function<Integer,Integer> sub = num -> number - num;
		System.out.println("After subtracting 3: "+applyFunction(3, sub));
	
	sc.close();
	}
	public static int applyFunction(int value,  Function<Integer, Integer> function)
	
	{
		return function.apply(value);
	}
		
		
	}
