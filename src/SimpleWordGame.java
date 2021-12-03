import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        // you write code here
        int points = 0;
        HashSet<String> dplayer = new HashSet<>(Arrays.asList(player));
        HashSet<String> book = new HashSet<>(Arrays.asList(dictionary));
        dplayer.retainAll(book);
        int k = dplayer.size();
        for (String s : dplayer) {
            points += s.length() * s.length();
        }

return points;



}}
