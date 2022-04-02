import java.util.*;
public class aaditiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        while(n>0){         
                         
            int  c = a + b;
            a = b;
            b = c;
            if(n == 1) {                //for nth term
                System.out.println(a);
            }  
            n--;
        }        
    }
}
