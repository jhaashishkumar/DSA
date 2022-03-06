package pattern;
import java.util.*;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int alpha = 64;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((char)(alpha + temp)+"\t");
            }
            temp--;
            System.out.println();
        }
    }
}
