import java.util.HashSet;

public class FriendScore {
    public int highestScore(String[] friends) {
        // you fill in code here
        int ret = 0;
        int max = 0;

        HashSet<Integer> twofriends = new HashSet<Integer>();

        for(int i = 0; i < friends.length; i++){

            for(int j = 0 ; j< friends[i].length(); j++){

                if(friends[i].charAt(j) == 'Y'){
                    twofriends.add(j);
                    for(int k = 0; k < friends[j].length(); k++){
                        if(friends[j].charAt(k) == 'Y' && k!=i){
                            twofriends.add(k);
                        }
                    }
                }
            }
            if(twofriends.size() > max){
                max = twofriends.size();
                ret = max;
            }
            twofriends.clear();

        }
        return ret;
    }
}
