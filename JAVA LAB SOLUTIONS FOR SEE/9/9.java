package p1;

public class AgeException extends Exception{

	/**
	 * @param args
	 */
	int detail;
	public AgeException(int age)
	{
	 detail = age;	
	}
	public String toString()
	{
		return "AgeException[ " + detail +" ]";
	}
}


In package p1
Department.java
package p1;
public interface Department {
	//public void readData();
	public void printData();
	public void print_number_designations();
	public int number_research_consultancy_projs();
}


In package p1
Faculty.java
package p1;
public class Faculty {

	public String name, designation;
	public int age, yoe;
	public String joining_date;
	public int subjects_handled;
	public float salary;
	public Faculty(String n, String d, int a,int y,String jd,int su, float sal)
	{
		name = n;
		designation = d;
		age = a;
		yoe = y;
		joining_date = jd;
		subjects_handled = su;
		salary = sal;
	}
	public int years_experience()
	{
		return yoe;
	}
	}


In package ISE  
ISEDepartment.java
package ISE;
import java.util.Scanner;

import p1.*;
public class ISEDepartment implements Department {
	Faculty fc[];  // = new Faculty[n];
	int n;
	
	public ISEDepartment(int n)
	{
		fc= new Faculty[n];
		this.n = n;
	}
	
	public void faculty_years_experience()
	{
		for(int i=0;i<fc.length;i++)
		{
			if(fc[i].yoe>=20)
			{
				printData(fc[i]);
			}
		}
	}
	
	public void readData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the faculty detail");
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter designation as AP or AsP or P ");
			String des = sc.next();
			if(des.equals("AP"))
				System.out.println("Right value");
			System.out.println("enter age");
			int age = sc.nextInt();
			try
			{
			if(age > 58)
			  throw new AgeException(age);
			}
			catch(AgeException ae)
			{
				System.out.println("Age Exception "+ ae);
			}
			System.out.println("enter years of experience");
			int yoe = sc.nextInt();
			System.out.println("enter joining date as string dd-mm-yyyy");
			String jd = sc.next();
			System.out.println("enter subjects handled");
			int sh = sc.nextInt();
			System.out.println("enter salary");
			float sal = sc.nextFloat();
			fc[i] = new Faculty(name,des,age,yoe,jd,sh,sal);
		   
		}
		
	}
	
	public void printData(){
		System.out.println("Details of "+fc.length+" faculty of ISe department is");
		for(int i=0;i<fc.length;i++)
		{
			System.out.println("Faculty Name is "+fc[i].name +"with age "+fc[i].age+" and designation "+fc[i].designation);
			System.out.println("with years of experience "+fc[i].yoe +"has joined on "+fc[i].joining_date );
			System.out.println("Faculty "+fc[i].name +"is currently taking "+fc[i].subjects_handled +" subjects"+ " and is receiving a salary of "+ fc[i].salary);
					
		}
	}
	
	public void printData(Faculty fc)
	{
System.out.println("Faculty Name is "+fc.name +"with age "+fc.age+" and designation "+fc.designation);
System.out.println("with years of experience "+fc.yoe +"has joined on "+fc.joining_date );
System.out.println("Faculty "+fc.name +"is currently taking "+fc.subjects_handled +" subjects"+ " and is receiving a salary of "+ fc.salary);
	
		
	}
	
	public  void print_number_designations(){ 
	 int nap=0, nassop=0,nprof=0;
		for(int i =0; i<fc.length;i++)
		{
			if(fc[i].designation.equals("AP"))
				nap++;
			else 
				if(fc[i].designation.equals("AsP"))
				 nassop++;
				else
					if(fc[i].designation.equals("P"))
						nprof++;
			
		}
		System.out.println("Number of Assistant professors in ISE department is "+nap);
		System.out.println("Number of Associate professors in ISE department is "+nassop);
		System.out.println("Number of Professors in ISE department is "+nprof);
	}
	public  int number_research_consultancy_projs()
	{
		return 1;
	}
}
In package CSE
CSEDepartment.java
package CSE;

