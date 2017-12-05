import java.io.*;
class CheckDate
{
//Function to check whether date is valid or not
static int Check(int d,int m,int y)
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
//Function to return the appropriate suffix to the date
static String Suffix(int d)
{
int r;
String s="th";
r=d%10;
if(r==1)
s="st";
else if(r==2)
s="nd";
else if(r==3)
s="rd";
return(s);
}
//Function to return the corresponding month name
static String Month(int m)
{
String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
return(mon[(m-1)]);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String date,year;
int d,m,y;
//Taking input of the date as string 
System.out.print("ENTER THE DATE IN SIX DIGIT FORMAT :- ");
date=in.readLine();
//Extracting the day, month and year number from the date
d=Integer.parseInt(date.substring(0,2));
m=Integer.parseInt(date.substring(2,4));
year=date.substring(4);
y=Integer.parseInt(year);
//Checking whether the date is valid or not and displaying the final result
if(Check(d,m,y)==1)
{
System.out.println("VALID DATE");
System.out.println(d+Suffix(d)+" "+Month(m)+", "+year);
}
else
System.out.println("INVALID DATE");
}
}