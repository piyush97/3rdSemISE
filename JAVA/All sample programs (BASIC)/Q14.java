import java.io.*;
class Q14
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n, rev, f;
Q14(int nn) 
{ n=nn;rev=0;f=2; }
int isprime(int x)
{ if(f<=x) 
   { if(x%f!=0)
     {
         f++;
         isprime(x);
     } } 
if(f==x)
     return 1;
else
     return 0;
}
void isEmirp()
 { int copy=n, d;
 while(copy>0)
 { d=copy%10; rev=rev*10+d; copy=copy/10; }
int a=isprime(n);f=2;int b=isprime(rev);
if(a==1 && b==1)
System.out.println(n+" is an Emirp Number");
else
System.out.println(n+" is Not an Emirp Number");
}
public static void main()throws IOException
{ System.out.print("Enter any number : ");int n=Integer.parseInt(br.readLine());
Q14 ob=new Q14(n);ob.isEmirp();
} }