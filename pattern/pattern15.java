package pattern;
import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 64;
        int temp = n;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n - i + 1; j++){
                System.out.print((char) (alpha + temp));
            }
            temp--;
            System.out.println();
        }
    }
}
