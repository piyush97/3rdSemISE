import java.io.*;
class Q3
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int x,y,i,j;
int a[][]=new int[4][4];
System.out.println("Enter 16 number");
for(x=0;x<4;x++)
{ for(y=0;y<4;y++)
   {
System.out.println("Enter number in cell : "+(x)+":"+(y));
a[x][y]=Integer.parseInt(in.readLine());
} }
for(x=0;x<4;x++)
{ for(y=0;y<4;y++) 
  { for(i=0;i<4;i++)
    { for(j=0;j<4;j++)
       { if(a[i][j]>a[x][y])
          {
int t=a[i][j];
a[i][j]=a[x][y];
a[x][y]=t;
} } } } }
for(x=0;x<4;x++)
{
for(y=0;y<4;y++)
System.out.print(a[x][y]+"\t");
System.out.println();
} } }