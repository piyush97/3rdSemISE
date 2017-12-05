import java.io.*;
class Special
{
static int SpecialNumber(int x)
{
int r,i,f=1,sum=0,k;
int y=x;
while(x!=0)
{
r=x%10;
for(i=1;i<=r;i++)
{
f=f*i;
}
sum=sum+f;
x=x/10;
f=1;
}
if(sum==y)
k=1;
else
k=0;
return(k);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,a,i,b,c=0;
System.out.println("ENTER THE NUMBER TO BE CHECKED AS SPECIAL NUMBER");
n=Integer.parseInt(in.readLine());
//To check that a given number is special number or not//
a=SpecialNumber(n);
if(a==1)
System.out.println("GIVEN NUMBER IS A SPECIAL NUMBER");
else
System.out.println("GIVEN NUMBER IS NOT A SPECIAL NUMBER");
//To display all 3-digit special numbers//
System.out.println("ALL 3-DIGIT SPECIAL NUMBERS ARE:-");
for(i=100;i<1000;i++)
{
b=SpecialNumber(i);
if(b==1)
{
System.out.println(i);
c++;
}
}
//To display number of 3-digit special numbers found//
System.out.println("NUMBER OF 3-DIGIT SPECIAL NUMBERS FOUND ARE:- "+c);
}
}