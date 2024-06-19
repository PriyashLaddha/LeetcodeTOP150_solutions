class Solution {
    public boolean isBalanced(TreeNode root) {
        return (getHeight(root) != -1);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0; // Base case: Height of an empty tree is 0.
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // If a subtree is unbalanced or the current node is unbalanced, return -1
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
