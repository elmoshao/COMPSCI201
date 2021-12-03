import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        // fill in code here
        int o = -1;
        boolean flag = false;
        for (String mymenu : orders) {
            o += 1;
            flag = compare(available, mymenu);
            if ( flag) break;
        }

        if (flag) {return o;}
        else return -1;
        }


private boolean compare(String[] available, String order) {
      Boolean flag = true;
    String[] ingredients = order.split(" ");
    for (String item : ingredients){
        if (! Arrays.asList(available).contains(item)){
            flag = false;
            break;
        }}
    return flag;


}
}
