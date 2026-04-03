import java.util.HashSet;
import java.util.Set;

public class DuoDigit {
    public static void main(String[] args) {
        int digit = 120120;
        String s = String.valueOf(digit);
        char[] ch = s.toCharArray();
        Set<Character> digitCoun = new HashSet<>();
        for (char cc: ch){
            digitCoun.add(cc);
            if (digitCoun.size()>2){
                break;
            }

        }
        if (digitCoun.size()<=2){
            System.out.println("Give string is duodigits");
        }else{
            System.out.println("Not Duo digit ");
        }
    }
}
