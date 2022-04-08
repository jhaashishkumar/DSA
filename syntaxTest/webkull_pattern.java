package syntaxTest;
import java.util.*;
public class webkull_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;

        for(int i = 1; i <= n; i++){
            System.out.print("@");
        }
        System.out.println();

        for(int i = 1; i <= n; i++){
            //For Space
            for(int j = 1; j <= nsp; j++){
                System.out.print(" ");
            }
            //For Star
            for(int j = 1; j <= nst; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i <= n / 2){
                nst++;
            }else{
                nst--;
            }
        }

        for(int j = 1; j <= n - 2; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= n; j++){
            System.out.print("@");
        }
    }
}
