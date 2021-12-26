class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '[') {
                stack.push(String.valueOf(c));
            }
            else if (c == ']') {
                String toRepeat = "";
                while (stack.peek().charAt(0) != '[') {
                    toRepeat = stack.pop() + toRepeat;
                }
                stack.pop();
                String countString = "";
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    countString = stack.pop() + countString;
                }
                int count = Integer.parseInt(countString);
                for (int i = 0; i < count; i++) {
                    stack.push(toRepeat);
                }
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }
}