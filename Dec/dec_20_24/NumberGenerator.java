

package dec_20_24;

import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator 
{

	public static int generateRandomNumber(int max,int min)
	{
		
		Supplier<Integer> randomNum = () -> (int)(Math.random() * (max - min + 1)) + min;
		return randomNum.get();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a maxmum value: ");
		int min=sc.nextInt();
		
		System.out.println("Enter the minimum value:");
		int max=sc.nextInt();
		sc.close();
		
System.out.println("Random number generated:"+generateRandomNumber(max, min));
	}
}

	
