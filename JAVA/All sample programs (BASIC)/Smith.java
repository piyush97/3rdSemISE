import java.io.*;
class Smith
{
//Function to calculate the sum of the digits of the number
static int Sum_Of_Digits(int x)
{
int r,s=0;
while(x!=0)
{
r=x%10;
s=s+r;
x=x/10;
}
return(s);
}
//Function to check whether the number is prime or not
static int Prime_Check(int y)
{
int i,k=0;
for(i=2;i<y;i++)
{
k=0;
if(y%i==0)
{
k=1;
break;
}
}
return(k);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i,sum1,sum2=0,sum=0,flag=0;
//Taking the number from the user
System.out.println("Enter the number to be checked as smith number");
n=Integer.parseInt(in.readLine());
int m=n;
//Calculating the sum of the digits of the number
sum1=Sum_Of_Digits(n);
//Finding the prime factors of the number and storing their sum
for(i=2;i<n;i++)
{
if(n%i==0)
{
flag=Prime_Check(i);
if(flag==0)
{
sum2=Sum_Of_Digits(i);
sum=sum+sum2;
m=m/i;
if(m%i==0)
sum=sum+sum2;
}
}
}
//Checking whether the sum of the digits of the number as well as its prime factors are equal or not
if(sum1==sum)
System.out.println("It is a smith number");
else
System.out.println("It is not a smith number");
}
}