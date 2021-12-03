public class ListMutation {
    public ListNode alter(ListNode list) {
        // replace statement below with code you write
        ListNode temp = list;
        ListNode prev = null;
        if(temp == null)
        {
            return null;
        }

        if(temp.next==null)
        {
            if(temp.info % 2 !=0)
            {
                return null;

            }
        }
        while(temp!=null)
        {
            if(temp.info%2!=0)
            {
                if(prev==null)
                {
                    list=list.next;
                    temp=list;
                }
                else
                {
                    prev.next=temp.next;
                    temp=temp.next;
                }

            }
            else {
                ListNode temp2 = new ListNode(temp.info);
                temp2.next = temp.next;
                temp.next = temp2;
                prev = temp2;
                temp = temp2.next;
            }
        }






        return list;
    }

}

/*

Alternative 01
public class ListMutation {
    public ListNode alter(ListNode list) {
        if (list == null) return null;
        ListNode after = alter(list.next);
        if (list.info % 2 != 0) {
            return after;
        }
        return new ListNode(list.info, new ListNode(list.info,after));
    }


 Alternative 02
    public ListNode alterIt(ListNode list) {
        if (list == null) return null;
        ListNode first = new ListNode(-2);
        ListNode last = first;
        while (list != null) {
            if (list.info % 2 == 0) {
                last.next = new ListNode(list.info,
                              new ListNode(list.info));
                last = last.next.next;
            }
            list = list.next;
        }
        return first.next;
    }
}
*/