import java.io.*;
class DecToOct
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int d,oct;
String r,st="";
//Taking the number from the user in decimal number system
System.out.print("Enter the number in decimal number system :- ");
d=Integer.parseInt(in.readLine());
//Converting the number into octal number system
while(d!=0)
{
r=Integer.toString(d%8);
st=r+st;
d=d/8;
}
oct=Integer.parseInt(st);
//Displaying the final result
System.out.println("Its value in octal number system is :- "+oct);
}
}