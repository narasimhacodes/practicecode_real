import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramsGroups {
    public static void main(String[] args) {
        String[] str = {"cat", "tea", "tan", "ate", "tac"};

        Map<String, List<String>> map = new HashMap<>();

        for (String s : str){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if (!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }
        for (List<String> ss: map.values()){
            System.out.println(ss);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);


// ----------------------using strems------------------------------------------------------
        Map<String, List<String>> collect1 = Arrays.stream(str).collect(Collectors.groupingBy(
                ch -> {
                    char[] chh = ch.toCharArray();
                    Arrays.sort(chh);
                    return new String(chh);

                },
                Collectors.toList()
        ));
        System.out.println("This is Collect1 : " + collect1);
        //print line by line
        collect1.entrySet().stream().forEach(ss-> System.out.println(ss.getValue()));

// ----------------------------------------------------------------------------------------------------------

        // using streams find occurence of group of anagrams
        // String[] str = {"cat", "tea", "tan", "ate", "tac"};
        Map<String, Integer> map1 = new HashMap<>();
        for (String s : str){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if (map1.containsKey(sortedStr)){
                map1.put(sortedStr,map1.get(sortedStr)+1);
            }else {
                map1.put(sortedStr, 1);
            }
      //      map.get(sortedStr)+1;
        }
        for (Map.Entry<String,Integer> entry : map1.entrySet() ){
            System.out.println("The Occrence of  group of string : " + entry.getKey()+" -> "+entry.getValue());
        }
    // ------------------------------using strems----------------------------------

        Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(
                ch -> {
                    char[] chh = ch.toCharArray();
                    Arrays.sort(chh);
                    return new String(chh);

                },
                Collectors.counting()
        ));
        System.out.println(collect);
        //print one by one
        collect.entrySet().stream().forEach(s-> System.out.println(s.getKey()+" -> "+s.getValue()));
    }
}
