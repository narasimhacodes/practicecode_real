import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Find the second largest number in this array
public class ListExx {
    public static void main(String[] args) {
        Integer[] a = {23, 74, 64, 87, 64, 162, 54};
        int max1 = 0;
        int max2 = 0;
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];

            } else if(a[i] > max2) {
                    max2 = a[i];
            }
        }
        System.out.println(max2);
    }
}
