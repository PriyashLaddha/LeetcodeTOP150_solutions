class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                // Find the rightmost node in the left subtree
                TreeNode predecessor = curr.left;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }

                // Connect the rightmost node to the right subtree of the current node
                predecessor.right = curr.right;

                // Make the left subtree the new right subtree
                curr.right = curr.left;
                curr.left = null;
            }

            // Move to the next node (which is now the right child)
            curr = curr.right;
        }
    }
}
