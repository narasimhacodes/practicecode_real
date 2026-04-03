import java.io.BufferedReader;
import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;

public class FindPairWithTargetSum {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 7, 11, 15);
        int target = 9;
//        for (int i =0; i<number.size()-1; i++){
//            for (int j=1; j<number.size();j++){
//                if (number.get(i)+number.get(j) == target ){
//                    System.out.println("(" + i + "," + j + ")");
//                }
//
//            }
//        }
            int left = 0;
            int right = number.size()-1;
            while(left < right){
                int sum = number.get(left)+number.get(right);
                if (sum == target){
                    System.out.println("(" + left + "," + right + ")");
                    break;
                }else if (sum < target){
                    left++;
                }else {
                    right--;
                }

            }

    }
}
