import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        // you write code heref
        /*ArrayList<String> list = new ArrayList<>();
        for (String s:sentences){
            list.addAll(Arrays.asList(s.toLowerCase().split(" ")));
        }
        int max = 0;
        String smax = "";
        for(String s:list){

        }*/
        String all = String.join(" ",sentences).toLowerCase();
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: all.split(" ")){
            map.putIfAbsent(s,0);
            map.put(s, map.get(s) + 1);
        }
        int max = Collections.max(map.values());
        for (String key : map.keySet()){
            if (map.get(key) == max) {
                return key;
            }
        }
        return "this is not supposed to show up";
    }
}
