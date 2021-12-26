class Solution {
    public String removeDuplicates(String s) {
        return remove(new StringBuilder(s), 0).toString();
    }
    
    private StringBuilder remove(StringBuilder s, int start) {
        if (start < 0) return s;
        for (int i = start; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return remove(s.delete(i, i+2), (i == 0 || i == 1 ? 0 : i - 2));
            }
        }
        return s;
    }
}