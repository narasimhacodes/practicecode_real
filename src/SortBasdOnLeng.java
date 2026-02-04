import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortBasdOnLeng {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL",
                "C");
        final List<String> collect = listOfStrings.stream().sorted(Comparator.comparing(s -> s.length())).collect(Collectors.toList());
        System.out.println(collect);
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        final List<Double> collect1 = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);
        List<Integer> numbers = Arrays.asList(1, 2, 4, 41, 4);
        numbers.stream().max(Comparator.naturalOrder());
        List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");
        final Optional<String> max = nameList.stream().max(Comparator.comparing(c -> c.length()));
        System.out.println(max);
        max.ifPresent(u-> System.out.println(u));
        final boolean b = nameList.stream().anyMatch(x -> x.startsWith("h"));
        System.out.println(b);

        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(5);
        number.add(6);
        number.add(9);
        System.out.println(number);
        final List<Integer> list = number.stream().sorted().toList();
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(10,15,8,49,25,98,32);
        final List<Integer> list2 = list1.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list2);
        final List<Integer> list3 = list1.stream().map(h -> h * h * h).filter(g -> g > 50).toList();
        System.out.println(list3);

        int[] a = new int[] { 4, 2, 7, 1 };
        int[] b1 = new int[] { 8, 3, 9, 5 };
        final int[] array = Stream.concat(
                Arrays.stream(a).boxed(), Arrays.stream(b1).boxed()).sorted().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));

        int i = 12343;



    }
}
