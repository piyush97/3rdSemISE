package MyExceptions;

public class PrintStackTraceDemo {

	public static void main(String[] args) {
		try
		{
			
			int result = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
			System.out.println("Result is " + result); 
			
			
			int myargs[] = new int[args.length]; 
			System.out.println("My Arguments entered transferred to integer array called 'myargs' are "); 
			
			for(int i = 0; i<args.length; i++)
			{
				
				myargs[i] = Integer.parseInt(args[i]); 
				System.out.println(myargs[i]); 
				
			}
			System.out.println("Trying to get Out of Bounds Exception "+ myargs[args.length]); 
			
			
		}
		catch (Exception e)
		{
			/* DEMO : Run this code by commenting out line #33 and #34 for printStackTrace
			 * Remark: You are unable to find out which line caused the ArrayIndexOutOfBounds Exception 
			 * Is it line #9 or line #23? 
			 * printStackTrace helps you nail down the code-lines causing problems
			 */
			System.out.println("Printing Eception without stack trace "+e);
			System.out.println("Exception in Code!! Checkout where using printStackTrace");
			e.printStackTrace(); 
			
			
		}		
		
	}


}
