
import java.util.*;

class Employee {

    String name,qual; int age,exp;
    Employee (String n, String q, int a, int y){

        name = n; qual = q;
        age = a; exp = y;
    }
    int getEXP() { return exp; }
    void display() {
        System.out.println(" Name is "+ name+" Age is "+age+ " Qualification is "+ qual+" Experience is "+exp);
    }

}

class Lab11 {

    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        LinkedList<Employee> emp = new LinkedList<Employee>();
        emp.add(new Employee("Piyush Mehta", "Student", 20, 12));
        emp.add(new Employee("Akshay", "Detective", 19, 2));
        emp.add(new Employee("Rajesh", "Teacher", 33, 20));

        for (Employee e : emp){
            if(e.getEXP()>5){
                e.display();
            }
        }

    }

}


