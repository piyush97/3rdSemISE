//fibonacci without recursion
import java.util.*;
class Fibo
{
	public static void main(String[] args) 
	{	Scanner scan=new Scanner(System.in);
		int next;
		System.out.println("Enter the number who's fibonacci you want to know");
		int no=scan.nextInt();
		int first=0;
		int second=1;

		for(int i=0;i<no;i++)
			{
				System.out.println(first);
				next=first+second;
				first=second;
				second=next;
			}
	}
}
