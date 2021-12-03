import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] values){
        // you write code here and replace statement below
        //ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        //list.sort(Comparator.comparing())
        Arrays.sort(values, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return values;
    }
}
