package onedarray;

public class secondLargestElement {
    public static void main(String[] args) {     

    // Function to print the second largest elements
    
    int arr[] = { 12, 35, 1, 100, 34, 1 };
    // int arr[] = { 15, 15}; //No largest element
    int n = arr.length;
    int i, first, second;
    
    // There should be atleast two elements
    if (arr.length < 2)
       {
        System.out.printf(" Invalid Input ");
        return;
       }
    
    int largest = second = Integer.MIN_VALUE;
    
    // Find the largest element
    for(i = 0; i < arr.length; i++)
       {
        largest = Math.max(largest, arr[i]);
       }
    
    // Find the second largest element
    for(i = 0; i < arr.length; i++)
       {
        if (arr[i] != largest)
            second = Math.max(second, arr[i]);
       }
       if (second == Integer.MIN_VALUE)
        System.out.printf("There is no second " +
                       "largest element\n");
       else
        System.out.printf("The second largest " +
                        "element is %d\n", second);
  
    }
}