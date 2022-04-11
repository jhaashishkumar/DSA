package stringAndArrayList;
import java.util.*;

// import javax.print.attribute.standard.Compression;
public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       System.out.println(compression1(str));
       System.out.println(compression2(str));
    }

    public static String compression1(String str) {
        String s = "";
        s += str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                s += str.charAt(i);
            }
        }
        return s;
    }

    public static String compression2(String str) {
        String s = "";
        s += str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1)){
                count++;
            }else{
                if(count > 1){
                    s += count;
                }
                s += str.charAt(i);
                count = 1;
            }
        }
        if(count > 1){
            s += count;
        }
        return s;
    }
}
