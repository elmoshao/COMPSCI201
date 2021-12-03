import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class SyllableSorting {

    private class wordinfo{
        String myword;
        String[] syllables;
        String[] sortedsyllables;
        wordinfo(String name){
            myword = name;
        }
        public String[] getSyllables(){
            return syllables;
        }
        public String[] getsortedsyllables(){
            return sortedsyllables;
        }

        public String getword(){
            return myword;
        }}





        public String[] sortWords(String[] words) {
        // you write code here
        HashMap<String, List<ArrayList<String>>> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.put(words[i], new ArrayList<ArrayList<String>>());
            map.get(words[i]).add(decompose(words[i]));
            ArrayList<String> temp = decompose(words[i]);
            Collections.sort(temp);
            map.get(words[i]).add(temp);
        }





    }








    private ArrayList<String> decompose(String word){
        String vowel = "aeiou";
        ArrayList<String> list = new ArrayList<>();
        int index = 0;
        int flag = 1;
        for (int i = 0; i< word.length(); i++){

            if(flag == 1 & vowel.indexOf(word.charAt(i)) >= 0){
                flag = 0;
                continue;
            }
            if(flag == 0 & vowel.indexOf(word.charAt(i)) >= 0){

                continue;
            }
            if(flag == 0 & vowel.indexOf(word.charAt(i)) < 0){
                list.add(word.substring(index,i));
                index = i;
                flag = 1;
                continue;
            }
            if(flag == 1 & vowel.indexOf(word.charAt(i)) < 0){
                flag = 0;
                continue;
            }
            if(i == word.length() - 1){
                list.add(word.substring(index, i+1));
            }

        }
        return list;
    }

}
