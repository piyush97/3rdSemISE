import java.io.*;
class Kaprekar
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,l,i,x;
String s,lp="",rp="";
char ch;
//Taking the number from the user
System.out.print("Enter the number :- ");
n=Integer.parseInt(in.readLine());
s=Integer.toString(n*n);
l=s.length();
//Splitting the number into two pieces
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(i<(l/2))
lp=lp+ch;
else
rp=rp+ch;
}
x=Integer.parseInt(lp)+Integer.parseInt(rp);
//Checking whether the number is kaprekar number or not and displaying the result
if(x==n)
System.out.println("It is a kaprekar number");
else
System.out.println("It is not a kaprekar number");
}
}