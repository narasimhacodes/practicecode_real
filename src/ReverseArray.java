import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
 //       int left =0;
        int right=arr.length-1;
        int temp = 0;
        for (int left=0; left<right; left++){
            temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
