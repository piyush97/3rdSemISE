import java.io.*;
class Sorting
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
//Initializing the array
int m[][]=new int[4][4];
int i,j,t;
//Taking the array from the user
for(i=0;i<4;i++)
for(j=0;j<4;j++)
{
System.out.print("Enter the "+i+"X"+j+" th element of the array :- ");
m[i][j]=Integer.parseInt(in.readLine());
}
//Sorting the array
for(i=0;i<15;i++)
{
for(j=(i+1);j<16;j++)
{
if(m[i/4][i%4]>m[j/4][j%4])
{
t=m[i/4][i%4];
m[i/4][i%4]=m[j/4][j%4];
m[j/4][j%4]=t;
}
}
}
//Displaying the final sorted array
System.out.println("The sorted array is :- ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(m[i][j]+"  ");
System.out.println();
}
}
}