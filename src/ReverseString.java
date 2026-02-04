public class ReverseString {
    public static void main(String[] args){
        String str = "Narasimha";
        char[] chr = str.toCharArray();
 //       char[] chr = {'j','a','v','a'};
        int left = 0;
        int right = chr.length-1;

            while (left < right){
               char temp = chr[left];
                chr[left] = chr[right];
               chr[right] = temp;
               left++;
               right--;

            }
        System.out.println(chr);
    }
}
