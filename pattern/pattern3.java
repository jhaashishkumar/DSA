package pattern;
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 64;
        int k;
    
        for(int i = 1; i<=n; i++ ){
            
            k = i;            
            for(int j = 1; j<=i; j++ ,k++){
               System.out.print((char) (alpha + k));                                          
            }            
            System.out.println();
        }
    }
}
