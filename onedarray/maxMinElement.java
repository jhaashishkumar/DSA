package onedarray;

import java.util.Scanner;

public class maxMinElement {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] my_array = {10, -20, 3, 140, 5};
        int max = my_array[0];
        int min = my_array[0];
        for(int i = 1; i < my_array.length; i++){
            if(max <= my_array[i]){
                max = my_array[i];
            }

            if(min >= my_array[i]){
                min = my_array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
