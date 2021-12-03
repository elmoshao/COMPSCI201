import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        // TODO:fill in code here
        int total = 0;

        for(int j = 0; j < words.length; j ++){
            String jword = iso(words[j]);
            for (int k = j+1; k < words.length; k++){
                String kword = iso(words[k]);
                if (jword.equals(kword)){
                    total += 1;
                }
            }
        }
        return total;

    }
    private String iso(String s){
        List<String> mlist =  Arrays.asList(s.split(""));
        List <String> newlist = new ArrayList<>();
        List <Character> alist = new ArrayList<>();
        for(String t: mlist){
            if(!newlist.contains(t)){
                newlist.add(t);
            }
        }
        int ascii = (char) 'a';
        for(int i = 0;i< mlist.size();i++){
            int cin = newlist.indexOf(mlist.get(i));
            int code = ascii + cin;
            alist.add((char) code);

        }
        StringBuilder ret = new StringBuilder();
        for (char ch:alist){
            ret.append(ch);
        }

        return ret.toString();
    }

}
