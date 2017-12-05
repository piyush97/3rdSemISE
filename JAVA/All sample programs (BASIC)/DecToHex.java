import java.io.*;
class DecToHex
{
//Function to return the appropriate digit of the hexadecimal number system
static String Check(int n)
{
switch(n)
{
case 10:
return("A");
case 11:
return("B");
case 12:
return("C");
case 13:
return("D");
case 14:
return("E");
case 15:
return("F");
}
return(Integer.toString(n));
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int d,r;
String st,hex="";
//Taking the number from the user in decimal number system
System.out.print("Enter the number in decimal number system :- ");
d=Integer.parseInt(in.readLine());
//Converting the number from decimal number system to hexadecimal number system
while(d!=0)
{
r=d%16;
st=Check(r);
hex=st+hex;
d=d/16;
}
//Displaying the final result
System.out.println("Its value in hexadecimal number system is :- "+hex);
}
}