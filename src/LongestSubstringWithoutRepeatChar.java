import java.util.HashSet;
import java.util.Set;

class LongstSubstringWithoutRepeatChar{
    public int LongestSubstringWithoutRepeatChar(String str){
        int left = 0;
        int right = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
            for (right=0;right<str.length(); right++){
                while(set.contains(str.charAt(right))){
                    set.remove(str.charAt(left));
                    left++;
                }

                set.add(str.charAt(right));
                maxLen = Math.max(maxLen, right - left +1);
            }
        return maxLen;


    }
}
public class LongestSubstringWithoutRepeatChar {
    public static void main(String[] args){
        String str = "pwwkew";
        int left = 0;
        int maxLen =0;
        int right = 0;
        Set<Character> result = new HashSet<>();
        for (right = 0; right<str.length();right++){
            while (result.contains(str.charAt(right))){
                result.remove(str.charAt(left));
                left++;
            }

            result.add(str.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);

        }
        System.out.println(maxLen);



        LongstSubstringWithoutRepeatChar LSWR = new LongstSubstringWithoutRepeatChar();
        System.out.println(LSWR.LongestSubstringWithoutRepeatChar(str));
    }
}
