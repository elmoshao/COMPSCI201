import java.util.ArrayList;
import java.util.Collections;

public class SortedLeaves {
    private ArrayList<String> mylist;
    public String[] values(TreeNode tree) {
        // replace with working code
        mylist = new ArrayList<>();
        dowork(tree);
        Collections.sort(mylist);
        String[] ret = new String[mylist.size()];
        for (int i = 0;i < mylist.size(); i++){
            ret[i] = mylist.get(i);
        }


        return ret;
    }
    private void dowork(TreeNode tree){
        if(tree == null){return;}
        if(tree.left == null && tree.right == null){
            mylist.add("" + ((char)tree.info));

        }
        else{
            dowork(tree.left);
            dowork(tree.right);
        }
    }

}
