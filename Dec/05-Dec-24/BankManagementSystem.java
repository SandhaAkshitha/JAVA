
package dec_05_24;

class Account
{
	String accountNumber;
	double balance;
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
		public double getBalance() {
		return balance;
	}
	
	
	public Account generateStatement()
	{
		System.out.println("AccountNumber: "+accountNumber+"current balance:"+balance);
		return new Account(accountNumber,balance);
	}
}
class SavingsAccount extends Account
{

	double intresteRate;

	public SavingsAccount(String accountNumber, double balance, double intresteRate) {
		super(accountNumber, balance);
		this.intresteRate = intresteRate;
	}
	public SavingsAccount generateStatement()
	{
		System.out.println("AccountNumber: "+accountNumber+"current balance: "+balance+"intrest rate: "+intresteRate);
		return new SavingsAccount(accountNumber,balance,intresteRate);
	}
	
}
class CheckingAccount extends Account
{
	double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	public CheckingAccount generateStatement()
	{
		System.out.println("AccountNumber: "+accountNumber+"current balance: "+balance+"overdraft: "+ overdraftLimit);
	 return new CheckingAccount(accountNumber,balance,overdraftLimit) ;
	 }
}
public class BankManagementSystem 
{

	public static void main(String[] args) 
	{
		SavingsAccount s=new SavingsAccount("SBI00123",20000,3.0);
		s.generateStatement();
		CheckingAccount c=new CheckingAccount("ADR123",50000,1000);
		c.generateStatement();
	}

}
