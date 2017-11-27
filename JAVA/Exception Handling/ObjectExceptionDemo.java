package MyExceptions;

class MyDivision { 
	
	int myDivision (int i, int j) { 
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
}//end of class MyDivision 

public class ObjectExceptionDemo {

	public static void main(String[] args) {
		MyDivision omydiv = new MyDivision(); 
		
		try
		{
			// DEMO - myDivision procedure in MyDivision Class called within try-catch in main 
		System.out.println("Result of division is called via MyDivision object "+omydiv.myDivision(Integer.parseInt(args[0]), Integer.parseInt(args[1]))); 
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
