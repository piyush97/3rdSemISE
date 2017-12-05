import java.io.*;
class dateformat
{
static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
static String st,st1,st2,st3;
static int d,m,y;
static int flag=0;
public static void main()throws IOException
{
dateformat ob=new dateformat();
dateformat.check();
dateformat.displaydate();
}
static void check()throws IOException
{
System.out.print("Enter date in six digit format --> ");
st=in.readLine();
st1=st.substring(0,2);
st2=st.substring(2,4);
st3=st.substring(4);
d=Integer.parseInt(st1);
m=Integer.parseInt(st2);
y=Integer.parseInt(st3);
if(m==2)
{
if(y%4==0 && d<=29)
{
flag=1;
}
else if(d<=28)
flag=1;
else
flag=0;
}
else
if(m==4||m==6||m==9||m==11)
{
if(d<=30)
flag=1;
}
else
{
if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
{
if(d<=31)
flag=1;
}
}
if(flag==1)
System.out.println("VALID DATE");
else
{
System.out.println("INVALID DATE");
System.exit(0);
}
}
static void displaydate()
{
String date;
date=" ";
if(d==1||d==21||d==31)
date=d+"st";
else if(d==2||d==22)
date=d+"nd";
else if(d==3||d==23)
date=d+"rd";
else
date=d+"th";
switch(m)
{
case 1:
date=date+" JANUARY ";
break;
case 2:
date=date+" FEBRUARY ";
break;
case 3:
date=date+" MARCH ";
break;
case 4:
date=date+" APRIL ";
break;
case 5:
date=date+" MAY ";
break;
case 6:
date=date+" JUNE ";
break;
case 7:
date=date+" JULY ";
break;
case 8:
date=date+" AUGUST ";
break;
case 9:
date=date+" SEPTEMBER ";
break;
case 10:
date=date+" OCTOBER ";
break;
case 11:
date=date+" NOVEMBER ";
break;
case 12:
date=date+" DECEMBER ";
break;
default:
System.out.println("INVALID DATE");
}
date=date+" ,"+y;
System.out.println(date);
}
}