package pattern;
import java.util.*;

import javax.xml.validation.Validator;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int sp = n -1;
        int nod = 1; 
        int val = 1;
        for(int i= 1; i<=n; i++){
            for(int j =1; j<=sp; j++){
                System.out.print("\t");
            }
            int cval = val;
            for(int j =1; j<=nod; j++){
                System.out.print(cval+"\t");
                if(j<=nod/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            val++;
            sp--;
            nod+=2;
            System.out.println();
        }
    }
}
