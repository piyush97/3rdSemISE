package Kerala;

import Karnataka.*; 

public class KerFestival extends Festival{
	
	String fesMonth; 
	protected String fesDateRange; 
	KerFestival(String fname, String fmonthfixed, int fnodays, boolean fstate, String fmonth,String fdaterange){ 
		
		fesName = fname; 
		//fesMonthFixed = fmonthfixed; // DEMO - "fesMonthFixed" not visible outside "Karataka" package 
		
		setfesMonthFixed(fmonthfixed); /*DEMO - this method has to be either "protected" or "public" in parent class 
		in order for it to be visible in "Kerala" package */ 
		
		fes_no_of_days = fnodays; 
		// stateFes = fstate; //DEMO - "stateFes" private in parent class. Not visible to child class 
		// How to set private attribute "stateFes" value in child class? 
		setstateFes(fstate); 
		fesMonth = fmonth; 
		fesDateRange = fdaterange; 
		
	}//end parameterized constructor 
	
	//void display() { } // DEMO - Wont work, since it expects "over-riding" as String display() of parent class 
	
	void display(String str) { 
		
		System.out.println("\nThe Kerala Festival "+str); 
		
		System.out.println(super.display()); // Calls parent class display function and outputs it to user 
		// DEMO - Note that 'super' need not be the first statement in a non-constructor method 
		
		if(getsateFes()) { 
			System.out.println("Festival occurs in "+fesMonth+
					" and is celebrated by institutions & Govt. across the state between "+fesDateRange);
		}
		else System.out.println("Festival usually occurs in "+fesMonth+" between "+fesDateRange+
				" Its celebrated by people of the state in their homes");
		
	}//end of display function in Kerala
	
} //end class Kerfestival	
	


