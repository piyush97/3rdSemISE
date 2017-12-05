import java.io.*;
class Difference
{
int d,m,y;
void InputDOB()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter day number :- ");
d=Integer.parseInt(in.readLine());
System.out.print("Enter month number :- ");
m=Integer.parseInt(in.readLine());
System.out.print("Enter year number:- ");
y=Integer.parseInt(in.readLine());
}
Difference CalculateDifference(Difference fat,Difference son)
{
if(son.d>fat.d)
d=son.d-fat.d;
else
{
son.m-=1;
son.d+=30;
d=son.d-fat.d;
}
if(son.m>fat.m)
{
m=son.m-fat.m;
}
else
{
son.y-=1;
son.m+=12;
m=son.m-fat.m;
}
y=son.y-fat.y;
return(this);
}
void AgeDifference()
{
System.out.println("The difference between son's and father's age is :- ");
System.out.println(d+" days "+m+" months and "+y+" years");
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("----------Enter the age of father----------");
Difference f=new Difference();
f.InputDOB();
System.out.println("----------Enter the age of son-------------");
Difference s=new Difference();
s.InputDOB();
Difference ob=new Difference();
Difference obj=ob.CalculateDifference(f,s);
obj.AgeDifference();
}
}