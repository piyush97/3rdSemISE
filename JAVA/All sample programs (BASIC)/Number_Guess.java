/* This is the Number Guess game program...just a lucky one for fun
Author: Sahir 'SID' anjum
Date created: 6 Nov 2013 */
import java.util.*;
import java.io.*;
public class Number_Guess
{
public static void main()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Random rand=new Random();//scanner function to have random numbers
int ntg=rand.nextInt(1000);
int not=0,guess,max=100;
boolean win=false;
System.out.println("PRESS 'I'-FOR INSTRUCTIONS , 'S'-TO START GAME , 'E'-TO EXIT GAME");
String option=in.readLine();
switch(option)
{
//Instructions...
case "i":
case "I":
{
System.out.println();
System.out.println("GUESS THE NUMBER COMPUTER IS THINKING .....");
System.out.println("FINISH THE GAME IN MINIMUM TRIES !!!");
System.out.println();
}
//Game begins...
case "s":
case "S":
{
System.out.println("Create your profile");
System.out.print("NAME:-");
String name1=in.readLine();
String name=name1.toUpperCase();
System.out.print("class:-");
int clas=Integer.parseInt(in.readLine());
while(win==false)
{
System.out.println("Guess a number between 1 and 1000:");
guess=Integer.parseInt(in.readLine());
not++;
if(guess==ntg)
win=true;
else if(guess<ntg)
System.out.println("Your guess is to low");
else if(guess>ntg)
System.out.println("Your guess is to high");
}
if(not<=5)
{
System.out.println("~~~~~~~~~~~~~~ YOU WIN ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ The number was "+ntg+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ It took you "+not+" tries ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ Total score "+(max)+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
else if(not>5 && not<=10)
{
System.out.println("~~~~~~~~~~~~~~ YOU WIN ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ The number was "+ntg+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ It took you "+not+" tries ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ Total score "+(max-(not))+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
if(clas<=6)
System.out.println("~~~~~~~~~~~~~~ VERY NICELY PLAYED!!! "+name+" ~~~~~~~~~~~~~~~~~~~~");
else if(not<8 && clas>6)
System.out.println("~~~~~~~~~~~~~~ NICE PLAYED!!! "+name+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
else
System.out.println("~~~~~~~~~~~~~~ GOOD PLAYING!! BE QUICK NEXT TIME!!! "+name+" ~~~~~");
}
else
{
System.out.println("~~~~~~~~~~~~~~ YOU WIN ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ The number was "+ntg+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ It took you "+not+" tries ~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ Total score "+(max-(not+5))+" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~ BETTER LUCK NEXT TIME!!! "+name+" ~~~~~~~~~~~~~~~~~");
}
System.out.println();
System.out.println(">>>>>>>>>>>>>> GIVE YOUR STAR RATINGS(******) <<<<<<<<<<<<<<<");
System.out.print("Number of stars :- ");
double star=Double.parseDouble(in.readLine());
if(star<=2)
{
System.out.println("Write your problem .. We will consider it later");
String problem=in.readLine();
}
else if(star>2 && star<=4)
{
System.out.println("Thanks for your star ratings.....Any problem(Y/N) write down, w'll cosider it later");
String ask=in.readLine();
if(ask.equals("Y")||ask.equals("y"))
{System.out.print("Write your problem :- ");
String ans=in.readLine();}
else if(ask.equals("N")||ask.equals("n"))
{System.out.println();}
else
System.out.println("Error 407.... Wrong choice");
}
else
System.out.println("We are thankful to you .... Have a nice day ");
}
//end of game...
case "e":
case "E":
{
System.out.println();
System.out.println("$$$$$$$$$$$$$$$ GAME IS OVER $$$$$$$$$$$$$$$");
}
break;
default:
System.out.println("wrong choice");
}
}
}
/*reference:-
   ntg=number to be guess
   not=number of tries*/