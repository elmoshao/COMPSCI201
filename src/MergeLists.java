import java.util.ArrayList;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        // replace statement below with code you write
        ArrayList <Integer> list = new ArrayList<>();
        while(a!=null){
            list.add(a.info);
            list.add(b.info);
            a = a.next;
            b = b.next;
        }
        ListNode ret = new ListNode(0,null);
        ListNode first = ret;
        ListNode last = ret;
        for(int s:list){
            ret.info = s;
            ret.next = new ListNode(0,null);
            last = ret;
            ret = ret.next;
        }
        last.next = null;
        return first;
    }
}
