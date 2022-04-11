package stringAndArrayList;
import java.util.*;
public class diffOfTwoConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        StringBuilder sb = new StringBuilder();        
        sb.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            int d = str.charAt(i) - str.charAt(i - 1);
            sb.append(d);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
