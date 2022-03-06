package pattern;
import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 65;
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print((char) alpha);
            }
            alpha++;
            System.out.println();
        }
    }
}
