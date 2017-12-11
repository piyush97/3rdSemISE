import java.util.HashMap;
import java.util.*;
public class ShopC {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the no of customers\n");
		int n=s.nextInt();
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the customer id\n");
			int id=s.nextInt();
			System.out.println("Enter thecustomer credit points\n");
			int cp = s.nextInt();
			hm.put(id, cp);
		}
		Set<Map.Entry<Integer,Integer>>set=hm.entrySet();
		for(Map.Entry<Integer,Integer>me:set)
		{
			if((me.getKey()>=105)&&(me.getKey()<=120))
			{
				hm.put(me.getKey(),me.getValue()+20);
			}
			if((me.getKey()>=120)&&(me.getKey()<=200))
					{
				        hm.put(me.getKey(),me.getValue()+30);
					}
		System.out.println("For customer ID" +me.getKey());
		System.out.println("for customer credit points" +me.getValue());
		}
	}

}
