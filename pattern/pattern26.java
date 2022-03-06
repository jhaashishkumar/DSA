package pattern;
import java.util.*;
public class pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 64;
        
        for(int i = 1; i<=n; i++){            
           
            // int k = 1; // for 2nd method use k
            for(int j = 1; j<=2*i-1; j++){                
                System.out.print((char) (alpha + j)+" ");
                // k++;
            }                             
            System.out.println();
           
        }
    }
}
