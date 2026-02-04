import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CommonPrac {
    public static void main(String[] args){

        // find the frequency of each charecter in this string
        String name = "Welcome";
        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(
                        groupingBy(Function.identity(), counting())
                );
        System.out.println(collect);

//        collect.entrySet().stream()
//                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));



    }
}
