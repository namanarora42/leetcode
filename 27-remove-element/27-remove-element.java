class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1 && val == nums[0]) {
            return 0;
        }
        int end = 0;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != val) {
                nums[end] = nums[index];
                    end++;
            }
            index++;
        }
        return end;
    }
}