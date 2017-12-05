/* This is the Mind Reader game program...just a tricky one for fun
Author: Sahir 'SID' anjum
Date created: 8 Nov 2013 */
import java.io.*;
class MindReader
{
char sym[]={'!','@','#','$','&','*','?','~','+','^','%'};
//array of symbols
static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
public static void main()throws IOException
{
MindReader o=new MindReader();
char op;
//for user option
System.out.println("******************************MIND READER******************************by SID\n\n"); //welcome text
System.out.println("Welcome to Mind Reader game\nThis game will read ur mind....so let`s play\n");
System.out.println("INSTRUCTIONS(must-read):");
System.out.println("Choose any 2-digit number in your mind,add its digits & subtract the sum from original number.");
System.out.println("Now when you get the final number,look for it in the given chart & concentrate at the symbol corresponding to that number.\nWhen you get the symbol clearly in ur mind,press Enter.\nAnd....the game will show you the same symbol.\n\n");
//game starts here
do{
System.out.println("Here is the chart:\n");
o.GamePlay();
do{
System.out.println("R-Play again;Q-Exit game");
op=Character.toUpperCase(in.readLine().charAt(0));}
while(op!='Q'&& op!='R');
}while(op!='Q');
} 
//end of game
void GamePlay()throws IOException //gaming method
{int i;char rs=sym[(int)(Math.random()*10)],temp;String blank;
for(i=0;i<=99;i++) //creating chart
{temp=(i%9==0)?rs:sym[(int)(Math.random()*10)]; //rendering symbol
System.out.print("("+i+")\t"+temp+"\t");
if(i%10==9)
System.out.println(); 
//line changer
}
System.out.println("Press Enter(only) to continue.........");
blank=in.readLine();
if(blank.equals(""))
{System.out.println("Your symbol is--------> "+rs);
System.out.println("AMAZING,RIGHT!!!!\n");}
else System.out.println("JUST PRESS ENTER!!DO IT NEXT TIME.\n");
}
}