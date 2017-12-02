package MyCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* This program demonstrates HashSet 
 * It implements the 'Set' interface, which does not allow duplicate elements.  
 * It DOESNOT guarantee  any order of displaying elements 
 * Unlike HashMaps - It implements 'Collection' interface. Iterator and For-each loop can be used directly. 
 */


public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Eggs");
		hs.add("Noodles"); 
		hs.add("Coffee"); 
		hs.add("Doughnut"); 
		hs.add("Milk"); 
		System.out.println("\n HashSet does not maintain oder of eleemets");
		System.out.println("Breakfast is "+hs); 
		
        LinkedHashSet<String> Lhs = new LinkedHashSet<String>();
		
		Lhs.add("Eggs");
		Lhs.add("Noodles"); 
		Lhs.add("Coffee"); 
		Lhs.add("Doughnut"); 
		Lhs.add("Milk"); 
		
		System.out.println("\n LinkedHashSet maintains oder of inserting eleemets");
		System.out.println("Breakfast is "+Lhs); 
		
		
		System.out.println("\n We can use an Iterator directly with the HashSet. It implements 'Collection' interface - unlike HashMap"); 
		Iterator<String> itr= hs.iterator(); 
		System.out.println("\nPrinted through iterator - Breakfast is "); 
        while(itr.hasNext()) { 
			
			System.out.println(itr.next()); 
		}//end of itr while 
		
		
	}

}
