package MyExceptions;

public class NestedTryDemo {

	public static void main(String[] args) {
		boolean exception = false; int result=0; 
		try
		{
			result = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
			System.out.println("Result is " + result); 
			
			try
			{
				int myargs[] = new int[args.length]; 
				System.out.println("My Arguments entered transferred to integer array called 'myargs' are "); 
				
				for(int i = 0; i<args.length; i++)
				{
					
					myargs[i] = Integer.parseInt(args[i]); 
					System.out.println(myargs[i]); 
					
				}
				System.out.println("Trying to get Out of Bounds Exception "+ myargs[args.length]); 
			}//nested try ends 
			//DEMO - ArrayIndex Exception is not caught in nested try, though we know it occurs here. 
			// It is caught in the outer-try via 'Exception' 
			/*catch (ArrayIndexOutOfBoundsException e)
			{
				exception = true; 
				System.out.println("ArrayIndexOutOfBoundsException in Code!! Checkout \n");
				e.printStackTrace();
				
				
			}//nested catch ends */
			catch (ArithmeticException e)
			{
				exception = true; 
				System.out.println("ArrayIndexOutOfBoundsException in Code!! Checkout \n");
				e.printStackTrace();
				
				
			}//nested catch ends 
										
		
	}//outer try ends 
		catch (Exception e)
		{
			/* DEMO : Run this code by commenting out line #33 and #34 for printStackTrace
			 * Remark: You are unable to find out which line caused the ArrayIndexOutOfBounds Exception 
			 * Is it line #9 or line #23? 
			 * printStackTrace helps you nail down the code-lines causing problems
			 */
			//System.out.println("Printing Exception without stack trace "+e);
			System.out.println("Exception caught in outer try!! Checkout where using printStackTrace");
			e.printStackTrace(); 
			
			
		}		
	}

}
