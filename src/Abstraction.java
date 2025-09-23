import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

abstract class Car{
    public abstract void drive();

    public void playing(){
        System.out.println("Play the music");
    }
}
class Shift extends Car{// concrete class extends the abstract

    @Override
    public void drive() {
        System.out.println("i Know the driving");
    }
}
public class Abstraction {
    public static void main(String[] args) throws FileNotFoundException {

        Car cc = new Shift();
        cc.drive();

    }
}
