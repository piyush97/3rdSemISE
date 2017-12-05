import java.io.*;
class Determinant
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,j,k,x,y,r=0;
int m[][]=new int[2][2];
int d[][]=new int[3][3];
System.out.println("Enter the determinant :- ");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
System.out.print("Enter the "+(i+1)+"X"+(j+1)+" th element of the determinant :- ");
d[i][j]=Integer.parseInt(in.readLine());
}
System.out.println("The determinant is :- ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
System.out.print(d[i][j]+"  ");
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
if(j!=i)
for(k=1;k<3;k++)
for(x=0;x<2;x++)
for(y=0;y<2;y++)
m[x][y]=d[k][j];
if(i%2==0)
r=r+(d[0][i]*(m[0][0]*m[1][1]-m[0][1]*m[1][0]));
else
r=r-(d[0][i]*(m[0][0]*m[1][1]-m[0][1]*m[1][0]));
}
System.out.println("Result :- "+r);
}
}