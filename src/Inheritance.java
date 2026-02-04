interface Vechle{
    public void show();
}
interface Car {
    default void show(){
        System.out.println("This is car");
    }
}
class a implements Vechle,Car{

    @Override
    public void show() {
        Car.super.show();

    }
}
class motor implements Vechle,Car{

    @Override
    public void show() {
    }
}
class aa{
    final void s(){
        System.out.println("this is final");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Vechle v = new motor();
        v.show();
    }
}
