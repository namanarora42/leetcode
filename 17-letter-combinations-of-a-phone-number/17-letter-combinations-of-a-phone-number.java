class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<Character>> letters = new HashMap<>();
        List<StringBuilder> output = new ArrayList<>();
        List<StringBuilder> temp = new ArrayList<>();
        if (digits.length() == 0) return new ArrayList<String>();
        letters.put('2', Arrays.asList(new Character[]{'a', 'b', 'c'}));
        letters.put('3', Arrays.asList(new Character[]{'d', 'e', 'f'}));
        letters.put('4', Arrays.asList(new Character[]{'g', 'h', 'i'}));
        letters.put('5', Arrays.asList(new Character[]{'j', 'k', 'l'}));
        letters.put('6', Arrays.asList(new Character[]{'m', 'n', 'o'}));
        letters.put('7', Arrays.asList(new Character[]{'p', 'q', 'r', 's'}));
        letters.put('8', Arrays.asList(new Character[]{'t', 'u', 'v'}));
        letters.put('9', Arrays.asList(new Character[]{'w', 'x', 'y', 'z'}));
        // letters.put('2', Arrays.asList("abc".toCharArray()));
        // letters.put('3', Arrays.asList("def".toCharArray()));
        // letters.put('4', Arrays.asList("ghi".toCharArray()));
        // letters.put('5', Arrays.asList("jkl".toCharArray()));
        // letters.put('6', Arrays.asList("mno".toCharArray()));
        // letters.put('7', Arrays.asList("pqrs".toCharArray()));
        // letters.put('8', Arrays.asList("tuv".toCharArray()));
        // letters.put('9', Arrays.asList("wxyz".toCharArray()));
        for (char digit : digits.toCharArray()) {
            if (output.isEmpty()){
                for (char c : letters.get(digit)) {
                    output.add(new StringBuilder(String.valueOf(c)));
                }
            }
            else {
                temp.clear();
                for (StringBuilder sb : output) {
                    for (char c : letters.get(digit)) {
                        StringBuilder tempS = new StringBuilder(sb);
                        temp.add(tempS.append(String.valueOf(c)));
                    }
                }
                output.clear();
                output.addAll(temp);
            }
        }
        List<String> res = new ArrayList<>();
        for (StringBuilder sb : output) {
            res.add(sb.toString());
        }
        return res;
    }
}