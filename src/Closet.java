import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Closet {
    public String anywhere(String[] list) {
        // TODO replace this with your code
        Set<String> cplist = new TreeSet<String>(Arrays.asList(list[0].split(" ")));
        for(int i = 1; i < list.length; i++){
            cplist.addAll(Arrays.asList(list[i].split(" ")));
        }
        String ret = String.join(" ",cplist);

        return ret;
    }

}
