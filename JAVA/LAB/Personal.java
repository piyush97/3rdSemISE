package javalab;
import java.util.Scanner;
public class Personal {
	public int age,exp;
	public static int loans;
	public String name,education;
	static float salary;
	public float basic,dra,Tax,hra,loanAmount;	
	Personal(){
		age=25;
		exp=10;
		loans=0;
		name="Abc";
		education="B.E";
		basic=100000;
		loanAmount=1000;
		
	}
	void isEligible(float salary, int loans)
	{
		if(loans<3 && salary>=30000)
			System.out.println("You're eligible for loan");
		else
			System.out.println("You're not eligible for loan, sorry");
	}
	void taxPay(float basic)
	{
		dra=(basic/100)*25;
		hra=(basic/100)*2;
		Tax=basic-dra-hra;
		System.out.println("tax to be paid is"+Tax);
	}
	void isEligiblePromotion(int exp)
	{
		if(exp>4)
		{
			System.out.println("Elgible for promotion");
			
		}
		else 
		{
			System.out.println("You're not eligible for promotion");
		}
	}

	void Display()
	{
		System.out.println("Salary is:"+salary);
		System.out.println("Experience is:"+exp);
		
		
	}
	public static void main(String args[])
	{
		final int choice;
		Personal f1= new Personal();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice 1.to check eligiblity for loan 2.to check the tax 3. to check whether the person is eligible for promotion or not 4. to display the details required  ");
		choice=s.nextInt();
		salary=s.nextFloat();
		
		switch(choice)	
		{
		case 1:
			f1.isEligible(salary,loans);
			break;
		case 2:
			f1.taxPay(salary);
			break;
		case 3:
			f1.Display();
			
			
		}
		

	}
}
