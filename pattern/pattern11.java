package pattern;
import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2*n-2;
        
        for(int i= 1; i<=n; i++){

            for(int j = 1; j<=i; j++){
                System.out.print(j+"\t");
            }
            for(int j = 1; j<=sp; j++){
                System.out.print("\t");
            }

            for(int j = i; j>=1; j--){
                System.out.print(j+"\t");
            }
            sp-=2;
            System.out.println();
        }
    }
}
