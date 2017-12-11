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
		System.out.println("Qualifia")
	}

}
