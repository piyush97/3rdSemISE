import java.io.*;
class SqMatrix
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,m[][],i,j,s=0;
System.out.print("Enter the order of matrix :- ");
n=Integer.parseInt(in.readLine());
m=new int[n][n];
System.out.println("Enter "+(n*n)+" elements in matrix :- ");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
m[i][j]=Integer.parseInt(in.readLine());
System.out.println("The matrix is :- ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(m[i][j]);
System.out.println();
}
System.out.println("The upper triangle of the matrix is :- ");
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
System.out.print(m[i][j]);
System.out.println();
}
System.out.println("The lower triangle of the matrix is :- ");
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
System.out.print(" ");
for(j=i;j<n;j++)
System.out.print(m[i][j]);
System.out.println();
}
for(i=0;i<n;i++)
s=s+m[0][i]+m[n-1][i];
for(i=1;i<n-1;i++)
s=s+m[i][0]+m[i][n-1];
System.out.println("The sum of the outer elemnets of the matrix is :- "+s);
}
}