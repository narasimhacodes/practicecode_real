public class FactorialSeries {
    public static int factorial(int num){
        int start = 1;
        for (int i =2; i<=num; i++){
     //       int increament = i;
      //      int multiply = start * i;
            start = start * i;
        }
        return start;
    }
    public static void main(String[] args){
        int num = 3;
        System.out.println(factorial(num));
    }
}
