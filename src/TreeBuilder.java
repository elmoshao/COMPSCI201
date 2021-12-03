public class TreeBuilder {

    public TreeNode create(int[] values) {
        return help(values,0);
    }
    private TreeNode help(int[] values, int index) {
        if (index >= values.length) return null;
        return new TreeNode(values[index],
                help(values,2*index+1),
                help(values,2*index+2));
    }

}
