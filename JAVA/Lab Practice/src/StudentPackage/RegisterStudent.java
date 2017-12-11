package StudentPackage;
interface Student
{
    String getName();

    String getBranch();

}
public class RegisterStudent implements Student {

    /**
     * @param args
     */
    String name, branch;
    float m1,m2,m3;
    public RegisterStudent(String n,String b)
    {
        name = n;
        branch =b;
    }
    public String getName()
    {
        return name;

    }
    public String getBranch()
    {
        return branch;
    }

    public void total(int cd)
    {
        int TotalCredits=cd;
        try
        {
            if(TotalCredits>30)
            {
                throw new CreditLimit(TotalCredits);
            }
            else
            {
                System.out.println("The Total credit is:"+TotalCredits);
            }
        }
        catch(Exception e)
        {
            System.out.println("Total Credits is more than 30");
        }
    }


}
class CreditLimit extends Exception
{
    CreditLimit(int i)
    {
        System.out.println("The Total credit is:"+i);
    }
}

