package Lab2017; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab12 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> shopowner = new HashMap<Integer, Integer>();
		
		for(int i = 100, j=10; i <=200; i++, j++) { 
			shopowner.put(i,j); 
			
		}
		
		System.out.println("Initial Values are"); 
		Set<Map.Entry<Integer, Integer>> myset = shopowner.entrySet(); 
		int line = 0; 
		for(Map.Entry<Integer, Integer> me : myset) { 
			System.out.print("Cust ID " + me.getKey() + " : "); 
			System.out.print("Credit Points "+ me.getValue()+" ^ "); line++; 
			if(line == 5) {System.out.print("\n"); line = 0; }
		}
		System.out.println("\nFor Customer ID 105 to 120 Credits to be increased to 20"); 
		System.out.println("\nFor Customer ID 125 to 200 Credits to be increased to 30\n"); 
		line = 0; 
		for(Map.Entry<Integer, Integer> me : myset) { 
			
			int key = me.getKey();
			int value = me.getValue(); 
            if (key >= 100 && key <105) { 
				
				if(line == 3) {System.out.print("\n"); line = 0; }
				System.out.print(" Key " + key+ " : Original Value " + value + " ^^ "); line++; 
				System.out.print(" New Value "+me.getValue()); 
				
			}
				
				if (key >= 105 && key <=120) { 
				//Note the use of 'shopowner' instead of 'me' to update values in HashMap 
				shopowner.put(key, value+20); 
				if(line == 3) {System.out.print("\n"); line = 0; }
				System.out.print(" Key " + key+ " : Original Value " + value + " ^^^ "); line++; 
				System.out.print(" New Value "+me.getValue()); 
				
			}
			if (key >= 125 && key <=200) { 
				shopowner.put(key, value+30); 
				if(line == 3) {System.out.print("\n"); line = 0; }
				System.out.print(" Key " + key+ " : Original Value " + value + " ^^^^ "); line++; 
				System.out.print(" New Value "+me.getValue()); 
				
			}
			
		}
	}//end main 

}//end class Lab2
