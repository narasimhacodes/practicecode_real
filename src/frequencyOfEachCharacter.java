import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class frequencyOfEachCharacter {
    public static void main(String[] args){
        String str = "Hello Java";
        //find frequency of each char
       char[] str1 = str.toCharArray();
        IntStream.range(1, str1.length).mapToObj(ch-> (char)ch);
        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().forEach(entry-> System.out.println(entry.getKey() +":"+ entry.getValue()));


        //        Map<Character, Integer> map = new HashMap<>();
//        for (char ch : str1){
//            map.put(ch, map.getOrDefault(ch, 0) +1);
//        }
//        for (Map.Entry<Character, Integer> map1 : map.entrySet()){
//            System.out.println(map1.getKey() +" : "+map1.getValue());
//        }
 //Using Streams
//     Map<Character, Long> frequencyMap = str.chars()
//                .mapToObj(ch -> (char)ch)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(frequencyMap);
//        frequencyMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
//     frequencyMap.forEach((ch, Long) -> System.out.println(ch +" : "+ Long));


//        System.out.println(map1);
//        Map<Character, Integer> map = str.chars().mapToObj(ch -> (char)ch)
    }
}
