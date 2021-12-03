public class OneValue {

    private class Count{
        int count = 0;
    };
    public int count(TreeNode tree) {
        // replace with working code
        Count c = new Count();

        helpercount(tree,c);

        return c.count;
    }
    private boolean helpercount(TreeNode node, Count c){
        if (node == null)
            return true;

        // Recursively count in left and right subtrees also
        boolean left = helpercount(node.left, c);
        boolean right = helpercount(node.right, c);

        // If any of the subtrees is not singly, then this
        // cannot be singly.
        if (left == false || right == false)
            return false;

        // If left subtree is singly and non-empty, but data
        // doesn't match
        if (node.left != null && node.info != node.left.info)
            return false;

        // Same for right subtree
        if (node.right != null && node.info != node.right.info)
            return false;

        // If none of the above conditions is true, then
        // tree rooted under root is single valued, increment
        // count and return true.
        c.count++;
        return true;
    }
}

/*  Alternative

 public class OneValue {
    public int count(TreeNode tree) {
        if (tree == null) return 0;
        if (tree.left == null && tree.right == null) return 1;

        int sub = count(tree.left) + count(tree.right);
        int add = allsame(tree) ? 1 : 0;
        return add + sub;
    }
    public boolean allsame(TreeNode tree) {
        if (tree == null) return true;
        if (! allsame(tree.left) || ! allsame(tree.right)) {
            return false;
        }
        int left = tree.info;
        int right = tree.info;
        if (tree.left != null) left = tree.left.info;
        if (tree.right != null) right = tree.right.info;
        return tree.info == left && tree.info == right;
    }
}
*/