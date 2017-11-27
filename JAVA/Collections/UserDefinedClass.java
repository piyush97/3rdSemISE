package MyCollections;

import java.util.*; 
/* This program demonstrates the use of user-defined classes (your own classes), inside a collection. 
 * Question: Why override the 'toString' method in Christmas? Answer given below. 
 */
class Christmas { 
	
	String carol, cake; 
	ArrayList <String>decorations; //Note the use of a collection object 'ArrayList' as member of a class 
	
	Christmas (String s1, String s2,ArrayList<String> al){ 
		carol = s1; 
		cake = s2; 
		decorations = al; //This is a perfectly valid assignment! 
	}
	//DEMO - Comment the toString method. The output will print junk. Why? 
	// Answer: toString method inherited from the 'object' class has to be overridden by Christmas. 
	
	public String toString() { 
		return carol + "\t" + cake + "\t" + decorations; 
	}
	/* Below method 'myToString' is only to demonstrate that we can use our version of 'toString' and do the over-riding 
	 * Only thing is, this method has to be called explicitly as shown in Line #69 as 'c.myToString()' 
	 * 'toString' is automatically called in Line #65  in  System.out.print(c+"\n"); 
	 */
	public String myToString() { 
		return "From myToString method : "+carol + "\t" + cake + "\t" + decorations; 
	}
	
}//end of class Christmas

public class UserDefinedClass {

	public static void main(String[] args) {
		
		//This code creates a LinkedList containing as its elements objects of Christmas 
		
		LinkedList<Christmas> objC = new LinkedList<Christmas>();
		
		ArrayList <String> deco1 = new ArrayList<String> ();
		ArrayList <String> deco2 = new ArrayList<String> ();
		
		deco1.add("Silver Ribbon"); 
		deco1.add("Green bulbs"); 
		deco1.add("Red Star"); 
		 
		System.out.println(deco1); 
		objC.add(new Christmas("Jingle Bells", "Black Forst", deco1)); 
					
			
		deco2.add("Golden Ribbon"); 
		deco2.add("Blue bulbs"); 
		deco2.add("White & Rose Star"); 
		deco2.add("Purple Tinklers");
		
		System.out.println(deco2); 
		
		objC.add(new Christmas("Silent Night", "Chocolate Fudge", deco2)); 
		
		System.out.println("Christmas Decorations are "); 
		//DEMO - For-each loop with Collections 
		
		for(Christmas c : objC) { 
			System.out.print(c+"\n"); 
		}
		
		for(Christmas c : objC) { 
			System.out.print(c.myToString()+"\n"); 
		}
		
		
	}

}
