class Solution {
    List<List<Integer>> arrays;
    public int maxDistance(List<List<Integer>> arrays) {
        this.arrays = arrays;
        int minChamp, maxChamp;
        minChamp = 0;
        maxChamp = 0;
        int distance = 0;
        
        for (int i = 1; i < arrays.size(); i++) {
            int temp = getDistance(minChamp, i, arrays);
            int temp2 = getDistance(i, maxChamp, arrays);
            if (getMin(i) < getMin(minChamp)) {
                        minChamp = i;
                    }
             if (getMax(i) > getMax(maxChamp)) {
                        maxChamp = i;
                    }            
            if (temp > distance || temp2 > distance) {
                if (temp2 > temp) {
                    distance = temp2;
                }
                else {
                    distance = temp;
                }
            }
        }
        return distance;
    }
    
    private int getDistance(int minIndex, int maxIndex, List<List<Integer>> arrays) {
        return Math.abs((arrays.get(minIndex).get(0)) - 
                        (arrays.get(maxIndex).get(arrays.get(maxIndex).size() - 1)));
    }
    
    private int getMin(int index) {
        return arrays.get(index).get(0);
    }
    
    private int getMax(int index) {
        return arrays.get(index).get(arrays.get(index).size() - 1);
    }
}