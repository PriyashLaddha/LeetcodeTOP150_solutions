import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Fill both the arrays with 1 initially
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        // Left pass: ensure children with higher ratings get more candies than their left neighbors
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Right pass: ensure children with higher ratings get more candies than their right neighbors
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        // Calculate the total number of candies required
        int candies = 0;
        for (int i = 0; i < n; i++) {
            candies += Math.max(left[i], right[i]);
        }
        
        return candies;
    }
}
