package ds.module1test;
import java.util.*;
public class welcome_Rangoli {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int  m = scn.nextInt();
        int dash = (m-3)/2;
        int star = 1;
        for(int i = 1; i<=n; i++){
            if(i==n/2+1){  // mid row
                for(int j =1; j<=(m-7)/2; j++){
                    System.out.print("-");
                }
                
                System.out.print("WELCOME");
                
                for(int j =1; j<=(m-7)/2; j++){
                    System.out.print("-");
                }
            }else{  // dash
                for(int j =1; j<=dash; j++){
                    System.out.print("-");
                }// star
                for(int j =1; j<=star; j++){
                    System.out.print(".|.");
                }
                for(int j = 0; j < dash; j++){
                    System.out.print("-");
                }
            }    
            if(i <= n/2){
                dash -= 3;
                star += 2; 
            }else{
                dash += 3;
                star -= 2;
            }
            System.out.println();
            
    }
}
