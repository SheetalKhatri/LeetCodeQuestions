import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
    // create hashmap to put opening brackets
    //loop around given array
    //if its opening bracket then put it in stack
    //elsif for closing bracket the value you pop from stack is not equal to current value or empty return false

    public static boolean validParen(String characs ) {
        HashMap<Character,Character> dict = new HashMap<>();
        dict.put('(', ')');
        dict.put('{', '}');
        dict.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (char c : characs.toCharArray()){
            if(dict.containsKey(c)) stack.push(c);
            else if (dict.containsValue(c)) {
                if(stack.isEmpty() || dict.get(stack.pop()) != c) return false;
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args){
        String characters = "{[()]}";
        System.out.println(validParen(characters));
    }
}
