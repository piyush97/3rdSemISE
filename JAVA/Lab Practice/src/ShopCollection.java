import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class ShopCollection
{
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of Customers");
        int n=scanner.nextInt();
        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter customer id");
            int CustomerId=scanner.nextInt();
            System.out.println("Enter credit points");
            int CreditPoints=scanner.nextInt();
            hashMap.put(CustomerId,CreditPoints);

        }
        Set<Map.Entry<Integer,Integer>> set=hashMap.entrySet();
        for(Map.Entry<Integer,Integer> me :set)
        {
            if(me.getKey()>=135 && me.getKey()<=120)
            {
                hashMap.put(me.getKey(),me.getValue()+20);
            }
            if((me.getKey()>=125)&&(me.getKey()<=200))
            {

            }
        }
    }
}
