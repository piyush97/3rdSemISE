package MyCollections;

import java.util.*; 

/* LinkedList implements the List, Deque and Queue interfaces
 * "class LinkedList<E> extends AbstractSequentialList implements List, Deque, Queue" is the signature of this class 
 * Deque interface has methods 'addFirst', add'Last' , 'removeFirst', 'removeLast' along with 'add', 'remove'. 
 * Deque also has methods 'getFirst', peekLast' etc. 
 * The advantage of LinkedList is that it supports dynamic lists that can grow and shrink in size 
 * List element manipulation can happen from both the ends of the list since it implements Deque
 */

public class MyLinkedList {

	public static void main(String[] args) {
		
		//LinkedList ComicsList  = new LinkedList(); 
		//DEMO - Uncommeting below line will cause warnings in places where ComicList is used because type of list elements is not defined making the list generic
		LinkedList<String> ComicsList  = new LinkedList<String>(); 
		
		//Adding elements 
		ComicsList.add("TinTin"); 
		ComicsList.add("Dennis");
		ComicsList.add("Popeye"); 
		
		System.out.println("Displaying the contents of ComicsList: " + ComicsList); 
		
		//Adding in the end
		ComicsList.addLast("SuperMan");
		System.out.println("After addLast commaand: ComicsList is " + ComicsList); 
		
		//Adding in the beginning
		ComicsList.addFirst("BatMan");
		System.out.println("After addFirst commaand: ComicsList is " + ComicsList); 
		
		//Adding in between 
		ComicsList.add(3, "Tinkle");
		ComicsList.add(4, "Amar Chitra Katha");
		ComicsList.add(5, "SpiderMan");
		System.out.println("After add with position commaand: 4th to 6th values changed in ComicsList is " + ComicsList); 
		
		//Updating the list 
		
		ComicsList.set(2,  ComicsList.get(2)+" The Menace "); 
		
		System.out.println("After 'set' commaand: ComicsList is " + ComicsList); 
		
		//Deleting from the beginning 
		ComicsList.removeFirst(); 
		System.out.println("After removeFirst commaand: ComicsList is " + ComicsList); 
		
		//Deleting from the end 
		ComicsList.removeLast(); 
		System.out.println("After removeLast commaand: ComicsList is " + ComicsList); 
		
		//Deleting in between 
		ComicsList.remove(4); 
		System.out.println("After remove with position commaand: 5th values changed in ComicsList is " + ComicsList); 
		
		System.out.println("ComicList has "+ ComicsList.size() + " elements"); 
		
		System.out.println("First element is after peekFirst command " + ComicsList.peekFirst()); 
		System.out.println("Last element is after peekLast command " + ComicsList.peekLast()); 
		
		
		String first = (String)ComicsList.getFirst(); 
		System.out.println("After getFirst Command - First element is " + first); 
		System.out.println("After getLast Command - Last element is " + ComicsList.getLast()); 
		
		ComicsList.removeAll(ComicsList); 
		System.out.println("ComicList has "+ ComicsList.size() + " elements"); 
		
		System.out.println("Demonstrating difference between peekLast & getLast");  
		
		System.out.println("After peekLast Command " + ComicsList.peekLast()); 
		System.out.println("After getLast Command " + ComicsList.getLast()); 
					
		}

}
