class calculator {
    public int add(int a, int b) {
        int result = (a + b);
        return result;
    }

    public int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
class AdvCalculator extends calculator {
    public int add(int a, int b){
        int result = a + b +1;
        return result;
    }
}

public class Polymarphism extends Exception {
    public static void main(String[] args) throws IndexOutOfBoundsException, ArithmeticException {
//        calculator cc = new calculator();
//        System.out.println(cc.add(2, 3));
//        System.out.println(cc.add(2, 3, 4));
        AdvCalculator ac = new AdvCalculator();
        System.out.println(ac.add(23,2342));
    }
}
