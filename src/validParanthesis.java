import java.util.Stack;
import java.util.stream.IntStream;

public class validParanthesis {
    public static boolean validPernthsis1(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                if (stack.empty() || stack.pop() != c) {
                    return false;
                }
            }


        }
        return stack.isEmpty();
    }


    // Without stac
//    public static boolean validParanthesis(String s){
//        // "()()(("
//        int count = 0;
//        for (char c : s.toCharArray()){
//            if (c=='('){
//                count ++;
//            }else if(c==')') {
//                count--;
//                if (count < 0) return false;
//            }
//
//        }
//        return count == 0;

    public static void main(String[] args) {
        String s = "([}]{})";
        System.out.println(validPernthsis1(s) ? "This is valid parenthesis : Original String is " + s : "This is not valid parenthesis" + s );
    }
}

