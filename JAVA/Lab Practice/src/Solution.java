import java.util.*;
import java.text.*;


public class Solution {
    public static void main(String[] args) {


        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
       Random r=new Random();

       arr[0]=r.nextInt(3);
       arr[1]=r.nextInt(3);
       arr[2]=r.nextInt(4);
       arr[3]=r.nextInt(2);
        arr[4]=r.nextInt(1+1);
        for (int j :arr)
        {
            System.out.println(j);
        }

    }
}

