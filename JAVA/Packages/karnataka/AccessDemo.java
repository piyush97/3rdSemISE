package Karnataka;

public class AccessDemo { //Non-Related Class 

	public static void main(String[] args) {
		
		/* ILLUSTRATING difference between DEFAULT and PROTECTED Attributes
		 * 
		 */
		KarFestival objKarAccess = new KarFestival("Republic Day","Fixed",1,true, "January","26"); 
		
		String s1 = objKarAccess.fesDateRange; //Demo - VISIBLE - "fesDateRange" is public in sub-class "KarFestival"
        String s2 = objKarAccess.fesMonth; //Demo - VISIBLE - "fesMonth" is public in sub-class "KarFestival"
        String s3 = objKarAccess.fesName; //Demo - VISIBLE- "fesName" is public in parent class "Festival"
        String s4 = objKarAccess.fesMonthFixed; //Demo-VISIBLE-"fesMonthFixed" is default / package scope in sub-class "KarFestival"
        
        System.out.println("Displaying in Main...."+"Festival Range of Dates is "+s1+" Festival Month is "+s2+
	    		" Festival Name is "+s3+" Festival Month Fixed is "+s4); 
        
	    //int i = objKarAccess.fes_no_of_days; 
	    // DEMO - VISIBLE - "fes_no_of_days" though protected is visible to a non-related class within same package 
	    
	    /*System.out.println("Displaying in Main...."+"Festival Range of Dates is "+s1+" Festival Month is "+s2+
	    		" Festival Name is "+s3+" Festival Month Fixed is "+s4+" No of days of Festival is "+i); */
	}

}
