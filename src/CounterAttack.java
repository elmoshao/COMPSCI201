import java.util.HashMap;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // change this code
        int[] ret = new int[words.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (String s:str.split(" ")){
            if (map.containsKey(s)){
                int current = map.get(s);
                map.put(s, current+1);
            }
            else
            {map.put(s,1);}

        }
        for (int k = 0; k< words.length; k++){
            ret[k] = 0;
            if (map.containsKey(words[k])){
                ret[k] = map.get(words[k]);
            }
        }
        return ret;
    }
}