import com.sun.source.tree.IfTree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,3,5,3,2,5,7,34,23,9);

        final Integer i6 = numbers.stream().reduce((a, b) -> a + b / numbers.size()).get();
        System.out.println("This average is:" +i6);

        //------------------------------------------------------------------------
        // Get max and min value
        int[] arr = {-1,3,5,6,4,8};
        final int i = Arrays.stream(arr).min().orElseThrow();

        final Integer i1 = Arrays.asList(3, 5, 7, 9, 6, 4).stream().max(Integer::compareTo).get();

        final Integer i2 = Arrays.asList(3, 5, 7, 2, 68, 8, 2).stream().min(Integer::compareTo).get();
        System.out.println("This is max of value:" +i1);
        System.out.println("---------------------------------------------------------");
   // Sorting natural order
        final List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
        final List<Integer> collect1 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
        System.out.println("---------------------------------------------------------");
   //limit the given the list
        final List<Integer> collect2 = numbers.stream().limit(3).sorted().collect(Collectors.toList());
        System.out.println(collect2);
        numbers.stream().limit(4).sorted(Comparator.reverseOrder()).skip(1).forEach(x -> System.out.println(x));
        System.out.println("---------------------------------------------------------");
 //  count the no of elements in list

        final long count = numbers.stream().count();
        System.out.println(count);
        System.out.println("---------------------------------------------------------");
 // Sum of all the elements
        final Integer reduce = numbers.stream().reduce(0,(a, b) -> a + b);
        final int sum = numbers.stream().mapToInt(Integer::valueOf).sum();
        final Integer i3 = numbers.stream().reduce((a, b) -> Integer.max(a, b)).get();
        System.out.println(reduce);
        System.out.println(sum);
        System.out.println("---------------------------------------------------------");
// avaerage of all the elements
        final double asDouble = numbers.stream().mapToDouble(avg -> avg.doubleValue()).average().getAsDouble();
        final Double i4 = numbers.stream().reduce(0, Integer::sum) / (double)numbers.size();
        System.out.println(i4);
        System.out.println(asDouble);
        System.out.println("---------------------------------------------------------");
// get all even elements
        final List<Integer> collect3 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect3);
        final List<Integer> collect4 = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
        System.out.println("Odd number: "+collect4);
        System.out.println("---------------------------------------------------------");
 // get elements start with 2
        final List<String> collect5 = numbers.stream().map(String::valueOf).filter(s -> s.startsWith("2")).collect(Collectors.toList());
        final List<String> collect17 = numbers.stream().map(g -> String.valueOf(g)).filter(ll -> ll.startsWith("2")).collect(Collectors.toList());
        System.out.println("Start with 2 :" + collect17);
        System.out.println(collect5);
        System.out.println("---------------------------------------------------------");
 // find duplicate in list
        Set<Integer> s = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer num : numbers){
            if (!s.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
        Set<Integer> s1 = new HashSet<>();
        final Set<Integer> collect6 = numbers.stream().filter(x -> !s1.add(x)).collect(Collectors.toSet());
        System.out.println(collect6);
        System.out.println("---------------------------------------------------------");
//get sum of first 5 elements
        final Integer reduce1 = numbers.stream().limit(5).reduce( (a, b) -> a + b).get();
        final int sum1 = numbers.stream().limit(5).mapToInt(n -> n).sum();
        System.out.println(sum1);
        System.out.println("---------------------------------------------------------");
//get sum by skipping first 5 elements
        final Integer i5 = numbers.stream().skip(5).limit(2).reduce((a, b) -> a + b).get();
        System.out.println(i5);
//get cubes
        final List<Integer> collect7 = numbers.stream().map(cube -> cube * cube * cube).collect(Collectors.toList());
        System.out.println(collect7);
        System.out.println("---------------------------------------------------------");

// get unique characters from a string
        String sd = "Java";
        char[] chr = sd.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character c : chr){
            set.add(c);
        }
        System.out.println(set);

        final Set<Character> collect9 = sd.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println("Uninque char :" + collect9);

        final Map<String, Long> collect8 = Arrays.stream(sd.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect8.entrySet().stream().filter(e -> e.getValue() == 1).map(entry -> entry.getKey()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");

// get duplicate from the list;
        numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue()>1).forEach(System.out::println);
        final List<Integer> collect10 = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(y -> y.getKey()).collect(Collectors.toList());
        System.out.println(collect10);

        System.out.println("---------------------------------------------------------");
// get unique elements
        List<Integer> unique = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
        System.out.println(unique);
        System.out.println("---------------------------------------------------------");

//first non reapeated char from a string
        String ss = "iiswiiss";
        final List<String> collect11 = Arrays.stream(ss.split("")).collect(Collectors.toList());
        System.out.println(collect11);
        final String s2 = Arrays.stream(ss.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1).findFirst().map(y -> y.getKey()).get();
        System.out.println("first non reapeated char: "+s2);
        System.out.println("---------------------------------------------------------");

// first repeated char
        final List<Map.Entry<String, Long>> collect12 = Arrays.stream(ss.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect12);
        final String s3 = Arrays.stream(ss.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(y -> y.getKey()).findFirst().get();
        System.out.println(s3);
        System.out.println("---------------------------------------------------------");
// flatmap
        List<String> values = List.of("This   is Java", "Advanced course");
        System.out.println(values);
        final List<String> list = values.stream().flatMap(x -> Arrays.stream(x.split("\\s+"))).toList();
        final List<Stream<String>> list3 = values.stream().map(x -> Arrays.stream(x.split("\\s+"))).toList();
        System.out.println(list3);
        System.out.println("using faltmap: "+ list);
//
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL",
                "C");
        final List<String> collect13 = listOfStrings.stream().sorted(Comparator.comparing(s11 ->s11.length())).collect(Collectors.toList());
        System.out.println(collect13);
//
        List<Integer> numbers2 = Arrays.asList(1,7,2, 4, 6, 8, 10);
        final List<Integer> collect14 = numbers2.stream().filter(i0 -> i0 % 2 == 0).collect(Collectors.toList());
        final boolean b = numbers2.stream().allMatch(i11 -> i11 % 2 == 0);
        System.out.println("result : " + b);
        System.out.println(collect14);

        List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");
        final boolean b1 = nameList.stream().anyMatch(k -> k.contains("A"));
        System.out.println(b1);
//   Sum of all digits in a number
        int l = 15623;
        final Integer collect15 = Arrays.stream(String.valueOf(l).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(collect15);
//   Common elements between two arrays
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(l1elem -> list2.contains(l1elem)).forEach(System.out::println);

        String str = "Java Concept Of The Day";
        final String collect16 = Arrays.stream(str.split(" ")).map(p -> new StringBuilder(p).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect16);

        String str11 = "Java   backend development is interesting";
        final List<String> collect18 = Arrays.stream(str11.split("\\s+")).collect(Collectors.toList());
        System.out.println(collect18);
        final String collect19 = collect18.stream().collect(Collectors.maxBy(Comparator.comparing(sm -> sm.length()))).get();
        System.out.println(collect19);


    }
}
