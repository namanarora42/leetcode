class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (char c: t.toCharArray()) {
            if (map.containsKey(c) && map.get(c) != 0) {
                map.put(c, map.get(c)-1);
            }
            else {
                return false;
            }
        }
        if (map.values().stream().mapToInt(Integer::intValue).sum() == 0) {
            return true;
        }
        return false;
    }
}