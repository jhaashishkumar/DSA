package syntaxTest;
import java.util.*;
public class linerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int check1 = 1;        
        for(int i = 1; i < n; i++){
            if(x[i] != x[i - 1]){
                check1 = 0;
                break;
            }            
        }
        if(check1 == 1){
            System.out.println("YES");
            return;
        }

        int check2 = 1;
        for(int i = 1; i < n; i++){
            if(y[i] != y[i - 1]){
                check2 = 0;
                break;
            }            
        }
        if(check2 == 1){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
