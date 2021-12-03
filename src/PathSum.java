
public class PathSum {
    public int hasPath(int target, TreeNode tree){
        // replace with working code

        int ret = 0;

        //boolean ans = false;
        int subSum = target - tree.info;
        if(subSum == 0 && tree.left == null && tree.right == null){
            ret = 1;
            return ret;
        }

        if(tree.left != null)

            // ans || hasPathSum... has no utility if the ans is false
        { ret = ret + hasPath(subSum,tree.left);}

        if(tree.right != null){

            // But if it is true then we can avoid calling hasPathSum
            // here as answer has already been found
            ret = ret + hasPath(subSum,tree.right);}
            //ans = ans || hasPathSum(node.right, subSum);
        return ret;

    }
}
