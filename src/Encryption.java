
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Encryption {
    /*public String encrypt(String message){
        // TODO:you write code here
        List <String> mlist =  Arrays.asList(message.split(""));
        String letter = "abcdefghijklmnopqrstuvwxyz";
        List<String> letterlist = Arrays.asList(letter.split(""));
        List <String> alist = new ArrayList<>();
        //char character = 'a';
        //int ascii = (int) character;



        for (int i = 0; i < mlist.size(); i++){
            int cin = mlist.indexOf(mlist.get(i));
            //int code = ascii + cin;
            alist.add( letterlist.get(cin));

        }
        String ret = alist.toString();
        return ret;


    }*/
    public String encrypt(String message){
        //TODO
        List <String> mlist =  Arrays.asList(message.split(""));
        List <String> newlist = new ArrayList<>();
        List <Character> alist = new ArrayList<>();
        for(String s: mlist){
            if(!newlist.contains(s)){
                newlist.add(s);
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
        //HashMap <String,Integer> dic = new HashMap<String,Integer>();


    }

}
