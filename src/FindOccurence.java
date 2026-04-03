import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurence {
    public static void main(String[] args){
        String[] arr = {"a","r","a","e","b","a","b"};
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr){
         //   map.put(s, map.getOrDefault(s,0)+1);
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue()>1){
                System.out.println("Duplicated" + entry.getKey());
            }
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }


        String str = "aabcccccddd";
        Map<Character, Long> collect = str.chars().mapToObj((c -> (char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        StringBuilder sb = new StringBuilder();
    //    collect.forEach((k1, v1)-> System.out.print(k1+""+v1));
        collect.forEach((k, v) -> sb.append(k.toString()+v.toString()));
        System.out.println(sb);







//        for (String res : arr ){
// //           map.put(res, map.getOrDefault(res, 0) +1);
//            if (map.containsKey(res)){
//                map.put(res, map.get(res)+1);
//
//            }else
//            map.put(res, 1);
//        }
//        for (Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+entry.getValue());
//        }
       Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" : " + entry.getValue()));
    }
}
