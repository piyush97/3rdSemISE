package MyExceptions;

class MyBalanceException2 extends Exception{ 
	MyBalanceException2(String s){
	super(s); 
}

}

class MyBank{
static int balance=1000; 
static void deposit(int amt) { 
	balance = balance + amt; 
}
static int getBalance() { return balance; }
static void withdraw(int amt) throws MyBalanceException2{ 
	
		if (balance == 1000) { 
			
			throw new MyBalanceException2("Sorry - cannot withdraw - Min Balance Rs.1000 to be maintained"); 	
		}
		else
			balance = balance - amt; 
			
	}//end of withdraw
}
public class ThrowsDemo2 {
public static void main(String[] args) {
	MyBank omyb = new MyBank(); 
		try
	{
		omyb.deposit(0);	
	omyb.withdraw(200);
	}
    catch (Exception mye) { 
    	mye.printStackTrace();	
	}
	System.out.println("Balance is "+omyb.getBalance()); 

}
}

