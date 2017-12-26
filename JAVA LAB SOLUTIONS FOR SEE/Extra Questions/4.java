import java.util.*;
class icecream
{
	Scanner sc=new Scanner(System.in);
	int price;
	int qty;
    String name;
    String flavor;
    void pricetopay()
    {
    	int price2;
    	price2=qty*price;
    	System.out.println("total paid amount is "+price2);
    }
    void getname()
    {
    	System.out.println("enter the name of icecream");
    	name=sc.next();
    }
    void getflavor()
    {
    	System.out.println("enter the flavor");
    	flavor=sc.next();
    }
    void getdata()
    {
    	System.out.println("enter the price");
    	price=sc.nextInt();
    	System.out.println("enter the quantity");
    	qty=sc.nextInt();
    	
    }
}

final class coneicecream extends icecream
{
	String derivedflavor ;
	void extra()
	{
		System.out.println("enter the subtaste of your flavor"+flavor);
		derivedflavor=sc.next();
	}
	void display()
	{
	System.out.println("name is"+name+"price  is"+price+"flavor is"+flavor+"subflavor is"+derivedflavor);	
	}
	
}

final class cupicecream extends icecream
{
	void display()
	{
	System.out.println("name is"+name+"price  is"+price+"flavor is"+flavor);	
	}
	
}
public class extra4 {

	public static void main(String[] args)
	{
		 icecream c= new icecream();
		 coneicecream a=new coneicecream ();
		 a.getname();
		 
		a.getflavor();
		 a.getdata();
		 a.extra();
		 a.display();
		 cupicecream b=new cupicecream();
		 b.getname();
		 b.getflavor();
		 b.getdata();
		 b.display();
		 
		 
	}

}


