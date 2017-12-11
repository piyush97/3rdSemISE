package lab;
import java.util.*;
class Employee
{
	int age,experience;
	String name,qualification;
	Employee(String name,String qualification,int age,int experience)
	{
		this.name=name;
		this.qualification=qualification;
		this.age=age;
		this.experience=experience;
	}
	int getExp()
	{
		return experience;
	}
	void showdata()
	{
		System.out.println("Name is "+name+" Age is " +age+ " experience is "+experience+ " qualification is " +qualification);
	}

}

public class Java11
{
	public static void main(String[] args) {
		LinkedList<Employee> ll=new LinkedList<Employee>();
		ll.add(new Employee("Ram","B.E",22,14));
		ll.add(new Employee("Shyam","B.E",19,1));
		ll.add(new Employee("Akshay","B.A",32,6));

		for(Employee a :ll)
		{
			if(a.getExp()>5)
				a.showdata();
		}
	}
}