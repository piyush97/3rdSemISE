import java.util.*;
class Animal
{
	String name;
	String gender;
	int age;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("name of animal");
		name=sc.next();
		System.out.println("enter the gender");
		gender=sc.next();
		System.out.println("enter the age");
		age=sc.nextInt();
	  sc.close();
	  System.out.println("name of animal is"+name+"gender is"+gender+"age is"+age);
	}
}

class vet
{
	String injection;
	void giveinjection()
	{    Scanner sc=new Scanner(System.in);
	     System.out.println("enter the new medicine name given to vet");
	      injection=sc.next();
		Animal c=new Animal();
		c.getdata();
		
		System.out.print("medicine received is+"+injection);
		sc.close();
		
	}
	
	
}



public class extra3 {

	public static void main(String[] args)
	{
		
	vet c=new vet();
	c.giveinjection();
	
			
	
	}

}

