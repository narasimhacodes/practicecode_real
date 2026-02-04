import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;
class PalindromLongString{
    public boolean isPalinLongString(String input){
        // String input = "A man, a plan, a canal, Panama";
        char[] chr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character c : chr){
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String rev = sb.reverse().toString();
        return sb.toString().equals(rev);
    }
}
class Palindrome{
    public Boolean ispalindrom(String s){
        s = s.replaceAll("\\s","").toLowerCase();
        String sb = new StringBuilder(s).reverse().toString().toLowerCase();
        if (s.equals(sb)){
            return true;
        }
        return false;
//        s = s.toLowerCase();
//        int left =0;
//        int right = s.length()-1;
//        while(left<right){
//            if(s.charAt(left) != s.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
    }
}
public class palindromString {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.nextLine();

 //       String s = "Madam";
        Palindrome p = new Palindrome();
        if (p.ispalindrom(input)){
            System.out.println("This is palindrom");
        }else {
            System.out.println("This is not palindrom");
        }
    }
}
