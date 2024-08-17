class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0; // Pointer for the position of the next non-zero element

        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums, index, i);
                index++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
