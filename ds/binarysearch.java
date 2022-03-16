package ds;

import java.util.Scanner;

/**
 * binarysearch
 */
public class binarysearch {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        System.out.print(binarySearch(arr, k));
    }
    public static int binarySearch(int arr[], int k) {
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = (st + end)/2;

            if(arr[mid] < k){
                st = mid + 1;
            }else if(arr[mid] > k){
                end = mid - 1;
            }else{
                return mid;
            }
        } 
        return -1;
    }
    
}