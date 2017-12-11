package student;

import java.util.*;

class RegisterStudent 
{
   
    void total(int cd)
    {
              int TotalCredits=cd;
	try
		{
			if(TotalCredits>30)
		    {
			throw new CreditLimit(TotalCredits);
		    }
			else
			{
				System.out.println("The Total credit is:"+TotalCredits);
			}
		}
		catch(Exception e)
		{
			System.out.println("Total Credits is more than 30");
		}
     }
}
class CreditLimit extends Exception
{
	CreditLimit(int i)
   {
	   System.out.println("The Total credit is:"+i);
   }
}
public class Student {

	static Scanner s;
	public static void main(String[] args) 
	{
		s = new Scanner(System.in);
		System.out.println("Enter the total credit:");
		int c=Integer.parseInt(s.next());
		RegisterStudent  r=new RegisterStudent ();
 r.total(c);
	}
}
