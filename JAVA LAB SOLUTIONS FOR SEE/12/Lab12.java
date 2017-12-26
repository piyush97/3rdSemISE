import java.util.*;
public class ShopCollection
{
	public static void main(String[] args) {
		int n;
	Scanner S=new Scanner(System.in);
	//we'll be using hashmaps in this programs
	System.out.println("Enter the number number of customers");
	n=S.nextInt();
	HashMap <Integer,Integer> hashhash=new HashMap<Integer,Integer>();
	for (int i=0;i<n ;i++ )//to take values
	{
			System.out.println("Enter Customer ID please");
			int CustomerId=S.nextInt();
			System.out.println("Enter the credit Points please ");
			int CreditPoint=S.nextInt();
			hashhash.put(CustomerId,CreditPoint);
	}

	//for increasing points for customer
	set<Map.Entry<Integer,Integer>> set=hashhash.entrySet();
	for (Map.Entry<Integer,Integer> MapEntry:set ) 
	{

		if((MapEntry.getEntry()>=105)&&	(MapEntry.getEntry()>=120))
			 {
    		 hm.put(me.getKey(), me.getValue()+20);
    		  	 }
    	 if((me.getKey()>= 125) && (me.getKey()<=200))
    	 {
    		 hm.put(me.getKey(), me.getValue()+30);
    		  	 }
    	 System.out.println("for Customer id "+me.getKey()+" credit points are "+me.getValue());
     }
     
	}

}
