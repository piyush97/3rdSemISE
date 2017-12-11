package practice;
import java.util.*;
public class Employee {
	String name,qual;
	int age,exp;
	Employee(String n,String q,int a,int y)
	{
		name=n;
		qual=q;
		age=a;
		exp=y;
	}
	int getExp()
	{
		return(exp);
	}
	void display()
	{
		System.out.println("Name is " +name);
		 System.out.println("Age is " +age);
		System.out.println("Qualification is" +qual);
		System.out.println("Experience is " +exp);
	}
}
class Main{
	public static void main(String args[])
	{
		LinkedList<Employee>emp=new LinkedList<Employee>();
		emp.add(new Employee("AMAN","Engineering",25,7));
		emp.add(new Employee())
		
	}
	
}
