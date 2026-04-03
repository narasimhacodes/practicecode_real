import java.util.HashSet;
import java.util.Set;

public class CommonElements3Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> commonElement = new HashSet<>();
        for (int num : arr1){
            set1.add(num);
        }
        for (int num1 : arr2 ){
            if (set1.contains(num1)){
                set2.add(num1);
            }
        }
        for (int num2 : arr3){
            if (set2.contains(num2)){
                commonElement.add(num2);
            }
        }
        System.out.println(commonElement);
    }
}
