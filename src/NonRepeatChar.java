import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatChar {
    public static void main(String[] args){
        String str = "itswiss";
        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e->e.getValue() ==1).map(Map.Entry::getKey).findFirst();

        final List<Character> collect = str.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        final LinkedHashMap<Character, Long> collect1 = collect.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        final Character c =
                collect1.entrySet().stream().filter(entry -> entry.getValue() == 1).map(x -> x.getKey()).findFirst().get();
        System.out.println(c);

        Optional<Character> result = Optional.ofNullable(collect1.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null));
        if (result != null) {
            System.out.println(result);
        }else {
            System.out.println("There is no unique charecters in given string");
        }

    }
}
