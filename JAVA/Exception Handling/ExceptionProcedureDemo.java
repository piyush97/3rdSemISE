package MyExceptions;
/* DEMO - Write the logic in a function called 'myDivision' and calling it from 'main' 
 * Run the code by 
 * a) Giving proper arguments 
 * b) Second Argument as '0'. ArithmeticException is caught in 'myDivision' 
 * c) Not give second argument - code jumps  out of 'myDivision' procedure, and executes 'catch' block in main 
 * d) Give string arguments - finally in main is executed 
 */

public class ExceptionProcedureDemo {
	
	static int myDivision (int i, int j) { 
		int result=0; 
		try
		{
			
			result = i/j; 	
		}
		catch (ArithmeticException e)
		{
			/* DEMO - Run this code by giving the second argument as 
			 * a) 0 - To see ArithmeticExcption being caught 
			 * b) nothing - To see ArrayIndexOutOfBoundsExcption being caught in 'main' not in 'myDivision' 
			 */
			System.out.println("ArithmeticException in myDivision procedure!! Checkout ");
			e.printStackTrace();
						
		}
		return result; 
	
	}

	public static void main(String[] args) {
		
		try
		{
			// DEMO - myDivision procedure called within try-catch in main 
		System.out.println("Result of division is "+myDivision(Integer.parseInt(args[0]), Integer.parseInt(args[1]))); 
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught in main ");
			e.printStackTrace();
			
		}
		catch (Exception e)
		{
			System.out.println("UncaughtException caught in main ");
			e.printStackTrace();
			
		}

	}

}
