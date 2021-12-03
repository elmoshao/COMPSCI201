import java.util.ArrayList;
import java.util.List;

public class LeafCollector {


    public String[] getLeaves(TreeNode tree) {
        // replace with working code
        if (tree == null){return null;}
        List<String> retlist = new ArrayList<>();

        while (tree != null){
            List<String> list = new ArrayList<>();
            tree = removeLeaves(tree,list);
            retlist.add(String.join(" ",list));
        }

        String[] ret = retlist.toArray(new String[0]);
        return ret;
    }


    private void leafDelete(TreeNode root,List<String> list)
    {
        if (root == null)
            return;

        // If node is leaf node, print its data
        if (root.left == null &&
                root.right == null)
        {
            list.add(""+root.info);
            root = null;
            return;
        }

        // If left child exists, check for leaf
        // recursively
        if (root.left != null){
            leafDelete(root.left,list);}
        // If right child exists, check for leaf
        // recursively
        if (root.right != null) {

            leafDelete(root.right,list);
        }
        // Else recursively delete in left and right
        // subtrees.




    }

    private void collectAndRemove (TreeNode root, List<String> list){

        if(root == null) return;
        if(! isLeaf(root)) {
            if (isLeaf(root.left)) {
                list.add("" + root.left.info);
                root.left = null;
            }
            if (isLeaf(root.right)) {
                list.add(" " + root.right.info);
                root.right = null;
            }
            collectAndRemove(root.left, list);
            collectAndRemove(root.right, list);
        }
        else{list.add(""+root.info);
        root = null;
        return;}

    }

    private boolean isLeaf(TreeNode root){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        else{return false;}
    }

    private  TreeNode removeLeaves(TreeNode root,List<String> list){
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            list.add(""+root.info);
            return null;
        }

        root.left = removeLeaves(root.left,list);
        root.right = removeLeaves(root.right,list);

        return root;
    }
}
