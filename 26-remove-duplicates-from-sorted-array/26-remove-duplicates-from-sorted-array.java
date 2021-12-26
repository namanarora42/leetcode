class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int lastValue = nums[0];
        int lastPointer = 0;
        int currentPointer = 1;
        int nextValue;
        while (currentPointer < nums.length) {
            nextValue = nums[currentPointer];
            lastValue = nums[lastPointer];
            if (nextValue != lastValue) {
                lastPointer++;
                nums[lastPointer] = nextValue;
            }
            currentPointer++;
        }
        return lastPointer+1;
    }
}