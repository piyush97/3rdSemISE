package StudentPackage;

import java.util.Scanner;

public class RegisterStudent implements Student{
Scanner scan=new Scanner(System.in);
String name,Branch;
int credits;
    public void getBranch() {
        System.out.println("Enter the branch");

        Branch=scan.nextLine();
    }

    public void getName() {
        System.out.println("Enter the Name");
        name=scan.nextLine();

    }
    void getCredits()
    {
        System.out.println("Enter the no of credits booked");
        credits=scan.nextInt();
        if(credits<30)
        {
            try
            {
                throw new CreditLimit(credits);
            }
            catch (Exception e)
            {
                System.out.println("Total credits lesser than 30"+e);
            }
        }

    }

}
class CreditLimit extends Exception
{
    CreditLimit(int i)
    {
        System.out.println("Credits are"+i);
    }
}
class MAIN
{
    public static void main(String[] args) {
        RegisterStudent R=new RegisterStudent();
        R.getBranch();
        R.getName();
        R.getCredits();
    }
}