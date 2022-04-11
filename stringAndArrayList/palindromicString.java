package stringAndArrayList;
import java.util.*;
public class palindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindromSubString(str);
    }

    public static void palindromSubString(String str) {
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String substr = str.substring(i, j);
                if(isPalindrome(substr)){
                    System.out.println(substr);
                }
            }
        }
    }

    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }    
}
