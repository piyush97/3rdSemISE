package MyCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//This program demonstrates user-defined class having HashMap 
//It also demonstrates array of user defined classes 
import java.util.Scanner; 

class MyMarks { 
	
	ArrayList<Integer> marks1 = new ArrayList(); 
	String stname; 
	HashMap<String, ArrayList> hm = new HashMap<String, ArrayList>();
	
	void setMarks(int m1, int m2, int m3) { 
		
		marks1.add(m1); marks1.add(m2); marks1.add(m3);
	}
	void setName(String n) {
		stname = n; 
	}
	
	void addToHashMap() { 
		hm.put(stname, marks1);
	}
	void displayHM() {
		Set<Map.Entry<String, ArrayList>> myset = hm.entrySet(); 
		for(Map.Entry<String, ArrayList> me : myset) { 
			System.out.print(me.getKey() + " : "); 
			System.out.print(me.getValue()+"\n"); 
		}
	}
}
public class UserDefinedClassToughExample {

	public static void main(String[] args) {
		
        //Array of Objects of Marks Class 
		MyMarks omarks[] = new MyMarks[Integer.parseInt(args[0])]; 
        Scanner scan = new Scanner(System.in); 
        
        int m1, m2, m3 = 0; String str; 
        
        for(int i = 0; i < omarks.length; i++ ) { 
        	omarks[i] = new MyMarks(); 
        	System.out.println("Enter NAME of Student "+ i);
            str = scan.next(); 
            //scan.next(); 
            omarks[i].setName(str); 
        System.out.println("Enter first subject marks for Student "+ str);
        m1 = scan.nextInt(); 
        System.out.println("Enter second  subject marks for Student "+ str);
        m2 = scan.nextInt(); 
        System.out.println("Enter third subject marks for Student "+ str);
        m3 = scan.nextInt(); 
        
        	omarks[i].setMarks(m1, m2, m3);
        	
        
        	omarks[i].addToHashMap(); 
        	System.out.println("Details Entered into HashMap for Student "+i);
        	omarks[i].displayHM();
        }
        
        
		
	}

}

