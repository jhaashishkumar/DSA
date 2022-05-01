package ds.module1test;
import java.util.*;
public class circle_manic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        
        int d = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        // d = d*d;
        if(d == 0){
            System.out.println("concentric");
        }else if(d == (r1 + r2)*(r1 + r2)){
            System.out.println("touches at 1 point");
        }else if(d > (r1 + r2)*(r1 + r2)){
            System.out.println("far-apart");            
        }else if(d < (r1 + r2)*(r1 + r2) && d > (r1 - r2)*(r1 - r2)){
            System.out.println("touches at 2 point");;
        }else {
            System.out.println("overlaps");
        }   
    }
}
