package ds.module1test;
import java.util.*;
public class point-of-parity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        // code here
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
           sum += arr[i];
        }    
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum - arr[i];
            
            if(leftSum == sum){
                System.out.println(i);
                return;
            }
            leftSum += arr[i];                                        
        }
        System.out.println("-1");
    }
}
