interface A {
    public  void add();

    default void sub() {
        System.out.println("This is for sub using default");
    }

    default void div() {
        System.out.println("This is division method");
    }
}

interface B {
    public void multiply();

    // Java 8 added static methods
    static void calcultor(int a, int b) {
        System.out.println("The result is :" + a + b);
    }
}

class Real implements A, B {

    @Override
    public void add() {
        System.out.println("This is A implementation");
    }

    @Override
    public void sub() {
        A.super.sub();
    }

    public void multiply() {
        System.out.println("This is multiply method ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Real aa = new Real();
        aa.sub();
        aa.multiply();

        B.calcultor(23, 12);
    }
}
