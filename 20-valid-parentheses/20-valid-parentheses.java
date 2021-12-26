class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        char lastChar = 'a';
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack1.push(c);
                lastChar = c;
            }
            else {
                try
                {
                    char popped = stack1.pop();
                    switch (popped) {
                        case '(' : if (c != ')') {
                            return false;
                        }
                            break;
                        case '[' : if (c != ']') {
                            return false;
                        }
                            break;
                        case '{' : if (c != '}') {
                            return false;
                        }
                            break;
                    }
                }
                catch (Exception e) {
                        return false;
                }
            }
        }
        if (stack1.isEmpty()) {
            return true;
        }
        return false;
    }
}