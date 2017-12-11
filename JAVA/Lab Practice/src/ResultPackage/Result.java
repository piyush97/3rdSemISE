package ResultPackage;

import StudentPackage.*;

import java.util.Scanner;

class Grade extends RegisterStudent
{
    String sub1,sub2,sub3;
    Grade(String n, String b,String g1,String g2,String g3)
    {
        super(n,b);
        sub1 = g1;
        sub2 = g2;
        sub3 = g3;
    }

    void display()
    {
        System.out.println("Grade of Registered subject");
        System.out.println(" Grade of subject1:"+sub1);
        System.out.println(" Grade of subject2:"+sub2);
        System.out.println(" Grade of subject3:"+sub3);
    }
    void sgpa() throws InvalidSGPA
    {
        double input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an CGPA: ");

        input = Double.parseDouble(scan.next());
        if(input > 10)
            throw new InvalidSGPA(input);
        else
            System.out.println("CGPA is: " + input);

        System.out.println("Not a valid CGPA!!");

    }
    int getGP(String v1)
    {
        if(v1.equals("S"))
        {
            return 10;
        }
        if(v1.equals("A"))
        {
            return 9;
        }
        if(v1.equals("B"))
        {
            return 8;
        }
        if(v1.equals("C"))
        {
            return 7;
        }
        if(v1.equals("D"))
        {
            return 6;
        }
        if(v1.equals("E"))
        {
            return 5;
        }
        else
            return 0;
    }
    float calculateCGPA()
    {
        int v1 = getGP(sub1);
        int v2 = getGP(sub2);
        int v3 = getGP(sub3);
        return (v1*4+v2*4+v3*4)/12;
    }
}
class InvalidSGPA extends Exception
{
    //private double val1;
    InvalidSGPA(double v1)
    {
        System.out.println("The Total SGPA is invalid :"+v1);
    }
}


public class Result {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //RegisterStudent rs = new RegisterStudent("ABCD EFG","ISE");


        Grade gd = new Grade("ABCD EFG","ISE","S","A","B");
        gd.total(20);
        //gd.getGrade();
        gd.display();
        try
        {
            gd.sgpa();
        }
        catch(InvalidSGPA e)
        {
            System.out.println(e);
        }
        //gd.sgpa();
        System.out.println("CGPA is = " + gd.calculateCGPA());

    }

}
