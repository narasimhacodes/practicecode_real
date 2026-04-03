import java.util.Arrays;

public class MoveAllZerosEndArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
//        int left = 0;
//        for (int right=1; right < arr.length; right++){
//            if (arr[right] != 0){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//            }
        int right = 0;
        for (int left=0; left < arr.length; left++){
            if (arr[left] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
