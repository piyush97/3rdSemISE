import java.io.*;
class stackasarray
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
arrays ob=new arrays();
System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
while(true)
{
System.out.print("Enter key of operation :- ");
int c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
ob.push();
break;
case 2:
ob.pop();
break;
case 3:
ob.display();
break;
case 4:
System.out.println("program end");
System.exit(0);
default:
System.out.println("Invalid key \nTry again");
}
}
}
}
class arrays
{
int top;
int ar[]=new int[5];
arrays()
{top=-1;}
public void push()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
if(top<5)
{ System.out.print("Enter element :- ");
ar[++top]=Integer.parseInt(in.readLine()); }
else
System.out.println("Stack overflow");
}
void pop()
{
if(top==-1)
System.out.println("Stack underflow");
else
System.out.println("poped element :- "+ar[top--]);
}
void display()
{
if(top==-1)
System.out.println("Stack underflow");
else
{
for(int i=0;i<=top;i++)
{ System.out.print(ar[i]+"\t"); }
System.out.println(); } 
}
}