import java.util.*;

public class TreeSort {
    public int[] sort(TreeNode t) {
        ArrayList<Integer> a = new ArrayList<>();
        help(t,a);
        Collections.sort(a);
        int[] ret = new int[a.size()];
        for(int k=0; k < ret.length; k++) {
            ret[k] = a.get(k);
        }
        return ret;
    }
    public void help(TreeNode tree, ArrayList<Integer> list) {
        if (tree != null) {
            list.add(tree.info);
            help(tree.left,list);
            help(tree.right,list);
        }
    }


}
