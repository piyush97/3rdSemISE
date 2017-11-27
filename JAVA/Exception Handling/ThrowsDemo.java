package MyExceptions;

//DEMO - of 'throw' and 'throws' 

class MyBalanceException extends Exception{ 
		MyBalanceException(String s){
		super(s); 
	}
	
}

public class ThrowsDemo {
	static int balance=1000; 
	static void deposit(int amt) { 
		balance = balance + amt; 
	}
	static int getBalance() { return balance; }
	static void withdraw(int amt) throws MyBalanceException{ 
		
			if (balance == 1000) { 
				
				throw new MyBalanceException("Sorry - cannot withdraw - Min Balance Rs.1000 to be maintained"); 	
			}
			else
				balance = balance - amt; 
				
		}//end of withdraw
	
	public static void main(String[] args) {
 		try
		{
 		deposit(0);	
		withdraw(200);
		}
        catch (Exception mye) { 
        	mye.printStackTrace();	
		}
		System.out.println("Balance is "+getBalance()); 

	}
}
