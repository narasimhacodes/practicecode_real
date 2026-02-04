import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckSortArray {
    public boolean checksort(int[] nums){
        //[12,56,43,56,23,42]
        for (int i=1; i<nums.length;i++){
            if (nums[i] > nums[i-1]){
                return false;
            }
        }
        return true;

    }

//    public boolean checkSortdArray(int[] nums){
//        Boolean result = IntStream.range(1, nums.length)
//                .allMatch(i -> nums[i] > nums[i-1]);
//        return result;
//    }
    public static void main(String[] args){
        int[] nums = {1,2,3,5,7};
        CheckSortArray cs = new CheckSortArray();
//        System.out.println(cs.checkSortdArray(nums));
        System.out.println(cs.checksort(nums));
//        Integer[] nums1 = new Integer[]{1,2,4,5};
//        Stream<Integer> str = Stream.of(nums1);
    }
}
