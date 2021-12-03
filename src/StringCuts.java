import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        LinkedHashSet<String> words= new LinkedHashSet<>(Arrays.asList(list) );
        LinkedHashSet<String> ret = new LinkedHashSet<>();
        for( String s : words){
            if ( s.length() >= minLength){
                ret.add(s);
            }
        }
        String[] output = new String[ret.size()];
        int i = 0;
        for (String s:ret){
            output[i++] = s;
        }
return output;
        }
    }

