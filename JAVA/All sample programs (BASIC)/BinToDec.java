import java.io.*;
class BinToDec
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int b,r,n=0;
double d=0;
//Taking the number from the user in binary number system
System.out.print("Enter the number in binary number system :- ");
b=Integer.parseInt(in.readLine());
//Converting the number into decimal number system
while(b!=0)
{
r=b%10;
d=d+Math.pow(2,n++)*r;
b=b/10;
}
//Displaying the final result
System.out.println("Its value in decimal number system is :- "+d);
}
}