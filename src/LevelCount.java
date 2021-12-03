public class LevelCount {
    public int count(TreeNode t, int level) {
        // replace with working code
        if ( t == null){
        return 0;}
        if (level == 0 && t != null){return 1;}
        else{return count(t.left,level-1) + count(t.right, level-1);}
        //int ret = 0;
        //for(int i = 1; i <= level; i++){
        //    ret = count(t.left,level-i) + count(t.right,level-i);
        //}
        //return ret;
    }
}
