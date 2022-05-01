package onedarray;
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0;
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                j++;
            }else{

                // System.out.print("Intersection of two array is : "+arr2[j++]+" ");
                System.out.println(arr2[j++]+" ");
                i++;
            }
        } 
    }
}
