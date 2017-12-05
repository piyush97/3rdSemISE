import java.io.*;
class Palprime_Matrix
{
static boolean Check_Palprime(int x)
{
int y=x,r,rev=0,i,k=0;
while(y!=0)
{
r=y%10;
rev=rev*10+r;
y=y/10;
}
for(i=2;i<=x/2;i++)
{
if(x%i==0)
{
k=1;
break;
}
}
if((x==rev)&&(k==0))
return(true);
return(false);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i=0,j=2,temp=0;
System.out.print("Enter the size of matrix :- ");
n=Integer.parseInt(in.readLine());
int m[][]=new int[n][n];
while(i<(n*n))
{
if(Check_Palprime(j)==true)
{
m[i/n][i%n]=j;
i++;
}
j++;
}
int t[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
t[i][j]=m[j][i];
}
}
System.out.println("Transpose matrix is :- ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(t[i][j ]+"   ");
System.out.println();
}
}
}