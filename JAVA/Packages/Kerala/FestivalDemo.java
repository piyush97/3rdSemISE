package Kerala;

import Karnataka.*; 

public class FestivalDemo {

	public static void main(String[] args) {
		
		KarFestival objKar1 = new KarFestival("Rajyotsava","Fixed",30,true, "November","1-30"); 
		
		objKar1.display("details are \n"); 
		
        KerFestival objKerala1 = new KerFestival("Kerala Piravi","Fixed",7,true, "November","1-7"); 
		
		objKerala1.display("details gathered are \n"); 
		
        KerFestival objKerala2= new KerFestival("Vishu","Not Fixed, follows Lunar Calendar",1,false, "April","12-15"); 
        
        /* ILLUSTRATING difference between PUBLIC and PROTECTED Methods 
         * 
         */
		
		objKerala2.display("details gathered are \n"); 
		//DEMO =  "display" is a public method - visible for non-related class "FestivalDemo"
		
		System.out.println("****\n"+objKerala2.display()); 
		/* DEMO - Calling "display" of parent class "Festival" from non-related class "FestivalDemo" 
		 * Made possible because "display" is public in parent class "Festival"
		 */
		
		// objKerala2.setstateFes(true); 
		//DEMO =  "setstateFes" is a protected method - not visible for non-related class "FestivalDemo"
		
		/* ILLUSTRATING that ALL attributes except "public" has to be accessed via "public" method functions 
		 * in non-related class "FestivalDemo"
		 */
         objKar1.fesName = "Ganesha"; //Demo - "fesName" is public in parent class "Festival"
         objKar1.fesMonth = "October"; //Demo - "fesMonth" is public in sub-class "KarFestival"
         objKar1.fesDateRange = "1-15"; //Demo - "fesDateRange" is public in sub-class "KarFestival"
         
         
         
     	// DEMO - "stateFes" is private in sub-class "KarFestival", not visible for non-related class "FestivalDemo" 
     	objKar1.setstateFes(false); // DEMO - Change to "true" and see output change 
     	
         // DEMO "fesMonthFixed" has only Default or Package Scope in "Karnataka" package. Not visible in Kerala Package 
         objKar1.setfesMonthFixed("Not Fixed - LUNAR Calendar based");
         
         //DEMO - "fes_no_of_days" is "protected" in sub-class "KarFestival", not visible for non-related class "FestivalDemo"
         objKar1.setfes_no_of_days(15);
         
         System.out.println("\n**** PROTECTED vs PUBLIC Demo*******\n"); 
         objKar1.display("NEW details gathered are"); 
                
	}//end of Main 

}//end of FestivalDemo
