package onedarray;
import java.util.*;
public class cyclicRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }             

        int i = 0, j = arr.length - 2; 
        int a1[] = swap(arr, i, j);
        int a2[] = swap(a1, 0, arr.length - 1);
        for(int id = 0; id < arr.length; id++){
            System.out.print(arr[id]);
        }
        
    }
    public static int[] swap(int arr[], int i, int j) {
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    
            i++;
            j--;
        }
        return arr;
    }
}
