class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, LinkedList<String>> map = new HashMap<>();
        String sorted;
        LinkedList<String> temp = null;
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            sorted = new String(chars);
            if (map.containsKey(sorted)){
                temp = map.get(sorted);
                temp.add(str);
            }
            else {
                temp = new LinkedList<String>();
                temp.add(str);
                map.put(sorted, temp);
            }
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}