package onedarray;

public class reverseArray {
    public static void main(String[] args) {
        int[] my_array = {10, 20, 30, 40, 50};      
        int k = 0;

        for(int i = my_array.length - 1; i >= 0; i--){            
            my_array[k] = my_array[i]; 
            k++;
        }
        
        for(int i = 0; i < my_array.length; i++){
            System.out.println(my_array[i]);
        }
    }
}
