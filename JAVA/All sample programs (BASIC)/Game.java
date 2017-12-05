import java.io.*;
class Game
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println();
System.out.println("                            WELCOME TO");
System.out.println("                        HACK THE COMPUTER");
System.out.println("             __________________________________________");
System.out.println("             | 1-Start Game     2-Objective    3-Exit |");
System.out.println("             1________________________________________1");
Code();
}
static void Code()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int c,t;
System.out.println();
System.out.println("Enter the menu code");
c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
t=Start();
Code();
break;
case 2:
System.out.println();
System.out.println("Computer has thought a number. Your aim is to guess the number in minimum number of guesses.");
System.out.println("                                        BEST OF LUCK");
Code();
break;
case 3:
break;
default:
System.out.println("Wrong code entered. Please read the instructions properly.");
}
}
static int Start()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
double x;
int y,n=0,k=1;
x=Math.random();
x=x*1000;
y=(int)(x);
System.out.println();
while(n!=y)
{
System.out.print("Guess the number :-");
n=Integer.parseInt(in.readLine());
if(n<y)
{
System.out.print("                         Your guess is too low");
k++;
}
else if(n>y)
{
System.out.print("                         Your guess is too high");
k++;
}
else if(n==y)
break;
System.out.println();
}
System.out.println("CONGRATULATIONS !!!!!     You took "+k+" tries.");
return(k);
}
}