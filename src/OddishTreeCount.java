public class OddishTreeCount {
    public int count(TreeNode tree) {
        // replace with working code


        if(tree == null){
            return 0;
        }
        if(tree.info % 2 != 0){
            return 1 + count(tree.left) + count(tree.right);
        }
        if(tree.info %2 == 0){
            return 0 + count(tree.left) + count(tree.right);
        }
        return 0;
    }
}
