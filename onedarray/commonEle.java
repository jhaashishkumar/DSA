package onedarray;

public class commonEle {
    public static void main(String[] args) {
        int[] my_array = {10, -20, 3, 140, 50};
        int[] my_array1 = {101, 20, 3, 40, 50};
        for(int i = 0; i < my_array.length; i++){
            for(int j = 0; j < my_array1.length; j++){
                if(my_array[i] == my_array1[j]){
                    System.out.println(my_array[i]);
                }
            }
        }        
    }
}
