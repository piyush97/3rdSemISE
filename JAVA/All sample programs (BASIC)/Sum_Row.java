import java.io.*;
class Sum_Row
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int m[][]=new int[4][4];
int i,j,s=0,max=0,x=0;
for(i=0;i<4;i++)
for(j=0;j<4;j++)
{
System.out.print("Enter the "+i+" X "+j+" th element in the cell :- ");
m[i][j]=Integer.parseInt(in.readLine());
}
for(i=0;i<4;i++)
{
s=0;
for(j=0;j<4;j++)
{
s=s+m[i][j];
}
if(s>max)
{
max=s;
x=i;
}
}
System.out.println("The row with highest sum = "+max+" is :- ");
for(i=0;i<4;i++)
System.out.print(m[x][i]+"  ");
}
}