import java.util.Scanner;

import p1.*;
public class CSEDepartment implements Department {
	Faculty fc[];  // = new Faculty[n];
	int n;
	public CSEDepartment(int n)
	{
		fc= new Faculty[n];
		this.n = n;
	}
	public void faculty_years_experience()
	{
		for(int i=0;i<fc.length;i++)
		{
			if(fc[i].yoe>=20)
			{
				printData(fc[i]);
			}
		}
	}
	public void readData() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the faculty detail");
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter designation as AP or AsP or P ");
			String des = sc.next();
			if(des.equals("AP"))
				System.out.println("Right value");
			System.out.println("enter age");
			int age = sc.nextInt();
			try
			{
			if(age > 58)
			  throw new AgeException(age);
			}
			catch(AgeException ae)
			{
				System.out.println("Age Exception "+ ae);
			}
			System.out.println("enter years of experience");
			int yoe = sc.nextInt();
			System.out.println("enter joining date as string dd-mm-yyyy");
			String jd = sc.next();
			System.out.println("enter subjects handled");
			int sh = sc.nextInt();
			System.out.println("enter salary");
			float sal = sc.nextFloat();
			fc[i] = new Faculty(name,des,age,yoe,jd,sh,sal);
		   
		}
		}
	public void printData(){
		System.out.println("Details of "+fc.length+" faculty of CSE department is");
		for(int i=0;i<fc.length;i++)
		{
System.out.println("Faculty Name is "+fc[i].name +"with age "+fc[i].age+" and designation "+fc[i].designation);
System.out.println("with years of experience "+fc[i].yoe +"has joined on "+fc[i].joining_date );
System.out.println("Faculty "+fc[i].name +"is currently taking "+fc[i].subjects_handled +" subjects"+ " and is receiving a salary of "+ fc[i].salary);
					
		}
	}
	public void printData(Faculty fc)
	{
System.out.println("Faculty Name is "+fc.name +"with age "+fc.age+" and designation "+fc.designation);
System.out.println("with years of experience "+fc.yoe +"has joined on "+fc.joining_date );
System.out.println("Faculty "+fc.name +"is currently taking "+fc.subjects_handled +" subjects"+ " and is receiving a salary of "+ fc.salary);
			
		
	}
	public void print_number_designations(){ 
	 int nap=0, nassop=0,nprof=0;
	 for(int i =0; i<fc.length;i++)
		{
			if(fc[i].designation.equals("AP"))
				nap++;
			else 
				if(fc[i].designation.equals("AsP"))
				 nassop++;
				else
					if(fc[i].designation.equals("P"))
						nprof++;
			
		}
		System.out.println("Number of Assistant professors in CSE department is "+nap);
		System.out.println("Number of Associate professors in CSE department is "+nassop);
		System.out.println("Number of Professors in CSE department is "+nprof);
	}
	public int number_research_consultancy_projs()
	{
		return 1;
	}
}
In default package
MainClass.java
import java.util.Scanner;

import CSE.*;
import ISE.*;
//import p1.*;

public class MainClass {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of faculty in ISE department");
		int n = sc.nextInt();
     ISEDepartment is = new ISEDepartment(n);
     is.readData();
	 System.out.println("Faculty Details are :");
     is.printData();
     is.print_number_designations();
     System.out.println("Faculty Details with years of experience > 20 :");
     is.faculty_years_experience();
     System.out.println("Enter the number of faculty in CSE department");
     n= sc.nextInt();
     CSEDepartment cs = new CSEDepartment(n);
     cs.readData();
     System.out.println("Faculty Details are :");
     cs.printData();
     cs.print_number_designations();
     System.out.println("Faculty Details with years of experience > 20 :");
     cs.faculty_years_experience();
    	}

}
