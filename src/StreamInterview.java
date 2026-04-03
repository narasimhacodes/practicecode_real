import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamInterview {
    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(2,4,5,3,6,7,8,2,3);

        List<Integer> collect = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(i -> i.getKey())
                .collect(Collectors.toList());
        System.out.println(collect);
// second highest number

        Integer notFound = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow(() -> new RuntimeException("not found"));
        System.out.println(notFound);
    }
}
