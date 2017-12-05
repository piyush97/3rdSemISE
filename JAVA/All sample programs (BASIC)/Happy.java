import java.io.*;
class Happy
{
int n;
//Constructor to assign 0 to n
Happy()
{
n=0;
}
//Function to assign the parameter value to the number n=nn
void getnum(int nn)
{
n=nn;
return;
}
//Function to return the sum of the square of the digits of the number
int sum_sq_digits(int x)
{
if(x==0)
return(0);
else
return((x%10)*(x%10)+sum_sq_digits(x/10));
}
//Function to check whether the number is happy number or not
void isHappy()
{
while(n>=10)
n=sum_sq_digits(n);
if(n==1)
System.out.println("It is a happy number");
else
System.out.println("It is not a happy number");
return;
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Happy ob=new Happy();
int m;
//Taking the number from the user
System.out.print("Enter the number :- ");
m=Integer.parseInt(in.readLine());
ob.getnum(m);
ob.isHappy();
}
}