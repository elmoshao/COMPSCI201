import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class LetterFreq {
    public String findFreqs(String[] words) {
        // write code here
        //String[]ret2 = new String[26];
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < words.length; i++){
            String[] temp1 = words[i].split(" ");
            String temp2 = String.join("",temp1);
            String[] temp3 = temp2.split("");
            for(int j = 0; j < temp3.length;j++){

                if (!map.containsKey(temp3[j])) {
                    map.put(temp3[j],1);
                }
               else{
                map.put(temp3[j], map.get(temp3[j]) + 1);}

            }
        }

        String[] ret1 = new String[26];

        for(int k = 0; k < 26; k++){
            char c1 = (char)('a' + k) ;
            String c2 = Character.toString(c1);
            if (!map.containsKey(c2)) {
                ret1[k] = String.valueOf(0);
            }
            else{
                ret1[k] = String.valueOf(map.get(c2));}


        }
        String ret = String.join(":",ret1);
        return ret;
    }
}
