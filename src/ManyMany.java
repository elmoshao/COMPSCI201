import java.util.*;

public class ManyMany {
    public String[] filter(String[] data){
        // write code here
        String[] ret = new String[data.length];
        for(int i = 0; i < data.length; i++) {
            String[] temp1 = data[i].split(" ");
            TreeSet<String> temp2 = new TreeSet<>();
            for(int j = 0; j < temp1.length; j++){
                int c = count(temp1[j],temp1);
                if(c >= 2){
                    temp2.add(temp1[j]);
                }
            }
            String[] temp3 = new String[temp2.size()];
            int k = 0;
            for (String s: temp2){
                temp3[k] = s;
                k++;
            }
            ret[i] = String.join(" ",temp3);


        }
        return ret;
    }

    private int count(String w, String[] slists) {
        int counts = 0;
        for (int i = 0; i < slists.length; i++) {
            if (slists[i].equals(w)) {
                counts += 1;
            }
        }
        return counts;
    }
}

