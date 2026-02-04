import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Removeduplicate {
    public static void main(String[] args){

//        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("c");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            list.add("D");
//            System.out.println(list);
//        }

// find duplicates in a List using a Set
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplictaes = new HashSet<>();
       List<Integer> arr = Arrays.asList(18,37,83,74,18,37,64,99);
       for (int num : arr){
           if (! seen.add(num)){
               duplictaes.add(num);
           }

       }
        System.out.println(duplictaes);


//        // without distinct
//        List<Integer> list = arr.stream().filter(seen::add).collect(Collectors.toList());
//        System.out.println("Unique values" + list);

//        List<Integer> result = arr.stream()
//                .sorted()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(result.size()+", "+ result);
    }
}
