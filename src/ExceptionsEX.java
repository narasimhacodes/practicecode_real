import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class Balence{
    double Bankbalence;

    public Balence(double bankbalence) {
        this.Bankbalence = bankbalence;
    }
}
public class ExceptionsEX {
    public static void checkAge(int age) throws Exception{
        if( age < 18){
            throw new CustomException("This is not correct age for apply the vote");
        }else {
            System.out.println("This is correct age for vote");
        }
    }
    public static void withdrawBalence(double withdrawAmount) throws InsufficientBalanceException{
        double bankbalence = 2000;
       if (bankbalence < withdrawAmount){
           throw new InsufficientBalanceException("your bank balence is Insufficient balence, try to withdraw less amount" + bankbalence);
       }else {
           System.out.println("Successfully completed the transaction : " + withdrawAmount);
           bankbalence = bankbalence - withdrawAmount;
           System.out.println("Your current balence : " + bankbalence);
       }


    }
    public static void main(String[] args) throws Exception{
        // Try with resources
        try (BufferedReader br = new BufferedReader(new FileReader("Tst.txt"))){
            System.out.println(br.readLine());

        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            checkAge(13);
        }catch (CustomException e){
            System.out.println("Caught Exception :  " +e.getMessage());
        }
        try {
            withdrawBalence(8000);
        }
        catch (InsufficientBalanceException e){
            e.printStackTrace();
            System.out.println("Caught Exception : " + e.getMessage());
        }
        finally {
            System.out.println("Exceution is complted");
            System.exit(1);
        }
    }
}
