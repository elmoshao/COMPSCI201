import java.util.HashMap;

public class BSTcount {


    HashMap<Integer, Long> myMap = new HashMap<Integer, Long>();

    public long howMany(int[] values) {
        // fill in code here
        return helper(values.length);

    }
    private long helper(int n) {
        if (n <= 1) return 1;
        if (myMap.containsKey(n)) return myMap.get(n);
        else{
            long sum = 0;
            for (int root = 1; root <= n; root++){
                //Recurse on left and right of root
                long left = helper(root-1);
                long right = helper(n - root);
                long total = left * right;
                sum += total;
            }

            myMap.put(n, sum);
            return sum;
        }
    }
}
