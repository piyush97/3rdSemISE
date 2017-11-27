package MyCollections;

import java.util.ArrayList;

/* ArrayList implements the List interface only 
 * "class ArrayList<E> extends AbstractClass implements List" is the signature of this class 
 * List interface DOESNOT have methods 'addFirst', add'Last' , 'removeFirst', 'removeLast' 
 * It only has 'add', 'remove'. 
 * The advantage of ArrayList is that it supports dynamic arrays that can grow in size without giving upfront the size of the array 
 * The ArrayList can also dynamically shrink in size 
 * So, it is essentially a variable length array of object references 
 */

public class MyArrayList {

	public static void main(String[] args) {
		
		//ArrayList ComicsList  = new ArrayList(); 
		//DEMO - Uncommenting below line will cause warnings in places where ComicList is used because type of list elements is not defined making the list generic
		ArrayList<String> ComicsList  = new ArrayList<String>(); 
		
		//Adding elements 
		ComicsList.add("TinTin"); 
		ComicsList.add("Dennis");
		ComicsList.add("Popeye"); 
		
		System.out.println("Displaying the contents of ComicsList: " + ComicsList); 
		
		//Adding in the end
		ComicsList.add(ComicsList.size(), "SuperMan");
		System.out.println("After adding in the end: ComicsList is " + ComicsList); 
		
		//Adding in the beginning
		ComicsList.add(0,"BatMan");
		System.out.println("After adding in beginning : ComicsList is " + ComicsList); 
		
		//Adding in between 
		ComicsList.add(3, "Tinkle");
		ComicsList.add(4, "Amar Chitra Katha");
		ComicsList.add(5, "SpiderMan");
		System.out.println("After add with position commaand: 4th to 6th values changed in ComicsList is " + ComicsList); 
		
		//Updating the Arraylist 
		
		ComicsList.set(2,  ComicsList.get(2)+" The Menace "); 
		
		System.out.println("After 'set' commaand: ComicsList is " + ComicsList); 
		
		//Deleting from the beginning 
		ComicsList.remove(0); 
		System.out.println("After removeing from beginning ComicsList is " + ComicsList); 
		
		//Deleting from the end 
		ComicsList.remove(ComicsList.size()-1); 
		System.out.println("After remove in the end ComicsList is " + ComicsList); 
		
		//Deleting in between 
		ComicsList.remove(4); 
		System.out.println("After remove with position commaand: 5th values changed in ComicsList is " + ComicsList); 
		
		System.out.println("ComicList has "+ ComicsList.size() + " elements"); 

		
		
	}

}
