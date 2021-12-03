import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        // fill in code here
        TreeSet<String> set = new TreeSet<>(Arrays.asList(data));
        int[] ret = new int[set.size()];
        int i = 0;
        for(String s:set){
            ret[i] = Collections.frequency(Arrays.asList(data), s);
            i++;
        }
        return ret;
    }
}
