import java.io.*;
class Array
{
int a[]=new int[10];
int i,s,k=0,p,fp,lp,j,t;
void Input()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER 10 ARRAY ELEMENTS");
for(i=0;i<10;i++)
{
a[i]=Integer.parseInt(in.readLine());
}
}
void Display()
{
System.out.println("The given array is:-");
for(i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
void Search()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE NUMBER TO BE SEARCHED IN THE ARRAY");
s=Integer.parseInt(in.readLine());
for(i=0;i<10;i++)
{
if(s==a[i])
k=1;
}
if(k==1)
System.out.println("THE NUMBER "+s+" IS PRESENT IN THE ARRAY");
else
System.out.println("THE NUMBER "+s+" IS NOT PRESENT IN THE ARRAY");
}
void Position()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE NUMBER WHOSE POSITION IS TO BE CHECKED IN THE ARRAY");
p=Integer.parseInt(in.readLine());
for(i=0;i<10;i++)
{
if(p==a[i])
lp=i;
if(p==a[9-i])
fp=9-i;
}
System.out.println("THE FIRST POSITION OF "+p+" IN THE ARRAY IS "+(fp+1));
System.out.println("THE LAST POSITION OF "+p+" IN THE ARRAY IS "+(lp+1));
}
void Sorting()
{
for(i=0;i<9;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("THE ARRAY IN SORTED ORDER IS:-");
for(i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
void Duplicacy()
{
System.out.println("THE ARRAY ELEMENTS WITHOUT ANY DUPLICACY ARE:-");
for(i=0;i<9;i++)
{
if(a[i]!=a[i+1])
System.out.println(a[i]);
}
System.out.println(a[9]);
}
void Frequency()
{
for(i=0;i<9;i++)
{
k=0;
if(a[i]!=a[i+1])
{
for(j=0;j<10;j++)
{
if(a[i]==a[j])
k++;
}
System.out.println("FREQUENCY OF "+a[i]+" IN THE ARRAY IS "+k);
}
}
k=0;
for(i=0;i<10;i++)
{
if(a[9]==a[i])
k++;
}
System.out.println("FREQUENCY OF "+a[9]+" IN THE ARRAY IS "+k);
}
}
class Array1
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Array a1=new Array();
a1.Input();
a1.Display();
a1.Search();
a1.Position();
a1.Sorting();
a1.Duplicacy();
a1.Frequency();
}
}