package MyExceptions;

// Demonstrating Catching Known Exceptions with specific catch statements 
/* DEMO - Run this code by giving the second argument as 
 * a) 0 - To see ArithmeticExcption being caught 
 * b) nothing - To see ArrayIndexOutOfBoundsExcption being caught 
 */

public class TryCatchSpecific {

	public static void main(String[] args) {
		try
		{
			
			int result = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
			System.out.println("Result is " + result); 
			
		}
		catch (ArithmeticException e)
		{
			
			System.out.println("ArithmeticException in Code!! Checkout \n"); 
			e.printStackTrace();
			
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("ArrayIndexOutOfBoundsException in Code!! Checkout \n");
			e.printStackTrace();
			
			
		}
		
		
	}


	}


