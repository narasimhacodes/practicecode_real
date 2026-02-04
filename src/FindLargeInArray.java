import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class findLarge{
    public int largestElement(int[] nums) {
        int largestElement = nums[0];

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > largestElement){
                largestElement = nums[i];
            }
        }
        return largestElement;

    }
    public int secondLargest(int[] nums){
        int secondLargest = -1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]>secondLargest && secondLargest < largestElement(nums)){

            }
        }
        return secondLargest;
    }
}
public class FindLargeInArray {
    public static void main(String[] args){
        int[] nums = {12,31,31,314,64,87,87,75};
        findLarge fl = new findLarge();
        System.out.println(fl.largestElement(nums));
        final Integer collect = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(collect);
    }

}
