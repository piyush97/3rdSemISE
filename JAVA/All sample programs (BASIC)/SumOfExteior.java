import java.io.*;
class SumOfExteior
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter size of matrix :- ");
int n=Integer.parseInt(in.readLine());
int i=0,j,k,s=0;
int arr[][]=new int[n][n];
for(i=0; i<n; i++)
{
for(j=0; j<n; j++)
{
System.out.print("Enter number in cell "+(i+1)+" : "+(j+1)+" :- ");
arr[i][j]=Integer.parseInt(in.readLine());
}
}
for(i=0; i<n; i++)
{
for(j=0; j<n; j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
for(i=0; i<1; i++)
{
for(j=i; j<n; j++)
{
s=s+arr[i][j];
s=s+arr[j][i];
}
s=s-arr[0][0];
for(j=i+1; j<n; j++)
{
s=s+arr[n-1][j];
s=s+arr[j][n-1];
}
s=s-arr[n-1][n-1];
}
System.out.println("sum of outer elements ----> "+s);
}
}