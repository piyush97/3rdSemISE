import java.io.*;
class Node
{
char c;
Node p;
}
class Postfix
{
static Node top,bottom,active;
static int Preceedence(char a,char b)
{
char p[]={'^','/','*','+','-'};
int i,k=0;
for(i=0;i<5;i++)
{
if(p[i]==a)
{
k=0;
break;
}
else if(p[i]==b)
{
k=1;
break;
}
}
return(k);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String x,y="";
int l,i,k;
char ch,ch1;
System.out.print("Enter the expression in infix form :- ");
x=in.readLine();
x=x+")";
active=new Node();
active.c='(';
active.p=null;
bottom=active;
top=active;
l=x.length();
for(i=0;i<l;i++)
{
ch=x.charAt(i);
if(ch=='(')
{
active=new Node();
active.c=ch;
active.p=top;
top=active;
}
else if((ch=='^')||(ch=='/')||(ch=='*')||(ch=='+')||(ch=='-'))
{
ch1=top.c;
if((ch1=='^')||(ch1=='/')||(ch1=='*')||(ch1=='+')||(ch1=='-'))
{
k=Preceedence(ch,ch1);
if(k==0)
{
active=new Node();
active.c=ch;
active.p=top;
top=active;
}
else if(k==1)
{
y=y+top.c;
top.c=ch;
}
}
else
{
active=new Node();
active.c=ch;
active.p=top;
top=active;
}
}
else if(ch==')')
{
ch1=top.c;
while(ch1!='(')
{
y=y+ch1;
top=top.p;
ch1=top.c;
}
}
else
y=y+ch;
}
System.out.println("The expression in postfix form is :- "+y);
}
}