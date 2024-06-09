class Solution {
    public boolean canJump(int[] nums) {
        // Initially the finalposition is the last Index
        int finalPosition = nums.length - 1;
        // Start with the second last index
        for (int idx = nums.length - 2; idx >= 0; idx--) {
            // If u can reach the final position from the index update the index
            if (idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }
        // If we can reach the first Index, then we can make the jump possible
        return finalPosition == 0;
    }
}