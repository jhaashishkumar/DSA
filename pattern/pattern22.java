package pattern;
import java.util.*;
public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 64;
        // int temp = n;

        for(int i = 1; i<=n; i++){            
           
            int k = i;
            for(int j = 1; j<=n-i+1; j++){                
                System.out.print((char) (alpha + k)+" ");
                k++;
            }                        
            System.out.println();
           
        }
    }
}
