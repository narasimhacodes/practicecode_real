class reversePalindrom{
    public int reverse(int nums){
        String str = Integer.toString(nums);
        String reverseNum = new StringBuilder(str)
                .reverse()
                .toString();
        int reverseValue = Integer.parseInt(reverseNum);
        return reverseValue;
    }

    public boolean palindrom(int nums){
        String str1=Integer.toString(nums);
        String reversedStr = new StringBuilder(str1).reverse().toString();
        if (nums < 0) return false;
        return  str1.equals(reversedStr);
    }

//  Without using Inbuit methods------

//    public int reverse(int nums){
//        int rev = 0;
//        while( nums != 0){
//            int reversevalue = nums % 10;
//            rev = rev*10 + reversevalue;
//            nums = nums/10;
//        }
//        return rev;
//    }
//    public boolean isPalindrome(int nums){
////        if (nums < 0){
////            return false;
////        }
//        return nums == reverse(nums);
//    }


}
public class PalindromeCh {
    public static void main(String[] args){
        int nums = 1221;
        reversePalindrom rp = new reversePalindrom();
        System.out.println("Actual Interger is " + nums);
        int result = rp.reverse(nums);
        System.out.println("Reversed Interger is : "+ result);
        System.out.println( rp.palindrom(nums) ? "This is valid palindrome" : "This is not valid palindrome");

 //  Without inbuit methods
//        int result = rp.reverse(nums);
//        System.out.println(result);
//        if (rp.isPalindrome(nums)){
//            System.out.println("This is palindrom");
//        }else {
//            System.out.println("this is not palindrome");
//        }
    }
}
