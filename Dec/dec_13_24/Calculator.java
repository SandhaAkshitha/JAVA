
package dec_13_24;


//BLC interface of CalculatorTest class -> Calculator.java
interface Calculator 
{
	public void calculateSum(int ...x);
}
//BLC class of CalculatorTest -> SimpleCalculator.java
class SimpleCalculator implements Calculator
{

	@Override
	public void calculateSum(int... x) {
		int sum = 0;
		System.out.print("\nSum of ");
		for(int num: x) {
			System.out.print(num+" ");
			sum += num;
		}
		System.out.print("is : "+sum);
//		System.out.println("Sum of the numbers: "+sum);
	}

}
//ELC (main) class of Calculator, SimpleCalculator -> CalculatorTest.java

/*
Program to Design a Caluculator Program using interface
*/
public class CalculatorTest {

	public static void main(String[] args) {
		
		SimpleCalculator calc = new SimpleCalculator();
		
		calc.calculateSum(1,2,3);
		
		calc.calculateSum(10,20,30,40);
			
		calc.calculateSum(5);
		
		calc.calculateSum(0);
		
	}

}

/*
Sum of the numbers: 6
Sum of the numbers: 100
Sum of the numbers: 5
Sum of the numbers: 0
*/

/*
Sum of 1 2 3 is : 6
Sum of 10 20 30 40 is : 100
Sum of 5 is : 5
Sum of 0 is : 0
*/
