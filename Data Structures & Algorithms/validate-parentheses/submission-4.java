class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                c.push(s.charAt(i));
            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if (c.isEmpty()) {
                    return false;
                }
                if (c.peek() == '[') {
                    if (s.charAt(i) == ']') {
                        c.pop();
                    } else {
                        return false;
                    }
                } else if (c.peek() == '(') {
                    if (s.charAt(i) == ')') {
                        c.pop();
                    } else {
                        return false;
                    }
                } else if (c.peek() == '{') {
                    if (s.charAt(i) == '}') {
                        c.pop();
                    } else {
                        return false;
                    }
                }
            } 
        }
        if (!c.isEmpty()) {
            return false;
        }
        return true;
    }
}
