import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,3,5};
        int[] arr2 = {2,4,6,9,11};
        int[] result = new int[arr1.length + arr2.length];
        int m =0;
        int n =0;
        int k=0;
        //  check the both length of 2 arrays and  1st element of 1st array and 1st element of 2nd array
        while (m<arr1.length && n<arr2.length){
            if (arr1[m]<arr2[n]){
                result[k] = arr1[m];
                // increase the 1st array m and result k
                m++;
                k++;
            }else {
                result[k]=arr2[n];
                // // increase the 2nd array n and result k
                n++;
                k++;
            }
        }
        // Print the result array for remaining digits -- if mail while is failed for Arr1
        while (m<arr1.length){
            result[k] = arr1[m];
            m++;
            k++;
        }

        // Print the result array for remaining digits -- if mail while is failed for Arr1
        while (n<arr2.length){
            result[k]=arr2[n];
            k++;
            n++;
        }
        // print the final result array
        System.out.println(Arrays.toString(result));


        // Using streams
        final Object[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted().boxed().toArray();
        System.out.println(Arrays.toString(array));
    }


}
