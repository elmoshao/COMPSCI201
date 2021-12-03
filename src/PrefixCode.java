public class PrefixCode {
    public String isOne(String[] words) {
        // fill in body of this function
        for (int i = 0; i < words.length; i++){
            for( int j = 0; j < words.length; j++){
                if (i != j){
                    if( words[j].indexOf(words[i]) == 0){
                        return "No, " + i;
                    }
                }
            }
        }


return "Yes";
    }
}
