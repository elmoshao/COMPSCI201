import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
public class SetAside {
    public String common(String[] list) {
        // TODO:replace this with your code
        Set <String> common = new TreeSet<String>(Arrays.asList(list[0].split(" ")));
        for(int i = 1; i < list.length; i++){
            Set <String> word = new TreeSet<String>(Arrays.asList(list[i].split(" ")));
            common.retainAll(word);
        }
        String ret = String.join(" ",common);


        return ret;
    }
}
