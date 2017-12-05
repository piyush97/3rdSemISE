import java.io.*;
class Primes
{
int a,i,k,n,x,y;
int CheckPrime(int a)
{
for(i=2;i<a;i++)
{
k=0;
if(a%i==0)
{
k=1;
break;
}
}
return(k);
}
//To check that given number is prime or not//
void PrimeNumber()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE NUMBER TO BE CHECKED AS PRIME NUMBER");
n=Integer.parseInt(in.readLine());
x=CheckPrime(n);
if(x==0)
System.out.println("GIVEN NUMBER IS PRIME");
else
System.out.println("GIVEN NUMBER IS NOT PRIME");
}
//To check that given number is pal prime or not//
void PalPrimeNumber()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE NUMBER TO BE CHECKED AS PAL PRIME NUMBER");
n=Integer.parseInt(in.readLine());
x=CheckPrime(n);
if(x==0)
{
int m=n;
int r,rev=0;
while(m!=0)
{
r=m%10;
rev=rev*10+r;
m=m/10;
}
if(rev==n)
System.out.println("GIVEN NUMBER IS PAL PRIME");
else
System.out.println("GIVEN NUMBER IS NOT PAL PRIME");
}
else
System.out.println("GIVEN NUMBER IS NOT PAL PRIME");
}
//To display all prime numbers less than n//
void DisplayPrimeNumber()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE RANGE OF PRIME NUMBERS");
n=Integer.parseInt(in.readLine());
System.out.println("THE PRIME NUMBERS LESS THAN "+n+" ARE:-");
for(i=2;i<n;i++)
{
x=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
x=1;
break;
}
}
if(x==0)
System.out.println(i);
}
}
//To display all twin prime numbers less than n//
void DisplayTwinPrimeNumber()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE RANGE OF TWIN PRIME NUMBERS");
n=Integer.parseInt(in.readLine());
System.out.println("THE TWIN PRIME NUMBERS LESS THAN "+n+" ARE:-");
for(i=2;i<(n-3);i++)
{
x=0;
y=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
x=1;
break;
}
}
for(int j=2;j<(i+2);j++)
{
if((i+2)%j==0)
{
y=1;
break;
}
}
if(x==0&&y==0)
System.out.println(i+","+(i+2));
}
}
//To store and display n prime numbers in an array of size n//
void ArrayPrime()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE SIZE OF ARRAY");
n=Integer.parseInt(in.readLine());
int m[]=new int[n];
int z=0;
for(i=2;i>=2;i++)
{
x=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
x=1;
break;
}
}
if(z==n)
break;
else if(x==0)
{
m[z]=i;
z++;
}
}
System.out.println("THE PRIME ARRAY IS:-");
for(i=0;i<n;i++)
System.out.println(m[i]);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Primes ob=new Primes();
ob.PrimeNumber();
ob.PalPrimeNumber();
ob.DisplayPrimeNumber();
ob.DisplayTwinPrimeNumber();
ob.ArrayPrime();
}
}