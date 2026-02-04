import java.util.*;

// Using streams
public class KthLargest {
    public static int findLargestByStream(int[] num, int k){
        return Arrays.stream(num)
                .boxed()
                .sorted((x,y) -> y-x)
                .skip(k - 1)
                .findFirst()
                .orElseThrow(()-> new NoSuchElementException("Not availble"));
    }

    public static void main(String[] args){
        int[] num = {12,4,5,7,9,2};
        int kth = 4;

        final Integer i1 = Arrays.stream(num).boxed().sorted((x, y) -> y - x).skip(kth - 1).findFirst().get();
        System.out.println(i1);
        // [2,4,5,7,9,12]


            for (int i=0; i<num.length-1 ;i++){
                for (int j = i+1; j<num.length; j++){
                    if (num[i] < num[j]){
                        int temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            int[] sorted=num;

            int largest =  num[num.length - kth];
        System.out.println(Arrays.toString(num));
        System.out.println(largest);
        System.out.println(findLargestByStream(num,kth));


    }
}
