package MyCollections;

import java.util.Arrays;
// This program demonstrate use of 'Arrays' class & some algorithms the class has 

/* Answer to Question  - Which Sorting Algorithm is internally used?  
 *  I got the answer from within Eclipse documentation itself on typing "Arrays. "
 *  Apparently Java folks used "Dual Pivotal Quick Sort algorithm" written by three people including a Russian sounding name 
 *  Read up on this algorithm after understanding "Single Pivotal Quick Sort", the default implementation of Quick Sort 
 */

public class ArraysDemo {

	public static void main(String[] args) {
		
		int num[]  = new int[10]; 
		
		for(int i = 0; i<6; i++) { 
			
			num[i] = i+5; 
			
		}
        System.out.println(" Initial array is - notice last four elements having element 0 - put automatically by JRE");
		
        for(int i : num) { 
			
			System.out.println(i + " "); 
		}
		
		Arrays.fill(num,1,3,100);
        System.out.println(" After filling 2nd & 3rd element with 100 ");
		
        for(int i : num) { 
			
			System.out.println(i + " "); 
		}
        //Demo - comment below line (line # 38 to 44) & then see result of line #39 - read comment in line #49
		Arrays.sort(num);
		System.out.println(" After Sorting - notice all the 0s appearing at the top ");
		
        for(int i : num) { 
			
			System.out.println(i + " "); 
		}
        //Demo - Try calling 'binarySearch' on unsorted 'num' array. Gives crazy result - with negative index returned 
        System.out.println(" Index of searched element is "+Arrays.binarySearch(num, 8));
        
        int numbers[] = {5,6,7,8,10,0,0,0,0}; 
        //DEMO - 'num' is changed to have 100 instead of '6' and '7'. So they are unequal
        System.out.println(" Are the two arrys equal? " + Arrays.equals(num,numbers));
        
     
		
	}//end main 

}//end class ArrayDemo
