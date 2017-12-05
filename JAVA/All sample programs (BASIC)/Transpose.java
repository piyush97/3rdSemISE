import java.io.*;
class Transpose
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int m[][]=new int[3][3];
int n[][]=new int[3][3];
int i,j;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
System.out.print("Enter  the "+i+" X "+j+" th element in the cell :- ");
m[i][j]=Integer.parseInt(in.readLine());
}
for(i=0;i<3;i++)
for(j=0;j<3;j++)
n[i][j]=m[j][i];
System.out.println("The Transpose of the given array is :- ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
System.out.print(n[i][j]+"  ");
System.out.println();
}
}
}