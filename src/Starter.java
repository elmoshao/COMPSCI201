

public class Starter {
    public int begins(String[] words, String first) {
        int sum = 0;
        String[] words2 = {};
        for ( int i = 0; i < words.length; i++){
            if ( first.charAt(0) == words[i].charAt(0) ){
                words2 = append(words2, words[i]);

            }
        }
        for ( int j = 1; j < words2.length; j++){
            for ( int k = 0; k < j; k ++){
                if (words2[j].equals(words2[k])  ){
                    words2[j] = "1";
                }
            }
        }

        for ( int k = 0; k < words2.length; k++){
            if(! words2[k].equals("1") ){
                sum += 1;
            }
        }



     return sum;
    }

    private String[] append(String[] array, String item) {

        String[] array1 = new String[array.length + 1];
        for (int i = 0; i < array.length; i ++){
            array1[i] = array[i];
        }
        array1[array.length] = item;
        return array1;
    }
}



