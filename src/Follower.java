import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Follower {
    public int[] follows(String[] words) {
        // write code here
        ArrayList<Integer> index = new ArrayList<>();

        //ArrayList<String> wlist = new ArrayList<>(Arrays.asList(words));
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i+1; j < words.length; j++){
                if (words[i].equals(words[j])){
                    index.add(i);
                    break;

                }
            }
        }
        int[] ret = new int[index.size()];
        for(int i = 0;i < index.size(); i++){
            ret[i] = index.get(i);
        }
        return ret;
    }
}
