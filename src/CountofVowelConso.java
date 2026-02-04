import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class CountofVowelsCon{
    public  Boolean isVowel(char ch){

        return "aeiou".indexOf(ch) >= 0;
    }
    public int[] countVowelConso(String str){
        str = str.replaceAll("\\s","").toLowerCase();
        int vowel = 0;
        int consonants =0;
 //       char[] voewls = {'a','e','i','o','u'};
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i)>='a' && str.charAt(i) <='z') {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowel++;
                } else {
                    consonants++;

                }
            }
        }
        return new int[]{vowel, consonants};
    }

}
public class CountofVowelConso {

    public static void main(String[] args){
        String str = "Hello World";
        CountofVowelsCon CV = new CountofVowelsCon();

//        int[] counts = CV.countVowelConso(str);
//        System.out.println("The Vowel count is " + counts[0]);
//        System.out.println("The consontants count is " + counts[1]);


// Using Streams
         str= str.replaceAll("\\s","").toLowerCase();
        Map<String, Long> count = str.chars().filter(ch -> ch >= 'a' && ch <= 'z')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy( ch -> CV.isVowel(ch) ? "Vowels" : "Consonants", Collectors.counting()));
            System.out.println(count.getOrDefault("Vowels", 0L));
        System.out.println(count.getOrDefault("Consonants", 0l));

    }
}
