package pattern;
import java.util.*;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int nod = 1;

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=sp; j++){
                System.out.print("\t");
            }            
            for(int j = 1; j<=nod; j++){
                System.out.print(j+"\t");                
            }
            sp--;
            nod++;
            System.out.println();
        }
    }
}
