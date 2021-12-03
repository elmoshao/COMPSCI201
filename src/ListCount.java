
public class ListCount {

    public int count (ListNode list) {
        // TODO
        int counts = 0;
        ListNode temp = list;
        while (temp != null){
            counts += 1;
            temp = temp.next;
        }
        return counts;
    }
}