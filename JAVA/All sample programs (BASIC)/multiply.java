import java.util.*;
import java.io.*;
public class multiply
{
public static void main()throws IOException
{
long StartTime=System.currentTimeMillis();
multiply ext=new multiply();
ext.callMethod();
long endTime=System.currentTimeMillis();
System.out.println("Total time used :- "+((endTime-StartTime)/100)+" sec");
}
public multiply()throws IOException{}
public void callMethod()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Random ran=new Random();
String i="";int count=0,j=0;
while(i.equals(""))
{
j++;
int t1=ran.nextInt(10);
int t2=ran.nextInt(10);
int calc=t1*t2;
System.out.println("Calculate:- "+t1+"X"+t2);
int input=Integer.parseInt(in.readLine());
if(input==calc)
{
System.out.println("Correct answer");
count++;
}
else
System.out.println("Incorrecr answer\n correct answer is:- "+calc);
System.out.println("Do you want to continue if yes press Enter else any key (except enter)");
i=in.readLine();
System.out.println("\t=>\tNumber of questions attempted= "+j);
System.out.println("\t=>\tNumber of correct answers= "+count);
}
}
}