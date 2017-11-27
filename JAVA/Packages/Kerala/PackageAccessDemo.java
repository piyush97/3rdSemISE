package Kerala;

import Karnataka.*;

public class PackageAccessDemo extends Festival{ //Non-Related Class 

	public void Method(){
		
		/* ILLUSTRATING difference between DEFAULT and PROTECTED Attributes
		 * 
		 */
		KarFestival objKarAccess1 = new KarFestival("Republic Day","Fixed",1,true, "January","26"); 
		
		String s1 = objKarAccess1.fesDateRange; //Demo - VISIBLE - "fesDateRange" is public in sub-class "KarFestival"
        String s2 = objKarAccess1.fesMonth; //Demo - VISIBLE - "fesMonth" is public in sub-class "KarFestival"
        String s3 = objKarAccess1.fesName; //Demo - VISIBLE- "fesName" is public in parent class "Festival"
        
        //String s4 = objKarAccess1.fesMonthFixed; //Demo-NOT VISIBLE-"fesMonthFixed" is default / package scope in sub-class "KarFestival"
	    
	    System.out.println("Displaying in Main...."+"Festival Range of Dates is "+s1+" Festival Month is "+s2+
	    		" Festival Name is "+s3); 
	    
       //int i = objKarAccess1.fes_no_of_days; 
	    
	   // DEMO - VISIBLE - "fes_no_of_days" though protected is visible to a non-related class within same package 
	}

}