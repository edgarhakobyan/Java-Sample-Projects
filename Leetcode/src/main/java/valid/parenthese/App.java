package valid.parenthese;

import java.util.List;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        System.out.println(isValid("{[])"));
    }

    private static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i< s.length(); ++i) {
            char currentSymbol = s.charAt(i);
            if (currentSymbol == '(' || currentSymbol == '{' || currentSymbol == '[') {
                charStack.push(currentSymbol);
            } else {
                if (charStack.size() == 0) {
                    return false;
                }
                char pop = charStack.pop();
                System.out.println("pop = " + pop);
                if ((currentSymbol == ']' && pop != '[') ||
                        (currentSymbol == '}' && pop != '{') ||
                        (currentSymbol == ')' && pop != '(')) {
                    return false;
                }
            }
        }
        return charStack.size() == 0;
    }
}
