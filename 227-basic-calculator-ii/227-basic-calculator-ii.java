class Solution {
    public int calculate(String s) {
        s = s.replaceAll("\\s+","");
        Stack<String> stack = new Stack<>(); 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                String num = getNumAt(i, s);
                stack.push(num);
                if (num.length() > 1) i = i + num.length() - 1;
            }
            else {
                String num;
                switch (c) {
                    case '+' : {}
                    case '-' : {
                        stack.push(String.valueOf(c));
                        num = getNumAt(i+1, s);
                        stack.push(num);
                        i = i + num.length();
                        break;
                    }
                    case '*' : {
                        int num1 = Integer.parseInt(stack.pop());
                        num = getNumAt(i+1, s);
                        int num2 = Integer.parseInt(num);
                        i = i + num.length();
                        stack.push(Integer.toString(num1*num2));
                        break;
                    }
                    case '/' : {
                        int num1 = Integer.parseInt(stack.pop());
                        num = getNumAt(i+1, s);
                        int num2 = Integer.parseInt(num);
                        i = i + num.length();
                        stack.push(Integer.toString(num1/num2));
                        break;
                    }
                }
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            int first = Integer.parseInt(stack.pop());
            if (!stack.isEmpty() && stack.peek().charAt(0) == '-') {
                res = res - first;
                if (!stack.isEmpty()) stack.pop();
            }
            else {
                res = res + first;
                if (!stack.isEmpty()) stack.pop();
            }
        }
        return res;
    }
    
    private String getNumAt(int i, String s) {
        int j = i;
        StringBuilder num = new StringBuilder(String.valueOf(s.charAt(j)));
        while (j+1 < s.length() && Character.isDigit(s.charAt(j+1))) {
            j++;
            num.append(String.valueOf(s.charAt(j)));
        }
        return num.toString();
    }
}