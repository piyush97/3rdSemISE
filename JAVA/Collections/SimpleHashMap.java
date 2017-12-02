package MyCollections;
/* This program demonstrates the use of HashMap 
 * It implements the 'Map' interface, which expects key-value pairs. Keys are unique. 
 * It DOESNOT implement 'Collection' interface. Therefore, it does not implement 'Iterator' 
 * It cannot be used directly in a for-each loop. This is because for-each's implementation is done by using an Iterator 
 * Note the slightly complicate syntax of Line # 35 & Line #46 to 49. Read the explanation. Note how 'Set' is used in Line # 36 to #41 with Iterator 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Archie", 20); 
		hm.put("Ronnie", 21); 
		hm.put("Reggie", 27); 
		//Demo - Does not add the below value, because key 'Reggie' is duplicate. No compilation error is generated for duplicate keys
		hm.put("Reggie", 22); 
		// Demo - Null Keys are accepted in HashMaps 
		hm.put("", 23);
		//Demo - Only ONE null key is accepted in HashMaps, the latest one entered. 
		// Reason - Duplicate Keys are not possible in HashMaps which implement the Map interface 
		hm.put("", 25);
		
		// Note: Line # 35 - Difficult syntax to remember. 
		/* Meaning : 'Entry' is an Inner Class of the 'Map' interface 
		 * It contains the method 'entrySet' which returns a 'Set' object. Note that Set cannot have duplicate values. 
		 * Note: Iterator is used NOT for the HashMap directly. It is used on the 'Set' - 'myset'
		 */
		Set<Map.Entry<String, Integer>> myset = hm.entrySet(); 
		Iterator itr= myset.iterator(); 
		System.out.println("\nPrinted through iterator - Set is "); 
        while(itr.hasNext()) { 
			
			System.out.println(itr.next()); 
		}//end of itr while 
        
        /* for-each loop is used essentially on 'myset' here, NOT on the HashMap directly 
         * Reason - HashMaps does not implement the Iterator interface. It does not implement 'Collection' interface 
         */
		for(Map.Entry<String, Integer> me : myset) { 
			System.out.print(me.getKey() + " : "); 
			System.out.print(me.getValue()+"\n"); 
		}
		
		hm.put("Archie", hm.get("Archie")+5); 
		System.out.println("New Marks for Archie is "+hm.get("Archie")); 

	}

}
