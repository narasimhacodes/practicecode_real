import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
    public class reference{
        public static void display(String s){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        List<String> names = Arrays.asList("snr", "machine", "java");
//        Consumer<String> cc = new Consumer<String>() {
//            @Override
//            public void accept(String x) {
//                reference.display(x);
//            }
//        };
        names.stream()
                .forEach(reference::display);

//        Optional<String> city = Optional.of("SNR");
//        city.ifPresent(c -> System.out.println(c));
//        Predicate<String> p = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if (s.contains("x"))
//                {
//                    return true;
//                }
//                else
//                {
//                    return false;
//                }
//            }
//        };
//        String result = names.stream()
//                .filter(p)
//                .findFirst()
//                .orElse("Not found");
//        System.out.println(result);
        Map<String, Integer> values = new HashMap<>();
        values.put("snr", 77);

    }
}
