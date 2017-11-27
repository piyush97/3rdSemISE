package MyExceptions;

class Calculate 
{ 
	
	static int myCal (int i, int j,String a[]) throws ArithmeticException, ArrayIndexOutOfBoundsException 
	{ 
		
			int result=0;
		
		/* This code of division is never executed 
		 *  Line #20 when uncommented, raises an ArrayIndexOutOfBounds Error and transfers control to the calling program 
		 * 
		 */
			if (j != 0)
			{
			result = i/j; 
			int myargs[] = new int[a.length]; 
			System.out.println("My Arguments entered transferred to integer array called 'myargs' are "); 
			
			for(int k = 0; k<a.length; k++)
			{
				
				myargs[k] = Integer.parseInt(a[k]); 
				System.out.println(myargs[k]); 
				
			}
			//System.out.println("Trying to get Out of Bounds Exception "+ myargs[a.length]);
			
			return result; 
			}
			else 
				throw new ArithmeticException(); 
			
						 		
	}//end of myCal method 
}//end of class MyCalculate 


public class MultipleBlocksDemo {

public static void main(String[] args) {
		
		Calculate omyc = new Calculate();
		
		try
		{
			// DEMO - myDivision procedure called within try-catch in main 
		System.out.println("Result of division is "+omyc.myCal(Integer.parseInt(args[0]), Integer.parseInt(args[1]),args)); 
		}
		/* DEMO - 'throws' clause for 'myDivision 
		 * The Exceptions are caught in the 'calling program' 
		 */
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught in main where myCalculate is called");
			e.printStackTrace();
			
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
		catch (Exception e)
		{
			System.out.println("UncaughtException caught in main ");
			e.printStackTrace();
			
		}

}//end of main
	
}//end of class MultipleBlocks