package MyCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* This program demonstrates adding an ArrayList as value to a Key in HashMap. 
 * Here marks1 and marks2 are two ArrayLists created to enter the marks of "Archie" and "Veronica" respectively 
 * Note: The 'put' method of HashMap is implemented internally to replace any value wherever the object value associated with 'put' occurs 
 * This means "Archie" and "Reggie" will be replaced with new marks of 'marks1' while "Veronica" will not be, because she has 'marks2' 
 * This is NOT a bug with HashMaps or ArrayLists. This is the way it is internally implemented 
 * Solution to avoid multiple ArrayLists - create a user defined class with ArrayList and use it with HashMaps 
 * Demonstrate in the code ToughHashMapDemo2.java
 */

public class ToughHashMapDemo1 {

	public static void main(String[] args) {
		
        HashMap<String, ArrayList> hm = new HashMap<String, ArrayList>();
        
        ArrayList<Integer> marks1 = new ArrayList(); 
        ArrayList<Integer> marks2 = new ArrayList(); 
        Set<Map.Entry<String, ArrayList>> myset = hm.entrySet(); 
        
        marks1.add(20);marks1.add(23);marks1.add(21);
		
		hm.put("Archie", marks1); 
		for(Map.Entry<String, ArrayList> me : myset) { 
			System.out.print(me.getKey() + " : "); 
			System.out.print(me.getValue()+"\n"); 
		}	
		marks1.clear(); 
		
		marks2.add(25);marks2.add(13);marks2.add(18);
		
		hm.put("Veronica", marks2); 
		
        marks1.add(15);marks1.add(16);marks1.add(18);
		
		hm.put("Reggie", marks1); 
		
		for(Map.Entry<String, ArrayList> me : myset) { 
			System.out.print(me.getKey() + " : "); 
			System.out.print(me.getValue()+"\n"); 
		}
		marks1 = (ArrayList<Integer>)hm.get("Archie"); 
		int x = 0; 
		for(int i : marks1) { 
		  marks1.set(x,marks1.get(x)+5); x++; 
			
		}
		hm.put("Archie", marks1); 
		System.out.println("New Marks for Archie is "+hm.get("Archie")); 
		

	}

}
