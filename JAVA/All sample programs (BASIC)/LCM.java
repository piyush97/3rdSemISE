import java.io.*;
class LCM
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n1,n2,i,lcm=0;
//Taking both the numbers from the user
System.out.print("Enter the 1st number :- ");
n1=Integer.parseInt(in.readLine());
System.out.print("Enter the 2nd number :- ");
n2=Integer.parseInt(in.readLine());
//Calculating the LCM of the two numbers
for(i=Math.max(n1,n2);i>=Math.max(n1,n2);i++)
if(((i%n1)==0)&&((i%n2)==0))
{
lcm=i;
break;
}
//Displaying the LCM of the two numbers
System.out.println("L.C.M. of two given numbers is :- "+lcm);
}
}