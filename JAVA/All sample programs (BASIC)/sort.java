import java.io.*;
class sort
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,l,temp;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
System.out.println("Enter matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print("Enter element = ");
a[i][j]=Integer.parseInt(in.readLine());
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
for(k=1;k<3;k++)
{
for(l=1;l<3;l++)
{
if(a[i][i]>a[k][k])
{
temp=a[k][k];
a[k][k]=a[i][i];
a[i][i]=temp;
temp=a[l][l];
}
}
}
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}