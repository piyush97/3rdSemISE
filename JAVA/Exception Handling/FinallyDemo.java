package MyExceptions;

/* DEMO - The command-line arguments entered need not be numbers 
 * This causes the exception - "NumberFormatException" 
 * finally block shows all such uncaught exceptions 
 * Run the code by entering string values such as "hi" as command line arguments 
 */

/* DEMO - Need for 'if' statement in finally 
 * 'finally' blocks acts as "clean-up". It is executed weather exception exists or not 
 * Therefore, it is a good programming practice to use 'if' statements in finally to check if exceptions occurred or not 
 */

public class FinallyDemo {
	
	public static void main(String[] args) {
		boolean exception = false; int result=0; 
		
		boolean calc = false; 
		try
		{
			
			result = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
			System.out.println("Result is " + result); 
			calc = true; 
			
		}
		catch (ArithmeticException e)
		{
			exception = true; 
			System.out.println("ArithmeticException in Code!! Checkout \n"); 
			e.printStackTrace();
			
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			exception = true; 
			System.out.println("ArrayIndexOutOfBoundsException in Code!! Checkout \n");
			e.printStackTrace();
			
			
		}
		finally
		{
			 /* DEMO - Run the code by commenting out line #47 
			  * When no exception occurs, still the output statement is displayed 
			 */
			if(exception == false && calc == false)
			{
			System.out.println("Result before cleaning up in finally is "+result); 
			System.out.println("\n Uncaught Exceptions exists. Displayed in finally block"); 
			result = 1; 
			System.out.println("In finally block Result is set to the default value "+result); 
			}
			
			
	    }
	}
}
