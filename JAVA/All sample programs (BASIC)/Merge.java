import java.io.*;
class Merge
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,x=0,y=0,n=0;
int a[]=new int[10];
int b[]=new int[10];
int m[]=new int[20];
System.out.println("ENTER THE FIRST ARRAY IN ASCENDING ORDER");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(in.readLine());
System.out.println("ENTER THE SECOND ARRAY IN ASCENDING ORDER");
for(i=0;i<10;i++)
b[i]=Integer.parseInt(in.readLine());
while((x<10)&&(y<10))
{
if(a[x]<=b[y])
m[n++]=a[x++];
else
m[n++]=b[y++];
}
while(x<10)
m[n++]=a[x++];
while(y<10)
m[n++]=b[y++];
System.out.println("THE NEW MERGED ARRAY IS:-");
for(i=0;i<20;i++)
System.out.println(m[i]);
}
}