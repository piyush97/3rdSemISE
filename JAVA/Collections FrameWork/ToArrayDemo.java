package MyCollections;

import java.util.ArrayList;
/* This is a simple piece of code used to demonstrate the use of 'toArray' method 
 * 
 */

public class ToArrayDemo {
	

	public static void main(String[] args) {
		
		ArrayList<String> ComicsList  = new ArrayList<String>(); 
		
		ComicsList.add("TinTin"); 
		ComicsList.add("Dennis");
		ComicsList.add("Popeye"); 
		
		System.out.println("Converting to plain String array "); 
		String sarry[] = new String[ComicsList.size()]; 
		sarry = ComicsList.toArray(sarry); 
		
         for (int i = 0; i<sarry.length; i++) { 
			
			System.out.println("Converted Array is "+sarry[i]);  
			
		}
		
		
		
	}

}
