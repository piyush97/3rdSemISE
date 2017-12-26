import java.util.*;
class Employee
{
    String name,qualification;
    float salary;
    int age,yoe;
    Employee(String name,String qualification,float salary,int age,int yoe)
    {
        this.name=name;
        this.qualification=qualification;
        this.salary=salary;
        this.age=age;
        this.yoe=yoe;
    }

}
public class Main {
    static public Scanner scanner=new Scanner(System.in);

    public static void main(String args[])
    {

        System.out.println("Enter the number of Employees");
        int n=Integer.parseInt(scanner.nextLine());
        Employee E[]=new Employee[n];
        LinkedList <Employee> linkedlist=new LinkedList<Employee>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name  ");
            String name=scanner.next();
            System.out.println("Enter Age");
            int age=scanner.nextInt();
            System.out.println("Enter Salary");
            float salary=scanner.nextFloat();
            System.out.println("Enter Yoe");
            int yoe=scanner.nextInt();

            System.out.println("Enter Qualification");
            String qualification=scanner.next();
            E[i]=new Employee(name,qualification,salary,age,yoe);
            linkedlist.add(E[i]);


        }
        for(Employee e:linkedlist)
        {
            if(e.yoe>5)
            {
                System.out.println("Details are"+linkedlist);
            }
        }
    }
}
