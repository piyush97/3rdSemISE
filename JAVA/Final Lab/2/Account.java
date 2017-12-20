//account
import java.util.*;
class Account
{
	Scanner scan=new Scanner(System.in);
	public int Accno,Phone_No;
	public String name;
	public float balance_amt;
	Account(int Accno,int Phone_No,String name,float balance_amt)
	{
		this.Accno=Accno;
		this.Phone_No=Phone_No;
		this.name=name;
		this.balance_amt=balance_amt;
	}
	void getinput()
	{
		System.out.println("Enter the name, phone number, balance, and account number");
		name=scan.nextLine();
		Phone_No=scan.nextInt();
		balance_amt=scan.nextFloat();
		Accno=scan.nextInt();
	}
	void Deposit()
	{
		System.out.println("Enter the amount you want to deposit");
		int deposit=scan.nextInt();
		balance_amt+=deposit;
	}
	void Withdraw()
	{
		System.out.println("Enter the amount you want to Withdraw");
		int Withdraw=scan.nextInt();
		balance_amt-=Withdraw;
	}
	void Print()
	{
		System.out.println("Balance is"+balance_amt);
	}
	public static void main(String[] args) {
		Account A=new Account(0,0,"ABC",100);
		A.getinput();
		A.Deposit();
		A.Withdraw();
		A.Print();		
	}
}