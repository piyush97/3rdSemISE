public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int a=10,b=0,c=0;
        try{
            c=a/b;
        }
        catch (Exception e)//i'm writing just Exception coz i don't know which kind of exception it may throw
        {
            System.out.println("Cannot divide by zero and the exception is "+e);
        }
    }
}
