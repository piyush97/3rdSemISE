import java.util.*;
class game
{
	Scanner sc=new Scanner(System.in);
	String team_name;
	
	void getdata()
	{
	System.out.println("pls enter the teamname");
	team_name=sc.next();
	
	}
	
void display()
{
	System.out.println("team name is"+team_name);
}
}
class indoorgame extends game
{
	String game_name;
	void getdata()
	{
		System.out.println("pls enter the game");
		game_name=sc.next();
	}
	void display()
	{
		System.out.println("game name is"+game_name);
	}
	
}
public class extra5
{

	public static void main(String []args)
	{
		game c=new game();
		indoorgame f= new indoorgame();
		
		c.getdata();
		c.display();
		c=f;
		c.getdata();
		c.display();
		
	}
	
}

