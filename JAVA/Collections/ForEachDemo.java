package MyCollections;

import java.util.ArrayList;

/* This program demonstrates another way to iterate a collection - using for-each loop 
 * For-each loop is simpler to use. 
 * Limitations: 
 * a) It can iterate ONLY in the forward direction  
 * b) It cannot be used on its own to change the values of a collection. Its default implementation is read-only. 
 * Note: Line # 31 works because of the 'ArrayList' 'set' function. The for-each loop on its own does not support changes to collection object 
 */

public class ForEachDemo {

	public static void main(String[] args) {
		
		ArrayList <Integer> marks = new ArrayList<Integer> ();
		marks.add(26); marks.add(16); marks.add(12); marks.add(28); marks.add(21);
		int total = 0; 
		final int max = 5*30; 
		
		for(int i : marks) { 
			System.out.println(i + " "); 
			total +=i; 
		}
		
		System.out.println("Total Marks is "+total+" out of "+max); 
		
		int x = 0; 
		for(int i : marks) { 
			marks.set(x, 20); x++; 
			System.out.println(i + " "); 
			total +=i; 
		}
		
		System.out.println("Total Marks is "+total+" out of "+max); 
		
		//Old form of for loop - without for-each 
		System.out.println("\n Displaying with Old form of for loop - without for-each");  
		int size = marks.size(); 
		for (int i = 0; i < size; i++) { 
			
			System.out.println(marks.get(i) + " "); 
			total +=marks.get(i); 
		}
		System.out.println("Total Marks is "+total+" out of "+max); //total value is added to previous loop total 
		
        for (int i = 0; i < size; i++) { 
			
			marks.set(i, marks.get(i)+5); 
			System.out.println(marks.get(i) + " "); 
			total +=marks.get(i); 
		}
		System.out.println("Total with marks altered (+5) inside for loop "+total+" out of "+max); //total value is added to previous loop total 

	}// end of main 

}//end of ForEachDemo Class 
