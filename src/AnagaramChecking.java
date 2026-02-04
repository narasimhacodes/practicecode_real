import java.util.HashMap;
import java.util.Map;

//class anagarmCheck{
//    public Boolean isanagaram(String s1, String s2){
//        s1 = s1.replaceAll("\\s", "").toLowerCase();
//        s2 = s2.replaceAll("\\s","").toLowerCase();
//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//        if (s1.length() != s2.length()){
//            return false;
//        }
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (Character ch : ch1){
//            map.put(ch, map.getOrDefault(ch, 0)+1);
//        }
//        for (Character ch :ch2){
//            if (map.containsKey(ch)){
//                map.put(ch, map.get(ch)-1);
//            }else {
//                return false;
//            }
//            if (map.get(ch)<0){
//                return false;
//            }
//        }
//        return true;
//    }
//}
class anagarmCheck {
    public Boolean isanagaram(String str1, String str2){
        Map<Character, Integer> map = new HashMap<>();
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2= str2.replaceAll("\\s","").toLowerCase();
        char[] chr1=str1.toCharArray();
        char[] chr2 = str2.toCharArray();
        for (char c: chr1){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char cc: chr2){
            if (map.containsKey(cc)){
                map.put(cc, map.get(cc)-1);
            }else {
                return false;
            }
            if (map.get(cc)<0){
                return false;
            }
        }
        return true;
    }
}
public class AnagaramChecking {
    public static void main(String[] args){
        String s1= "Listen";
        String s2 = "sslient";
        anagarmCheck ac = new anagarmCheck();
        if(ac.isanagaram(s1,s2)){
            System.out.println("This is valid anagaram");
        }else{
            System.out.println("This is not valid anagaram");
        }
    }
}
