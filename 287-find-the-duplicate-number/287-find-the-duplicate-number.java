class Solution {
    public int findDuplicate(int[] nums) {
        int found = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                found = swap(i, nums[i] - 1, nums);
                if (found != -1) return found;
            }
        }
        return found;
    }
    
    private int swap(int i, int j, int[] nums) {
        if (nums[j] == nums[i]) return nums[i];
        
        if (nums[j] != i + 1) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            return swap(i, nums[i] - 1, nums);
        }
        return -1;
    }
}