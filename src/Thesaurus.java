import java.util.ArrayList;
import java.util.*;

public class Thesaurus {
    public String[] edit(String[] entry) {
        // TODO: fill in code here
        ArrayList<TreeSet<String>> list = convert(entry);

        while(true){
            int size = list.size();
            list = combine(list);
            if(list.size() == size){break;}
        }
        ArrayList<String> ret = new ArrayList<>();
        for(TreeSet<String> set: list){
            String s = String.join(" ",set);
            ret.add(s);
        }
        Collections.sort(ret);
        return ret.toArray(new String[0]);

    }




    private ArrayList convert(String[] entry){
    ArrayList<TreeSet<String>> list = new ArrayList<>();
    for(String s: entry){
        TreeSet<String> sset = new TreeSet<>();
        String[] words = s.split(" ");
        for(String w: words){
            sset.add(w);
        }
        list.add(sset);
    }
    return list;
}

    private ArrayList combine(ArrayList<TreeSet<String>> list){
        int counts = list.size();
        boolean sign = false;
        for(int i = 0; i < counts - 1; i++){
            for(int j = i + 1 ; j < counts ;j++){
                int flag = 0;
                for(String word:list.get(i)) {
                    if (list.get(j).contains(word)) {
                        flag += 1;
                    }
                }
                if(flag >= 2){
                    list.get(i).addAll(list.get(j));
                    list.remove(j);
                    sign = true;
                    break;
                }

            }
            if(sign){break;}
        }
        return list;

}
}
