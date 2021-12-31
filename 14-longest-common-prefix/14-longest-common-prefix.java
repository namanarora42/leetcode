class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        try {
            for (int i = 0; i < 200; i++) {
                char test = strs[0].charAt(i);
                for (String each : strs) {
                    if (each.charAt(i) != test) {
                        return res.toString();
                    }
                }
                res.append(test);
            }
        }
        catch (Exception ignored) {
            
        }
        return res.toString();
    }
}