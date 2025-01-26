
package dec_19_24;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifierclass
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a String :");
		String s=sc.nextLine();
		
		System.out.println(" enter a number: ");
		int num=sc.nextInt();
		
		Consumer<String> c1=(String str) ->System.out.println("Ater converting string to uppercase:"+str.toUpperCase());
	c1.accept(s);
	Consumer<Integer> c2=(Integer)->System.out.println("Squares in the integer value: "+num*num);
	c2.accept(num);
	sc.close();
	}

}
