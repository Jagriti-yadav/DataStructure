import java.util.*;

public class valid_paranthesis {

  
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                // Stack empty -> invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        // Stack should be empty
        return stack.isEmpty();
    }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Boolean result = isValid(s);
    System.out.println(result);
    sc.close();

  }
}
