package pattern;
import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int nod = 1; 
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=nod; j++){
                System.out.print(" * ");
            }
            if(i<=n/2){
                sp++;
                nod++;
            }else{
                sp--;
                nod--;
            }
            System.out.println();
        } 
    }
}
