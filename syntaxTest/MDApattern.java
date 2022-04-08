package syntaxTest;
import java.util.*;
public class MDApattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst1 = n, nst2 = 2*n-1, nst3 = 1;
        int nsp1 = 2, nsp2 = 2;

        for(int i = 1; i <= n; i++){
            //1st star
            for(int j = 1; j <= nst1; j++){
                System.out.print("*");
            }
            //1st space
            for(int j = 1; j <= nsp1; j++){
                System.out.print(" ");
            }
            //2nd star
            for(int j = 1; j <= nst2; j++){
                System.out.print("*");
            }
            //2nd space
            for(int j = 1; j <= nsp2; j++){
                System.out.print(" ");
            }
            //3rd star
            for(int j = 1; j <= nst3; j++){
                System.out.print("*");
            }
            //3rd space
            for(int j = 1; j <= nsp2; j++){
                System.out.print(" ");
            }
            //4th star
            for(int j = 1; j <= nst2; j++){
                System.out.print("*");
            }
            //4th space
            for(int j = 1; j <= nsp1; j++){
                System.out.print(" ");
            }
            //5th star
            for(int j = 1; j <= nst1; j++){
                System.out.print("*");
            }
            nsp1++;
            nst2 = nst2 - 2;
            nst3 = nst3 + 2;
            System.out.println();
        }


    }
}
