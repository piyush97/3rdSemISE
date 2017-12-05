import java.io.*;
class StackARR
{
int x[];
int top,size;
StackARR(int s)
{
size=s;
x=new int[size];
top=-1;
}
void Push()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
if(top==(size-1))
{
System.out.println("Stack Overflow");
return;
}
System.out.print("Enter number in the stack :- ");
x[++top]=Integer.parseInt(in.readLine());
if(top==(size-1))
System.out.println("Stack Full");
}
void Pop()
{
if(top==-1)
{
System.out.println("Stack Underflow");
return;
}
System.out.println("Number popped from the stack "+x[top--]);
if(top==-1)
System.out.println("Stack Empty");
}
void Display()
{
System.out.println("The stack is :- ");
for(int i=top;i>=0;i--)
System.out.print(x[i]+"  ");
System.out.println();
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the size of the stack :- ");
StackARR ob=new StackARR(Integer.parseInt(in.readLine()));
System.out.println("(1)-Push  (2)-Pop  (3)-Display  (4)-Exit");
System.out.print("Enter your choice :- ");
int ch=Integer.parseInt(in.readLine());
while(ch!=4)
{
if(ch==1)
ob.Push();
else if(ch==2)
ob.Pop();
else if(ch==3)
ob.Display();
else
System.out.println("Wrong choice");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
}
}
}