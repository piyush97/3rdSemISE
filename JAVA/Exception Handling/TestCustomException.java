package MyExceptions;

//DEMO - of 'throw' and 'throws' 

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  

class TestCustomException{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("Age not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{
	    	  
	      validate(23);  
	      //DEMO - Simulating exceptions other than the custom InvalidAgeException 
	      validate(Integer.parseInt("hi"));  
	      }catch(InvalidAgeException m){System.out.println("Exception occured: "+m);}  
	      catch(Exception e) {
	    	  System.out.println("Catching other uncaught exceptions in main..."+e); 
	      }
	  
	      System.out.println("rest of the code in main...");  
	  }  
	}  