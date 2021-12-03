import java.util.*;
import java.util.stream.Collectors;

public class PairDown {
    public int[] fold(int[] list) {
        // TODO: change this code

        List <Integer> nlist =  Arrays.stream(list).boxed().collect(Collectors.toList());
        if(list.length % 2 ==1){

            nlist.add(0);}

        int[] ret = new int[(int) nlist.size()/2];

        for (int k = 0; k< nlist.size(); k += 2){
            ret[k/2] = nlist.get(k) + nlist.get(k+1);

        }

        return ret;
    }

}
