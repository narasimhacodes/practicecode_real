import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class anagramCheck{
    public boolean isAnagaram(String st1, String st2) {
      st1 = st1.replaceAll("\\s", "").toLowerCase();
    st2 = st2.replaceAll("\\s", "").toLowerCase();

        char[] char1 = st1.toCharArray();
        char[] char2 = st2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

       if (Arrays.equals(char1,char2)){
            return true;
       }
        return false;

    }

    public static Boolean isanagram(String str1, String str2){
       str1 = str1.replaceAll("\\s","").toLowerCase();
       str2 = str2.replaceAll("\\s","").toLowerCase();
        char[] ch = str1.toCharArray();
        char[] ch1 = str2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : ch){
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        for (Character c : ch1){
            if (map.containsKey(c)){
                map.put(c, map.get(c) -1);
            }else return false;
        }


        return true;



//         str1 = str1.replaceAll("\\s","").toLowerCase();
//         str2 = str2.replaceAll("\\s", "").toLowerCase();
//        char[] chars1 =str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//        if (chars1.equals(chars2)) {
//        } else return false;
//        return true;
    }
}
public class AnagaramEx {
    public static void main(String[] args){
        String st1 = "Listen";
        String st2 = "silent\t";
        anagramCheck aa = new anagramCheck();
        if (aa.isanagram(st1, st2)){
            System.out.println(" Is valid anagaram");
        }else {
            System.out.println("is not anagaram");

        }




//       anagramCheck aa = new anagramCheck();
//       if (aa.isAnagaram(st1,st2)){
//           System.out.println("This is valid anagaram");
//       }else {
//           System.out.println("This is not valid anagaram");
//       }
    }
}


//using streams

//public class SteamsSample {
//    public static void main(String[] args) {
//        String s1 = "RaceCar";
//        String s2 = "CarRace";
//
//        s1 = Stream.of(s1.split(""))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.joining());
//
//        s2 = Stream.of(s2.split(""))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.joining());
//
//        if (s1.equals(s2)) {
//            System.out.println("Two strings are anagrams");
//        } else {
//            System.out.println("Two strings are not anagrams");
//        }
//    }
//}