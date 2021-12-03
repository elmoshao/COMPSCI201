import java.util.Arrays;

public class VoteRigging {
    public int minimumVotes(int[] votes) {
        // fill in code here
        int buy = 0;
        if(votes.length ==1) return 0;

        int[] others = new int[votes.length-1];
        for(int i=0; i < others.length; i++){
            others[i]= votes[i+1];
        }
        Arrays.sort(others);
        int m = others.length - 1;

        while(buy + votes[0] <= others[m]){
            others[m] --;
            buy ++;
            Arrays.sort(others);
        }

        return buy;
    }

}
