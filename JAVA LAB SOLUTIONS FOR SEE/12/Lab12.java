//1.Write a java program to help the shop owner to create a Map of his customer’s id with the credit points. The customer id’s are in the range 100 to 200. For customer’s id from 105 to 120 update the credit points by 20. For customer’s id from 125 to 200 update the credit points by 30.  Display the customer map.
import java.util.*;
public class Shop {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[])
    {
        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
        System.out.println("Enter the number of customers");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the customer id ");
            int custId=s.nextInt();
            System.out.println("Enter the credit Points");
            int credit=s.nextInt();
            hashmap.put(custId,credit);
        }
        Set<Map.Entry<Integer,Integer>>set=hashmap.entrySet();
        for(Map.Entry<Integer,Integer> me:set)
        {
            if(me.getKey()>=105 && me.getKey()<=120)
                me.setValue(me.getValue()+20);
            if(me.getKey()>=125 && me.getKey()<200)
                me.setValue(me.getValue()+30);
            System.out.println("Cust id:"+me.getKey()+"Credit"+me.getValue());
        }
    }
}

//Easier Way
