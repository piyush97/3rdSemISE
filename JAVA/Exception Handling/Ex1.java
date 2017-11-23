class Ex1
{
    public static void main(String[] args) {
        int d,a;
        try{//monitor a block of code
            d=0;
            a=42/d; //diving by zero to make it an exception
            System.out.println("This won't be printed ");

        }
        catch(ArithmeticException e)
        {
            //catching divide by zero error
            System.out.println("Division by Zero");
        }
    }
}