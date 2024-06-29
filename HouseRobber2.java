class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        // Create two arrays based on nums length
        int[] skipLastHouse = new int[nums.length - 1];
        int[] skipFirstHouse = new int[nums.length - 1];
        
        // Populate skipLastHouse and skipFirstHouse correctly
        for (int i = 0; i < nums.length - 1; i++) {
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i + 1];
        }
        
        // Get the loot from both possibilities
        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);
        
        // Return the maximum of two loots
        return Math.max(lootSkippingLast, lootSkippingFirst);
    }
    
    private int robHelper(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[nums.length - 1];
    }
}
