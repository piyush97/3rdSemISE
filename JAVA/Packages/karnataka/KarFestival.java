package Karnataka;

public class KarFestival extends Festival{ 
	
	public String fesMonth; 
	public String fesDateRange; 
	public KarFestival(String fname, String fmonthfixed, int fnodays, boolean fstate, String fmonth, String fdaterange){ 
		
		fesName = fname; 
	    fesMonthFixed = fmonthfixed; 
		fes_no_of_days = fnodays; 
		// stateFes = fstate; //DEMO - "stateFes" private in parent class. Not visible to child class 
		// How to set private attribute "stateFes" value in child class? 
		setstateFes(fstate); 
		fesMonth = fmonth; 
		fesDateRange = fdaterange; 
		
	}//end parameterized constructor 
	
	//void display() { } // DEMO - Wont work, since it expects "over-riding" as String display() of parent class 
	
	public void display(String str) { 
		
		System.out.println("The Karnataka festival "+str); 
		System.out.println(super.display()); // Calls parent class display function and outputs it to user 
		
		
		if(getsateFes()) { 
			System.out.println("Festival occurs in "+fesMonth+
			" and is celebrated by institutions & Govt. across the state between "+fesDateRange);
		}
		else System.out.println("Festival usually occurs in "+fesMonth+" between "+fesDateRange+
				" Its celebrated by people of the state in their homes");
		
	}//end of display function in Karnataka 
	
} //end class Karfestival
