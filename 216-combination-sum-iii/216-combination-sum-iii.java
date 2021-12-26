class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        LinkedList<Integer> comb = new LinkedList<Integer>();
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        this.backtrack(n, k, comb, 0, results);
        return results;
    }
    public void backtrack(int remain, int k, LinkedList<Integer> comb,
                         int next_start, List<List<Integer>> results) {
        if (remain == 0 && comb.size() == k) {
            results.add(new ArrayList<Integer>(comb)); //deep copy
            return;
        }
        else if (remain < 0 || comb.size() == k) {
            return;
        }
        
        for (int i = next_start; i < 9; ++i) {  
            comb.add(i+1);
            this.backtrack(remain - i - 1, k, comb, i + 1, results);
            comb.removeLast();
        }
    }
}