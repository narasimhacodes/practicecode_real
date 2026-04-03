class checkSort {
    public Boolean checkSortt(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        checkSort cs = new checkSort();
        System.out.println(cs.checkSortt(arr));

    }
}
