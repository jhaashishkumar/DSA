package pattern;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){

            for(int j = i; j>0; j--){
                System.out.print(j);
                
            }            
            System.out.println();
        }
    }
}
