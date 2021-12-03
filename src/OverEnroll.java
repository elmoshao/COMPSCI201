import java.util.Collections;
import java.util.HashMap;

public class OverEnroll {
    public String[] popular(String[] data) {
        // write code here
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++){
            String[] temp1 = data[i].split(":");
            if (!map.containsKey(temp1[0])) {
                map.put(temp1[0],Integer.parseInt(temp1[2]));
            }
            else{
                map.put(temp1[0], map.get(temp1[0]) + Integer.parseInt(temp1[2]) );}
        }
        int maxValueInMap=(Collections.max(map.values()));
        int minValueInMap = (Collections.min(map.values()));
        String[] ret = new String[2];
        for (String key : map.keySet()) {
            if(map.get(key) == maxValueInMap){
                ret[0] = key + ":" + String.valueOf(maxValueInMap);
            }
            if(map.get(key) == minValueInMap){
                ret[1] = key + ":" + String.valueOf(minValueInMap);
            }
        }

        return ret;
    }
}