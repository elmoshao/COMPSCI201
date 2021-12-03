import java.util.TreeMap;

public class LeafTrails {
    private TreeMap<Integer,String> myMap;

    public String[] trails(TreeNode tree) {
        // replace with working code
        myMap = new TreeMap<>();
        String path = new String();
        dowork(tree, path);
        String[] ret = myMap.values().toArray(new String[0]);
        return ret;
    }
    private void dowork(TreeNode tree, String path){
        if (tree == null){
            return;
        }
        if (tree.left == null && tree.right == null){
            myMap.put(tree.info, path);

        }
        else{
            dowork(tree.left, path + "0");
            dowork(tree.right, path+ "1");
        }
    }
}
