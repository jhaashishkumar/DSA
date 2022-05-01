package onedarray;
import java.util.*;
public class unionOfArray {
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
        /*
        int res[] = new int[n1 + n2];
        for(int i = 0; i < arr1.length; i++){
            res[i] = arr1[i];
        }

        int k = 0, n3 = arr1.length;
        for(int i = 0; i < arr2.length; i++){
            if(res[k] != arr2[i]){
                res[n3] = arr2[i];
                n3++;
            }
            k++;
        } 
        for(int i = 0; i < n1 + n2; i++){
            System.out.println(res[i]);
        }
        */
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }    
        // For remainig element
        while (i < n1)
        System.out.print(arr1[i++] + " ");
        while (j < n2)
        System.out.print(arr2[j++] + " ");
    }
}
