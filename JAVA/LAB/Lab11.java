package Lab2017; 
import java.util.Iterator;
import java.util.LinkedList;

class Employee { 
	
	String name,qual; int age,exp;
	Employee (String n, String q, int a, int y){ 
		
		name = n; qual = q;  
		age = a; exp = y; 
	}
	int getAge() { return age; } 
	void display() { 
		System.out.println(" Name is "+ name+" Age is "+ " Qualification is "+ qual+" Experience is "+exp);
	}
	
}

public class Lab11 {

	public static void main(String[] args) {
		
		LinkedList<Employee> emp = new LinkedList<Employee>(); 
		emp.add(new Employee("Hercule Poirot", "Belgium's BEST Detecive", 55, 35)); 
		emp.add(new Employee("Scooby Doo", "Dog Detecive", 5, 2)); 
		emp.add(new Employee("Sherlock Holmes", "UK's BEST Detecive", 35, 20));
		
		for (Employee e : emp){ 
			if(e.getAge()>5){ 
				e.display();
			}
		}
		
	}

}
