package MyCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Scanner; 
/* Read need for this program in ToughHashDemo1
 * Basically avoids creating multiple Marks ArrayLists to store different marks for different students 
 */

class Marks { 
	
	ArrayList<Integer> marks1 = new ArrayList(); 
	
	void setValue(int m1, int m2, int m3) { 
		
		marks1.add(m1); marks1.add(m2); marks1.add(m3);
	}
	void display() { 
		System.out.println("Marks are "+ marks1);
	}
}
public class ToughHashMapDemo2 {

	public static void main(String[] args) {
		
        HashMap<String, Marks> hm = new HashMap<String, Marks>();
        Marks omarks[] = new Marks[Integer.parseInt(args[0])]; 
        Scanner scan = new Scanner(System.in); 
        
        int m1, m2, m3 = 0; 
        
        for(int i = 0; i < omarks.length; i++ ) { 
        System.out.println("Enter first subject marks for Student "+ i+1);
        m1 = scan.nextInt(); 
        System.out.println("Enter second  subject marks for Student "+ i+1);
        m2 = scan.nextInt(); 
        System.out.println("Enter third subject marks for Student "+ i+1);
        m3 = scan.nextInt(); 
        omarks[i] = new Marks(); 
        	omarks[i].setValue(m1, m2, m3);
        	omarks[i].display();
        }
        
        Set<Map.Entry<String, Marks>> myset = hm.entrySet(); 
                	
		hm.put("Archie", omarks[0]); 
		hm.put("Betty", omarks[1]); 
		for(Map.Entry<String, Marks> me : myset) { 
			System.out.print(me.getKey() + " : "); 
			me.getValue().display(); 
		}	
		
	}

}
