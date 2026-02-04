import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class removeDuplicatesInStr{
    public String removeDuplicatesString(String str){
//        char[] str1 = str.toCharArray();
//        Set<Character> original = new LinkedHashSet<>();
//        for (int i =0; i<str1.length; i++){
//            original.add(str1[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        for(char c : original){
//            sb.append(c);
//        }
//        String OriginalStr = sb.toString();

        char[] str2 = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str2){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character s: set){
            sb.append(s);
        }
        String OriginalStr = sb.toString();
        return OriginalStr;
    }
}
public class RemoveDuplicateInString {
    public static void main(String[] args){
        String str = "Programming121";
        removeDuplicatesInStr RDstr = new removeDuplicatesInStr();
        System.out.println("The Original renove duplicate string is " + RDstr.removeDuplicatesString(str));


        final LinkedHashSet<Character> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect);
        collect.stream().map(x->String.valueOf(x)).collect(Collectors.joining());

//  Using Streams
//        final LinkedHashSet<Character> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toCollection(LinkedHashSet::new));
//        String original = collect.stream().map(String::valueOf).collect(Collectors.joining());
//        System.out.println(original );
    }
}
