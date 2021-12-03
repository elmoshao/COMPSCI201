public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // TODO:
        int flag = 0;

        while(a1 != null & a2 != null){
            if ( a1.info - a2.info != 0){
                flag = -1;
                break;
            }
            a1 = a1.next;
            a2 = a2.next;
        }
        if( a1 != null | a2 !=null)
        {flag = -1;}

        return flag + 1;
    }
}
