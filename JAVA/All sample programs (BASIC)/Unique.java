import java.io.*;
class Unique
{
int CheckUnique(int x)
{
int y=x,i,d=0,r,k=1;
for(i=1;i<10;i++)
{
d=0;
y=x;
while(y!=0)
{
r=y%10;
if(i==r)
d++;
y=y/10;
}
if(d>1)
k=0;
}
if((x%10==0)||(x<0))
k=0;
return(k);
}
void Display(int m,int n)
{
int i,c=0;
System.out.println("The unique digit integers are :- ");
for(i=m;i<=n;i++)
if(CheckUnique(i)==1)
{
c++;
System.out.println(i);
}
if(c==0)
System.out.println("Nil");
System.out.println("Frequency of unique digit integers are :- "+c);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Unique ob=new Unique();
int m,n;
System.out.print("Enter the value of m :- ");
m=Integer.parseInt(in.readLine());
System.out.print("Enter the value fo n :- ");
n=Integer.parseInt(in.readLine());
if((m<30000)&&(n<30000))
ob.Display(m,n);
else
System.out.println("Invalid Range");
}
}