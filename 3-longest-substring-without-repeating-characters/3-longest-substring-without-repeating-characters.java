class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        int i = 0;
        int champSize = 0;
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();
        // List<Integer> res = new ArrayList<>();
        while (i < chars.length) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
                size++;
                champSize = Math.max(champSize, size);
                i++;
            }
            else {
                champSize = Math.max(champSize, size);
                // res.add(size);
                int old = map.get(chars[i]);
                int gap = i - old;
                for (int j = i - size; j <= old; j++) {
                    map.remove(chars[j]);
                }
                map.put(chars[i], i);
                size = gap;
                i++;
            }
        }
        return champSize;
    }
}