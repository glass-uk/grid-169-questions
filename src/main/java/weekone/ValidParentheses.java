package weekone;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> letters = new Stack<>();

        for (char letter : s.toCharArray()) {
            if (map.containsKey(letter)) {
                if (letters.isEmpty() || letters.pop() != map.get(letter)) {
                    return false;
                }
            } else {
                letters.push(letter);
            }
        }
        return letters.isEmpty();
    }
}
