class Solution {
    public int jump(int[] nums) {
        int totalJumps = 0;
        // Destination is the last index
        int destination = nums.length - 1;
        int coverage = 0;
        int lastJumpIdx = 0;
        // BASE CASE
        if (nums.length == 1)
            return 0;

        // GREED Strategy: Extend coverage as long as possible
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;
                // Check if we reached destination already
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}