package onedarray;

public class secondLowestElement {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 11, 100, 34, 10};
        int small , secondSmall;

        small = secondSmall = Integer.MAX_VALUE;

        if(arr.length < 2){
            System.out.println("Invalid Input");
            return;
        }

        // Find Small Element
        for(int i = 0; i < arr.length; i++){
            small = Math.min(small, arr[i]);
        }

        //Find Second Small Element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != small){
                secondSmall = Math.min(secondSmall, arr[i]);
            }
        }
        if(secondSmall == Integer.MAX_VALUE){
            System.out.println("There is no second small element.");
        }
        else{
            System.out.println(secondSmall);
        }
    }
}
