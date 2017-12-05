import java.io.*;
class Q7
{ public static void main()throws IOException
{ BufferedReader in=new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println("Enter number :- ");
int n=Integer.parseInt(in.readLine()); int copy=0,rem=0,i,j,sumd=0,sumf=0; copy=n;
sumd=sum_digit(copy);
for(i=2;i<=7;i++)
{ if(n%i==0)
   { if((i!=4)&&(i!=6))
     {
sumf=sumf+i;n=n/i;i--;
      } } }
for(i=11;i<=n;i++)
{ if(n%i==0)
   { copy=i;
for(j=11;j<=i;j++)
 { if(i%j==0) break;
}
if(j==i)
{ sumf=sumf+(sum_digit(copy));n=n/i;i--;
  } } }
if(sumd==sumf)
System.out.println("smith number");
else
System.out.println("not smith number"); }
public static int sum_digit(int a)
 { int rem=0,sum=0;
while(a>0)
{rem=a%10; sum=sum+rem; a=a/10;}
return sum;
} }