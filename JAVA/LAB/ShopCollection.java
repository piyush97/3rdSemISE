import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class ShopCollection {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
     System.out.println("Enter the number of customers");
     int n = sc.nextInt();
     HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
     for(int i=0;i<n;i++)
     {
    	 System.out.println("Enter the customer id");
    	 int id = sc.nextInt();
    	 System.out.println("Enter the customer credit points");
    	 int cp = sc.nextInt();
    	 hm.put(id, cp);
    	  	 
     }
     // to iterate and update the contents in the map
     Set<Map.Entry<Integer,Integer>> set = hm.entrySet();
     for(Map.Entry<Integer, Integer> me :set)
     { 
    	 if((me.getKey()>= 105) && (me.getKey()<=120))
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
