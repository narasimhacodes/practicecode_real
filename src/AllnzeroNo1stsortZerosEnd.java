import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllnzeroNo1stsortZerosEnd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 4, 0, 6, 1);
        List<Integer> sortedList = new ArrayList<>();
        int zeroCount = 0;
        for (int n : numbers){
            if (n == 0){
                zeroCount++;
            }else {
                sortedList.add(n);
            }
        }
        Collections.sort(sortedList);
        for (int i=0;i<zeroCount; i++){
            sortedList.add(0);
        }
        System.out.println(sortedList);

        // 2 poiters array method
        int left = 0;
        for (int right =0; right< numbers.size(); right++){
            if (numbers.get(right) != 0){
                int temp = numbers.get(left);
                numbers.set(left, numbers.get(right));
                numbers.set(right, temp);
                left++;
            }
        }
        System.out.println(numbers);

        // using streams

        final Stream<Integer> concat = Stream.concat(
                numbers.stream().filter(x -> x != 0).sorted(),
                numbers.stream().filter(y -> y == 0)
        );
        final List<Integer> collect = concat.collect(Collectors.toList());
        System.out.println(collect);


    }
}
