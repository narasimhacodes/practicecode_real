import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args){
        int[] nums ={1,3,5,6,3,5,7,9,5,24,7,4,2,9,0};
// usinh hashmap

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (int key: map.keySet()){
            if (map.get(key) > 1){
                System.out.println("The Duplicated values :" + key);
            }
        }
        // find the duplicates in this given arrayz
        List<Integer> duplicates = Arrays.stream(nums)  // Convert int[] to Stream<Integer>
                .boxed()// Convert int to Integer for streams
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Count frequency of each number

                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1) // Keep only duplicates
                .map(entry -> entry.getKey()) // Extract the number (key)
                .collect(Collectors.toList());
               System.out.println(duplicates);


        List<String> names = new ArrayList<>(Arrays.asList("snr", "java","code","bank","java","snr"));
        final Stream<String> stream = names.stream();
        final Map<String, Long> collect = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((name, count) -> System.out.println("The name is " + name + "  count is "+count));


 //Occrence of number in array
        Map<Integer, Long> duplicates1 = Arrays.stream(nums)  // Convert int[] to Stream<Integer>
                .boxed()// Convert int to Integer for streams
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));// Count frequency of each number
                        duplicates1.forEach((listnum, count) -> System.out.println("Occurence of number " + listnum + " count is "+ count));

    }
}
