class Solution {
    public int maxArea(int[] height) {
        int champ1 = 0;
        int champ2 = height.length - 1;
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }
        // int marker = 2;
        boolean backCheck = false;
        int maxArea = 0;
        while (champ1 < champ2) {
            maxArea = Math.max(maxArea, Math.min(height[champ1], height[champ2]) * Math.abs(champ2 - champ1));
            if (height[champ1] < height[champ2]) {
                champ1++;
            }
            else {
                champ2--;
            }
        }
        return maxArea;
    }
}