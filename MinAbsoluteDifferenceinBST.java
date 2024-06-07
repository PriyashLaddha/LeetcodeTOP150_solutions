class Solution {
    int minDifference=Integer.MAX_VALUE;
    Integer prev=null;
    public int getMinimumDifference(TreeNode root) {
        // Exit coondition
        if(root==null) return minDifference;
        getMinimumDifference(root.left);
        // Process root
        if(prev!=null)
        {
            minDifference=Math.min(minDifference,root.val-prev);
        }
        if(root!=null)
        {
            prev=root.val;
        }
        getMinimumDifference(root.right);
        return minDifference;
        
    }
}