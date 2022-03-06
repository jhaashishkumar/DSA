package pattern;
import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = 2*n+1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=col; j++){
                if(i==j || j==col/2 + 1 || i + j ==2*n+2){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
