import java.util.Arrays;
import java.util.Stack;

public class Validparenthsis {

    public static void main(String[] args) {
        String str = "({[]})";
        valid vv = new valid();
        if (vv.validp(str)){
            System.out.println("Valid");
        }else {
            System.out.println("Not valid");
        }
    }
}

    class valid {
        public boolean validp(String str) {
            Stack<Character> st = new Stack<>();

            for (
                    char i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.charAt(i) == '(') {
                    st.push(')');
                } else if (str.charAt(i) == '{') {
                    st.push('}');
                } else if (str.charAt(i) == '[') {
                    st.push(']');
                } else {

                    if (st.isEmpty() || st.pop() != ch) {
                        return false;
                    }
                }
            }
            return true;
        }
    }


