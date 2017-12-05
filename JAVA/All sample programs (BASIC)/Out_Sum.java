import java.io.*;
class Out_Sum
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int m[][]=new int[3][3];
int i,j,s=0;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
System.out.print("Enter the "+i+" X "+j+" th element in the cell :- ");
m[i][j]=Integer.parseInt(in.readLine());
}
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
if((i==1)&&(j==1))
continue;
else
s=s+m[i][j];
}
System.out.println("The sum of the outer elements of the matrix is :- "+s);
}
}