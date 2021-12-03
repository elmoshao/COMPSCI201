
import java.util.*;
public class LetterCountSort {
    private class myword{
        String myName;
        int specialcounts;
        myword(String name){
            myName = name;
        }

        public int getcount(){
            return specialcounts;
        }
        public String getName(){
            return myName;
        }

    }

    public String[] sort(String[] list, String specialChars) {
        // you write code here
        Map<String, myword> sortedlist = new HashMap<>();
        for(int i = 0; i < list.length;i++){
            sortedlist.put(list[i],new myword(list[i]));
            String[] temp = list[i].split("");
            for(int j = 0; j < temp.length; j++){
                if(specialChars.indexOf(temp[j]) >= 0){
                    sortedlist.get(list[i]).specialcounts += 1;
                }
            }
        }
        //sortedlist.entrySet().stream().sorted(Map.Entry.comparingByKey());
        //sortedlist.entrySet().stream().sorted(Map.Entry.comparingByValue());
        ArrayList<myword> ret = new ArrayList<>(sortedlist.values());
        ret.sort(Comparator.comparing(myword::getName));
        ret.sort(Comparator.comparing(myword::getcount));
       // ret.sort(Comparator.naturalOrder());
        //ret.sort(Collections.reverseOrder(Comparator.comparing(Map.Entry.comparingByValue())))
        String[] retlist = new String[ret.size()];
        for (int k = 0; k< ret.size();k++){
            retlist[k] = ret.get(k).getName();
        }

        return retlist;
    }



}
