import java.util.*;
class bakery
{
	String itemname;
	int price;
	int quantity;
	
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("pls input the item u desire");
		itemname=sc.next();
		System.out.println("pls enter the price of comodities desired");
		price=sc.nextInt();
		System.out.println("enter the quantity u desire");
		quantity=sc.nextInt();
		
		
	}
	final void pricetopay()
	{
		int price1;
		price1=quantity*price;
		System.out.println("The total price to pay is"+price1);
	}
}

public class extra1 
{
	public static void main(String []args)
	{
		bakery a=new bakery();
		a.getdata();
		a.pricetopay();
	}

}
