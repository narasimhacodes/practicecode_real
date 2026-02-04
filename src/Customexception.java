class myOwnException extends Exception{
    myOwnException(String message){
        super(message);
    }

}
public class Customexception {
    public  void ageCheck(int age) throws myOwnException{
        if (age < 18){
            throw new myOwnException("This age is not correct for vote");
        }
        System.out.println("this is corrct age " +  age);
    }
    public static void main(String[] args) throws myOwnException{
        Customexception cx = new Customexception();
       try {
           cx.ageCheck(17);
       }catch (myOwnException e){
           System.out.println(e.getMessage());
       }
    }
}
