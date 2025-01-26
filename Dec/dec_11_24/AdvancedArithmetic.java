
package dec_11_24;

interface AdvancedArithmetic1 
{
	public abstract int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic1
{
    @Override
	public int divisorSum(int n) {
		int sum=0;
		if( n <= 0)
		{
			System.err.println("Error : input must be postive");
		}
		for(int i =1; i<=n;i++)
		{
			if(n % i==0)
			{
				sum = sum+i;
			}	
		}	
		return sum;
	}	
}
public class AdvancedArithmetic
{
	public static void main(String[] args) {
		MyCalculator a = new MyCalculator();
		int res=a.divisorSum(6);
		System.out.println("Total divisor sum:"+res);
	}
}

