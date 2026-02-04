import java.util.Scanner;

class isReversed {
    public boolean reverse(int nums) {
//        String str = Integer.toString(num);
//        String sb = new StringBuilder(str).reverse().toString();
//    //    int result = Integer.parseInt(sb);
//        if (sb.equals(str)){
//            return true;
//        }else return false;

// without inbuit .reverse method
        int reverse = 0;
        int original = nums;
        while (original != 0){
            int lastdigit = original % 10;
            reverse = reverse * 10 + lastdigit;
            original = original / 10;
        }
        if (nums == reverse) {
            return true;
        }

        return false;
    }
}
public class Palindrom {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.nextLine();
        int nums = 1221;
        isReversed ir = new isReversed();
      if (ir.reverse(nums)){
          System.out.println("this is palindrome");
      }else {
          System.out.println("this is not palindorm");
      }

    }
}




//public class PalindromeCheck {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        int originalNum = num; // store the original number
//        int reversedNum = 0;
//
//        // Reverse the number using arithmetic
//        while (num != 0) {
//            int digit = num % 10;       // get the last digit
//            reversedNum = reversedNum * 10 + digit; // build the reversed number
//            num = num / 10;             // remove the last digit
//        }
//
//        // Check if the original number is equal to the reversed number
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is a palindrome.");
//        } else {
//            System.out.println(originalNum + " is not a palindrome.");
//        }
//
//        scanner.close();
//    }
//}



 //   String input = "A man, a plan, a canal, Panama";
//public class PalindromeCheck {
//    public static boolean isPalindrome(String s) {
//        // Step 1: Clean the string (keep only letters and digits, convert to lowercase)
//        StringBuilder cleaned = new StringBuilder();
//        for (char c : s.toCharArray()) {
//            if (Character.isLetterOrDigit(c)) {
//                cleaned.append(Character.toLowerCase(c));
//            }
//        }
//
//        // Step 2: Reverse the cleaned string
//        String reversed = cleaned.reverse().toString();
//
//        // Step 3: Check if original cleaned string equals reversed string
//        return cleaned.reverse().toString().equals(reversed); // reverse again to restore original
//    }
//
//    public static void main(String[] args) {
//        String input = "A man, a plan, a canal, Panama";
//        if (isPalindrome(input)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
//}

