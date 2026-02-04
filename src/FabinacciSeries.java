public class FabinacciSeries {

    public static int fabinacciS(int num){
        if (num <= 1) return num;
        int prev = 0;
        int current = 1;
        for (int i = 2; i<=num; i++){
            int next = prev+current;
            prev = current;
            current = next;
        }
        return current;
    }
//    public static void fabinacciS(int num){
//        // 0 1 1 2 3 5 8....
//        int prev = 0;
//        int current = 1;
//        System.out.println("The series is");
//
//        for (int i =1; i<=num; i++){
//            System.out.print(prev + " ");
//            int next = prev + current;
//            prev = current;
//            current = next;
//        }
//        System.out.println();
 //   }
    public static void main(String[] args){
        int num = 6;
        FabinacciSeries fs = new FabinacciSeries();
      int result = fs.fabinacciS(num);
        System.out.println(result);
    }
}
