class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        int needleSize = needle.length();
        int haystackSize = haystack.length();
        for (int i = 0; i < haystackSize; i ++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if ((i + needleSize <= haystackSize)&&(haystack.substring(i, i + needleSize).equals(needle))) {
                    return i;
                }
            }
        }
        return -1;
    }
}