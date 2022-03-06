package pattern;
import java.util.*;
public class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 64;
        int temp = n;

        for(int i = 1; i<=n; i++){            
           
            int k = temp;
            for(int j = 1; j<=i; j++){                
                System.out.print((char) (alpha + k)+" ");
                k--;
            }      
                        
            System.out.println();
           
        }
    }
}
