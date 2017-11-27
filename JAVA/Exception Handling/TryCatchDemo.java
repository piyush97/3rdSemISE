package MyExceptions;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try
		{
			
			int result = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
			System.out.println("Result is " + result); 
			
		}
		catch (Exception e)
		{
			/* DEMO - Run this code by giving the second argument as 
			 * a) 0 - To see ArithmeticExcption being caught 
			 * b) nothing - To see ArrayIndexOutOfBoundsExcption being caught 
			 */
			System.out.println("Exception in Code!! Checkout "+e);
			
			
		}
		
		
	}

}
