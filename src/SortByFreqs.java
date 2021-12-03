import java.util.*;

public class SortByFreqs {

    public String[] sort(String[] data) {
        // fill in code here
        TreeMap<String,Integer> map = new TreeMap<>();
        for(int i = 0; i< data.length; i++){
            if(!map.containsKey(data[i])){
                map.put(data[i],0);
            }
            map.put(data[i], map.get(data[i]) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        String[] ret = new String[list.size()];
        int j = 0;
        for(Map.Entry<String, Integer> s : list){
            ret[j] = s.getKey();
            j++;
        }
        return ret;
    }

}
