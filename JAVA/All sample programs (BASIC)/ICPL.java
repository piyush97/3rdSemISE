import java.io.*;
class ICPL
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i,c=0,k=0,a,j;
System.out.print("Enter the number of matches played by the player :- ");
n=Integer.parseInt(in.readLine());
int s[]=new int[n];
System.out.println("Enter the scores of the player :-");
for(i=0;i<n;i++)
s[i]=Integer.parseInt(in.readLine());
System.out.println("The new scores are :-");
for(i=0;i<(n-1);i++)
{
if((s[i+1]==s[i])||(s[i+1]==(s[i]+1)))
{
c++;
k=i;
}
else
{
if(c!=0)
{
int x[]=new int[c];
a=k-c+1;
for(j=0;j<c;j++)
x[j]=s[a++];
System.out.println(x[c/2]);
c=0;
i++;
}
System.out.println(s[i]);
}
}
}
}