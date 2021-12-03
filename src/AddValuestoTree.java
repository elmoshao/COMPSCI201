public class AddValuestoTree {
    public TreeNode add(TreeNode root, String value){
        if (root == null){
            return new TreeNode(value, null,null);
        }
        int comp = value.compareTo(root.info);
        if(comp <= 0){
            root.left = add(root.left,value);
        }
        else{ root.right = add(root.right, value);
    }
        return root;
}
