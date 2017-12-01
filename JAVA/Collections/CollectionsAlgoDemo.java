package MyCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*This program demonstrates the use of Algorithms in 'Collections' 
 * Notice Line # 27 & # 36. The same method 'shuffle' is used for two different collection objects - LinkedList and ArrayList 
 * It is called as 'Collections.shuffle(<Collection object>)', where the algorithm works on any Collection object passed except 'HashMap' 
 */

public class CollectionsAlgoDemo {

	public static void main(String[] args) {
		LinkedList<Integer> L1 = new LinkedList<Integer>(); 
		ArrayList<String> L2 = new ArrayList<String>(); 
		
		L1.add(-1); 		L1.add(1); 		L1.add(2); 
		L2.add("FiveStar"); 		L2.add("Munch"); 		L2.add("KitKat");
		Comparator<Integer> comp = Collections.reverseOrder();
		Collections.sort(L1,comp);
		System.out.println("After Rever Order Sorting");
		for(int i: L1) { 
			System.out.println(i+ " ");
		}
		Collections.shuffle(L1);
		System.out.println("After Shufflin");
		for(int i: L1) { 
			System.out.println(i+ " ");
		}
		System.out.println("Before Shufflin");
		for(String i: L2) { 
			System.out.println(i+ " ");
		}
		Collections.shuffle(L2);
		System.out.println("After Shufflin");
		for(String i: L2) { 
			System.out.println(i+ " ");
		}
		System.out.println("Max Element is "+Collections.max(L1)); 
		System.out.println("Min Element is "+Collections.min(L1));

	}

}
