package twodarray;
import java.util.*;
public class rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
  
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
              }
        }
        
        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int hi = arr[0].length - 1;
            while(li <= hi){
                int temp = arr[i][li];
                arr[i][li] = arr[i][hi];
                arr[i][hi] = temp;

                li++;
                hi--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    
    }
}
