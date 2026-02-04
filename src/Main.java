import java.sql.Struct;

class ispalindrome{
    public boolean ispalindrome(String str){
        String str1 = str.toLowerCase();
        int left = 0;
        int right = str1.length() -1;
        while(left < right){
            if (str1.charAt(left)==str1.charAt(right)){
                left ++;
                right --;

            }else return false;
        }
        return true;
    }
}
public class Main {
    public static boolean palindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String revstr = sb.reverse().toString();
        if (str == null) return false;
        if (str.equalsIgnoreCase(revstr)){
            return true;
        } return false;
    }
    public static void main(String[] args) {
        String  str = "Level";
        ispalindrome ip = new ispalindrome();
        System.out.println(ip.ispalindrome(str));

//        final boolean palindrome = palindrome(str);
//        System.out.println(palindrome);



//        System.out.println(sb.reverse().toString());
    }
}