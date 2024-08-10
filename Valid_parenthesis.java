import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> q = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                q.push(x);
            } else {
                if (q.isEmpty()) {
                    return false;
                } else if (!matching(q.peek(), x)) {
                    return false;
                } else {
                    q.pop();
                }
            }
        }
        
        return q.isEmpty();
    }
    
    private boolean matching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
