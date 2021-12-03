public class ListSum {
    public int sum(ListNode list, int thresh) {
        // TODO:

        ListNode temp = list;
        int sum = 0;
        while (temp != null) {
            if (temp.info > thresh) {
                sum += temp.info;

            }
            temp = temp.next;
        }
        return sum;

    }
}
