import java.util.Stack;

public class StackisBalanced {
    static String s = "(2+[{4}]";

    public static void main(String[] args) {
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ']' && top != '[') ||
                    (c == '}' && top != '{') ||
                    (c == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

