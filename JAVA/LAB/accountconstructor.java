package javalab;
import java.util.Scanner;

public class accountconstructor {
    int acctno;
    String acctnme;
    int phoneno;
    float balamt;
    static Scanner s1= new Scanner(System.in);
    public accountconstructor(int ano,String name,int pno, float bal )
    {
        acctno=ano;
        acctnme=name;
        phoneno=pno;
        balamt=bal;
        System.out.println("your details with the bank are "+acctno +"name"+acctnme);
    }
    void getInput ()
    {

        System.out.println("Welcome Edit your account details at MSRIT");
        System.out.println("eNTER YOUR ACCOUNT NO"+acctno+"edit your dtails");
        acctno =s1.nextInt(); s1.nextLine();
        System.out.println("Enter your acount name "+acctnme+"edit your dtails");
        acctnme=s1.nextLine();
        System.out.println("Enter your phone no"+phoneno+"edit your dtails");
        phoneno=s1.nextInt(); s1.nextLine();
        System.out.println("Enter the balance amt "+balamt+"edit your dtails");
        balamt= s1.nextFloat(); s1.nextLine();
        System.out.println("thank you");
       
       
        }
    void deposit()
    {
       
        float amt= 0;
        float holo ;
        holo= balamt;
        System.out.println("how much amt you want to deposit ");
        amt = s1.nextFloat();s1.nextLine();
        balamt=amt+holo;
        System.out.println(balamt);
       
    }
    void withdraw()
    {
       
   
        if (balamt>1000)
        {

            float amt=0;
           
            System.out.println("u can procced");
            System.out.println("how much money to withdraw the money");
            amt = s1.nextFloat();s1.nextLine();
            balamt= balamt - amt ;
           
        }
       
        else
        {
            System.out.println("cant proceed");   
        }
       
   
    }
    void print()
    {
        System.out.println("your now amount"+balamt );
        }
    public static void main(String[] args)
    {
        accountconstructor objs1 = new accountconstructor(2,"csasdsa",32323,232323);
       
       
        objs1.getInput();
        objs1.deposit();
        objs1.withdraw();
        objs1.print();
       
       
       
        }

}package javalab;
import java.util.Scanner;

public class accountconstructor {
    int acctno;
    String acctnme;
    int phoneno;
    float balamt;
    static Scanner s1= new Scanner(System.in);
    public accountconstructor(int ano,String name,int pno, float bal )
    {
        acctno=ano;
        acctnme=name;
        phoneno=pno;
        balamt=bal;
        System.out.println("your details with the bank are "+acctno +"name"+acctnme);
    }
    void getInput ()
    {

        System.out.println("Welcome Edit your account details at MSRIT");
        System.out.println("eNTER YOUR ACCOUNT NO"+acctno+"edit your dtails");
        acctno =s1.nextInt(); s1.nextLine();
        System.out.println("Enter your acount name "+acctnme+"edit your dtails");
        acctnme=s1.nextLine();
        System.out.println("Enter your phone no"+phoneno+"edit your dtails");
        phoneno=s1.nextInt(); s1.nextLine();
        System.out.println("Enter the balance amt "+balamt+"edit your dtails");
        balamt= s1.nextFloat(); s1.nextLine();
        System.out.println("thank you");
       
       
        }
    void deposit()
    {
       
        float amt= 0;
        float holo ;
        holo= balamt;
        System.out.println("how much amt you want to deposit ");
        amt = s1.nextFloat();s1.nextLine();
        balamt=amt+holo;
        System.out.println(balamt);
       
    }
    void withdraw()
    {
       
   
        if (balamt>1000)
        {

            float amt=0;
           
            System.out.println("u can procced");
            System.out.println("how much money to withdraw the money");
            amt = s1.nextFloat();s1.nextLine();
            balamt= balamt - amt ;
           
        }
       
        else
        {
            System.out.println("cant proceed");   
        }
       
   
    }
    void print()
    {
        System.out.println("your now amount"+balamt );
        }
    public static void main(String[] args)
    {
        accountconstructor objs1 = new accountconstructor(2,"csasdsa",32323,232323);
       
       
        objs1.getInput();
        objs1.deposit();
        objs1.withdraw();
        objs1.print();
       
       
       
        }

}
