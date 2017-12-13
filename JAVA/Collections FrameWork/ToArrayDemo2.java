package MyCollections;

import java.util.ArrayList;

/* The purpose of this program is to demonstrate the need for 'toArray' method 
 * Explanation: 
 * You are not allowed to change the class Legacy. You have to use as it is. 
 * Problem: It takes a normal string array and not an ArrayList, while you have created an ArrayList of Comics 
 * The only solution is to convert the ArrayList to an array of strings 
 * This is done in the 'convertingToArray' code 
 */

class Comics{ 
	
ArrayList<String> ComicsList  = new ArrayList<String>(); 
	
	void addElements() { 
		
		ComicsList.add("TinTin"); 
		ComicsList.add("Dennis");
		ComicsList.add("Popeye");
		
		System.out.println("Elements are "+ComicsList); 
		
	}
	void convertingToArray() { 
		
			System.out.println("Converting to plain String array "); 
			String sarry[] = new String[ComicsList.size()]; 
			
		    sarry = ComicsList.toArray(sarry); 
		    
		    Legacy oLegacy = new Legacy(); 
			
			oLegacy.legacyMethod(sarry, sarry.length); 
			} 
		
	}//end of class Comics 
	

class Legacy {
	
	void legacyMethod(String s[],int len) { 
		
      for (int i = 0; i<len; i++) { 
			
			System.out.println("Converted Array is "+s[i]);  
			
		}
	}
} // end of class Legacy 
	
public class ToArrayDemo2 {
	
	public static void main(String[] args) {

		
	Comics ocomics = new Comics();
	ocomics.addElements();
	ocomics.convertingToArray();


	}

}//end of ToArrayDemo2
