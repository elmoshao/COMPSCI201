import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SoccerLeagues {
    public int[] points(String[] matches) {
        //TODO: you write code here
        int tcounts = matches.length;
        int[] tscores = new int[tcounts];
        for (int i = 0; i < tcounts; i++){
            List<String> info = Arrays.asList(matches[i].split(""));
            for(int j = 0; j < info.size(); j++){
                if (info.get(j).equals("W")){
                    tscores[i] += 3;
                }
                if (info.get(j).equals("D")){
                    tscores[i] += 1;
                    tscores[j] += 1;
                }
                if (info.get(j).equals("L")) {
                    tscores[j] += 3;
                }
            }
        }
return tscores;

    }
}
