import java.io.*;
class Consecutive
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i,j,s,k,x,t=0;
//Taking number from the user
System.out.print("Enter the number :- ");
n=Integer.parseInt(in.readLine());
for(i=1;i<=((n+1)/2);i++)
{
s=0;
j=i;
x=0;
//Running loop to calculate the sum of consecutive digits
while(s<n)
{
s=s+(j++);
//Checking whether the number and the sum of consecutive digits are equal or not
if(s==n)
{
t++;
x=1;
k=i;
//Displaying the consecutive digits whose sum is equal to the number
while(k!=j)
{
if(k!=(j-1))
System.out.print((k++)+"+");
else
System.out.print((k++));
}
break;
}
}
if(x==1)
System.out.println();
}
//Displaying total number of results found0
System.out.println(t+" Solutions found");
}
}