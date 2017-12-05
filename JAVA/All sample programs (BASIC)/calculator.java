import java.io.*;
class calculator
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
double n=0,m=0,result=0;
char o='+';
System.out.println("Enter 1st number");
n=Double.parseDouble(in.readLine());
System.out.println("Enter 2nd number");
m=Double.parseDouble(in.readLine());
System.out.println("Enter operator");
o=(char)(in.read());
switch(o)
{
case'+':
result=n+m;
break;
case'-':
result=n-m;
break;
case'*':
result=n*m;
break;
case'/':
result=n/m;
break;
default:
System.out.println("Wrong input");
}
System.out.println("result="+result);
}
}