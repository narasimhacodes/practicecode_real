import java.util.*;

public class UniquePairs {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(27, 35, 92, 73, 8, 73, 50, 60);
        Iterator it = number.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
 //       List<Integer> number = Arrays.asList(27,73,27,73);
        int target = 100;
        Set<Integer> seen = new HashSet<>();
        Set<String> uniquePair = new HashSet<>();
        for (Integer num : number){
            int complementary = target - num;
            if (seen.contains(complementary)){
                int firstValue = Math.min(num, complementary);
                int lastValue = Math.max(num, complementary);
                uniquePair.add("{"+firstValue+ ","+lastValue+"}");
            }
            seen.add(num);
        }

        System.out.println(uniquePair);
        for (String pairs : uniquePair){
            System.out.println(pairs);
        }
    }
}














// reference


//import java.util.*;
//
//public class SubsetSum100 {
//    public static void main(String[] args) {
//        // Input list
//        List<Integer> numbers = Arrays.asList(27, 35, 92, 73, 8, 73, 50, 60);
//
//        // HashSet to store numbers we've seen
//        HashSet<Integer> seen = new HashSet<>();
//        // HashSet to store unique pairs as strings
//        HashSet<String> pairs = new HashSet<>();
//
//        for (int num : numbers) {
//            int complement = 100 - num;
//
//            // Check if complement exists in seen set
//            if (seen.contains(complement)) {
//                // To avoid duplicate pairs like (27,73) and (73,27), store min first
//                int a = Math.min(num, complement);
//                int b = Math.max(num, complement);
//                pairs.add("(" + a + ", " + b + ")");
//            }
//
//            // Add current number to seen set
//            seen.add(num);
//        }
//
//        // Print unique pairs
//        System.out.println("Unique pairs with sum 100:");
//        for (String pair : pairs) {
//            System.out.println(pair);
//        }
//    }
//}

