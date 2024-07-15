class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the elements

        int resultSum = nums[0] + nums[1] + nums[2]; // Initial closest sum (can be anything)
        int minDifference = Integer.MAX_VALUE; // Initialize minimum difference

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return target; // Perfect match, return directly
                }

                int diffToTarget = Math.abs(sum - target); // Absolute difference to target

                if (diffToTarget < minDifference) {
                    resultSum = sum;
                    minDifference = diffToTarget;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return resultSum; // Return the closest sum found
    }
}
