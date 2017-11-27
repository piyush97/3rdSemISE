package MyExceptions;

public class NoExceptionDemo {

	public static void main(String[] args) {
		
		/* DEMO - Run this code
		 *  a) without passing command line arguments & see the ArrayIndexOutOfBoundsException 
		 *  b) passing second argument as zero & see the ArithmeticException / by zero 
		 */
		
		int result = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
		System.out.println("Result is " + result); 
		

	}

}
