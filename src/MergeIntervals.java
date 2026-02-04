import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{8,10},{2,6},{15,18}};
        // Sort by start time  --- sorting 1st element in array
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
//        for(int[] arr: intervals){
//            System.out.println(Arrays.toString(arr));
//        }
        // {1,3},{2,6},{8,10},{15,18}
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        // Overlapping intervals
        // intervals[i][0] means -- {2,6} of 0 is 2
        //current[1] means -- {1,3} of 1 is 3
        // 2<3 us true  then update the current[1] --- [1,6]
        for (int i=1; i<intervals.length; i++){
            if (intervals[i][0] <= current[1]){
                current[1] = Math.max(current[1],intervals[i][1]);

                // Non-overlapping
            }else {
                result.add(current);
                current = intervals[i];
            }
        }
        // for loop will break then add last element
        result.add(current);
        for (int[] in : result){
            System.out.println(Arrays.toString(in));
        }
    }
}
