import java.util.TreeSet;

public class UniqueTreeValues {
    private TreeSet<Integer> myset;

    public int[] unique(TreeNode root) {
        // write code here
        myset = new TreeSet<>();
        inOrder(root);
        int[] ret = new int[myset.size()];
        int i = 0;
        for(int k: myset){
            ret[i] = k;
            i ++ ;
        }


        return ret;
    }

    public void inOrder(TreeNode root){
        if (root != null){

            myset.add(root.info);
            inOrder(root.left);
            inOrder(root.right);

        }
    }
}
