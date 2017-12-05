import java.io.*;
class DecToBin
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int d,bin;
String r,str="";
//Taking the number from the user in decimal number system
System.out.print("Enter the number in decimal number system :- ");
d=Integer.parseInt(in.readLine());
//Converting the number into binary number system
while(d!=0)
{
r=Integer.toString(d%2);
str=r+str;
d=d/2;
}
bin=Integer.parseInt(str);
//Displaying the final result
System.out.println("Its value in binary number system is :- "+bin);
}
}