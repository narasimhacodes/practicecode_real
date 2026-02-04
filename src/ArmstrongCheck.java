public class ArmstrongCheck {
    public static int armstongchk(int num){
        // 153 = 1 + 125 + 27 == 1 5 3
        int originalval = num;
        int sum = 0;
//        int  digits = String.valueOf(originalval).length();
        int  digits = Integer.toString(originalval).length();
        while(originalval > 0){
           int digit = originalval % 10;
           sum = (int) (sum +Math.pow(digit, digits));
           originalval = originalval/10;
        }
        return sum;

    }
    public static void main(String[] args){
        int num = 153;
        if (num == armstongchk(num)){
            System.out.println("This is armstrong number");
        }
        else {
            System.out.println("This is not armstong number");
        }

    }
}
