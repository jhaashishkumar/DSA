package onedarray;
import java.util.*;

public class insertEleSpePos {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a[] = new int[10];

        int[] my_array = {10, 20, 30, 40, 50};

        // // Insert an element in 3rd position of the array (index->2, value->5)
   
         int Index_position = 2;
         int newValue    = 5;

        // System.out.println("Original Array : "+Arrays.toString(my_array));     
   
        for(int i = my_array.length - 1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        for(int i=Index_position; i > 0 ; i--){
            my_array[i] = my_array[i-1];
        }
        for(int i = 0; i < my_array.length ; i++){
            System.out.println(my_array[i]);
        }
        // // System.out.println("New Array: "+Arrays.toString(my_array));
    
        
        
    }   
}


