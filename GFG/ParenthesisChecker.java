package GFG;
import java.util.*;
public class ParenthesisChecker {
    static boolean isPar(String x){
        /*
         * Input: s = "{([])}"
         *
         */
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < x.length(); i++){
            char ch = x.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }
            else{
                char peek = stack.peek();
                if(ch == ')' &&  peek != '(')
                return false;

                else if(ch == '}' && peek != '{')
                return false;

                else if(ch == ']' && peek != '[')
                return false;

                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isPar("{{[()]}}"));
        System.out.println(isPar("{"));
    }
}
