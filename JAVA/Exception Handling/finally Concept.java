public class finally {
    public static void main(String[] args) {
        int a[]=new int[4];
        try{
            for(int i=0;i<6;i++)//for exception we are moving index from 0 to 6 but the array size if 4 so it'll throw an exception
            {
                a[i]+=i;
            }
            for (int value:a)
            {
                System.out.println(value);
            }
        }
        catch (Exception e)//i'm writing just Exception coz i don't know which kind of exception it may throw
        {
            System.out.println("the exception is "+e);
        }
        finally
        {
            System.out.println("This line will be surely printed as this is in finally");
        }
    }
}