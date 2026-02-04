import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class PrimeChk {

//    public Boolean isPrime(int n){
//        boolean prime = true;
//        for (int i=2;i<n; i++){
//            if (n % i ==0){
//                prime = false;
//                break;
//            }
//        }
//        return prime;
//    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;       // 2 is prime
        if (n % 2 == 0) return false;  // eliminate all other evens

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
//        int num = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
//        System.out.println(isPrime(num) ? "Give number is prime number" : " Given number is not prime");
        PrimeChk p = new PrimeChk();
        if (p.isPrime(n)){
            System.out.println("This is prime number");
        }else {
            System.out.println("This is not prime");
        }

    }
}
