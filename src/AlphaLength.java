import java.util.List;
import java.util.Arrays;
import java.util.TreeSet;

public class AlphaLength {
    public ListNode create (String[] words) {
        // TODO: replace statement below with code you write
        List<String> words2 = Arrays.asList(words);

        TreeSet<String> list = new TreeSet<>(words2);

        ListNode ret = new ListNode(0,null);
        ListNode first = ret;
        ListNode last = ret;
        for(String s:list){
            ret.info = s.length();
            ret.next = new ListNode(0,null);
            last = ret;
            ret = ret.next;
        }
        last.next = null;
        return first;
    }
}
