class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=getHeightleft(root);
        int right=getHeightRight(root);

        // If the left and right are equal then the tree is complete
        if(left==right)
          return ((2<<(left))-1);

        //Else recursively call the number of nodes in the left and the right subtree

      else return countNodes(root.left)+countNodes(root.right)+1;

    }
    public int getHeightleft(TreeNode root)
    {
        int count=0;
        while(root.left!=null)
        {
            count++;
            root=root.left;
        }
        return count;
    }
    public int getHeightRight(TreeNode root)
    {
        int count=0;
        while(root.right!=null)
        {
            count++;
            root=root.right;
        }
        return count;
    }
}