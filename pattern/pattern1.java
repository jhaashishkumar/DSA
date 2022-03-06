package pattern;
import java.util.*;

public class pattern1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = n/2;
        int count = 1;

        for(int i =1; i<=n; i++){

            for(int j = 1; j<=sp; j++){
                System.out.print("\t");
            }
            int dcount = count;
            for(int j = 1; j<=st; j++){
                System.out.print(dcount+"\t");
                if(j<=st/2){
                    dcount++;
                }else{
                    dcount--;
                }

            }
            if(i<=n/2){
                sp--;
                st+=2;
                count++;
            }else{
                sp++;
                st-=2;
                count--;
            }
            System.out.println();
        }
    }
}
