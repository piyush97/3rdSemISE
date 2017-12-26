import java.util.*;
class cricket
{
	int overs;
	int runs;
	String team_name;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		
		System.out.println("enter the no of over finished");
		overs=sc.nextInt();
		System.out.println("enter the no of runs made ");
		runs=sc.nextInt();
		System.out.println("enter the team name");
		team_name=sc.next();
		
	}
	
	void display()
	{
		System.out.println("overs played are"+overs+ "runs made  are" +runs+"team nameis "+team_name);
	}
	
}
public class extra2 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no of timer u want to enter the data");
		n=sc.nextInt();
		cricket[] e=new cricket[n];
		for(int i=0;i<n;i++)
		{
			
			e[i]=new cricket();
					e[i].getdata();
					e[i].display();
		}
		
	}

}





