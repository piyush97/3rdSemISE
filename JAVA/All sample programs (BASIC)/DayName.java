import java.io.*;
class DayName
{
int Check(int d,int m,int y)
{
int k=0;
if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))
{
if(d<=31)
k=1;
else
k=0;
}
else if((m==4)||(m==6)||(m==9)||(m==11))
{
if(d<=30)
k=1;
else
k=0;
}
else if(m==2)
{
if((y%4==0)&&(d<=29))
k=1;
else if((y%4!=0)&&(d<=28))
k=1;
else
k=0;
}
return(k);
}
int NumberOfDays(int d,int m,int y)
{
int n[]={31,28,31,30,31,30,31,31,30,31,30,31};
int i,nd=0;
if(y%4==0)
n[1]=29;
for(i=0;i<(m-1);i++)
nd=nd+n[i];
nd=nd+d;
return(nd);
}
void DisplayDay(int d,int m,int y,String bd)
{
String days[]={"Monday","Tuesday","Wednusday","Thursday","Friday","Saturday","Sunday"};
int n=NumberOfDays(d,m,y);
int i;
String day;
for(i=0;i<7;i++)
if(bd.equalsIgnoreCase(days[i]))
break;
n=n-(7-i);
if(n%7==0)
day=days[6];
else
day=days[n%7-1];
System.out.println("THE CORRESPONDING DAY IS :- "+day);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
DayName ob=new DayName();
String date,begday;
int d,m,y;
System.out.print("ENTER THE DATE IN DD/MM/YYYY FORMAT :- ");
date=in.readLine();
d=Integer.parseInt(date.substring(0,2));
m=Integer.parseInt(date.substring(3,5));
y=Integer.parseInt(date.substring(7));
if(ob.Check(d,m,y)==1)
{
System.out.println("VALID DATE");
System.out.print("ENTER THE BEGINNING DAY OF THE CORRESPONDING YEAR :- ");
begday=in.readLine();
ob.DisplayDay(d,m,y,begday);
}
else
System.out.println("INVALID DATE");
}
}