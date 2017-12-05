import java.io.*;
class Prime_Matrix
{
static int Check_Prime(int n)
{
int i,k=0; 
for(i=2;i<n;i++)
if(n%i==0)
{
k=1;
break;
}
return(k);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int m[][]=new int[4][4];
int i,x,a=0,b=0;
for(i=2;i>=2;i++)
{
x=Check_Prime(i);
if(a==4)
break;
else if(x==0)
{
m[a][b++]=i;
if(b==4)
{
a++;
b=0;
}
}
}
System.out.println("The prime matrix is :- ");
for(a=0;a<4;a++)
{
for(b=0;b<4;b++)
{
if(m[a][b]<10)
System.out.print(m[a][b]+"   ");
else
System.out.print(m[a][b]+"  ");
}
System.out.println();
}
}
}