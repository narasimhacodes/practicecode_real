import java.util.stream.IntStream;

public class SumOfDigits {
    public int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
           int  LastDigit = num % 10;
           sum = sum + LastDigit;
           num = num /10;
        }
        return sum;
    }
    public static void main(String[] args){
        int num = 1233456;

// Using streams
        String result = Integer.toString(num);
        IntStream chars = result.chars();
        IntStream intStream = chars.map(ch -> Character.getNumericValue(ch));
        int finalsum = intStream.sum();
        System.out.println(finalsum);

//        IntStream in = IntStream.of(1,2,3);
//        int result = in.sum();
//        System.out.println(result);

  // using direct Intstream
  int  stream = IntStream.iterate(num, n -> n>0, n-> n/10).map(n-> n%10).sum();
        System.out.println(stream);
// using normal method implementation
        SumOfDigits SD = new SumOfDigits();
        System.out.println(SD.sumOfDigits(num));
    }
}
