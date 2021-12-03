import javax.swing.*;
import java.util.Arrays;

public class TxMsg {
    public String getMessage(String original) {
        // code here
        String[] data = original.split(" ");
        String[] ret = new String[data.length]; //create a string array to store encoded words

        for (int k = 0; k < data.length; k++) {
            ret[k] = convert(data[k]);
        }
        return String.join(" ", ret);
    }

    private String convert(String word) {
        String word2 = new String();
        String[] vowel = {"a", "e", "i", "o", "u"};
        int count_vowel = 0;
        int i ;
        int k;
        char[] ca = word.toCharArray();
        for (char ch : word.toCharArray()) {
            if (Arrays.asList(vowel).contains(String.valueOf(ch))) {
                count_vowel += 1;
            }
        }
        if (word.length() == count_vowel) {
            word2 = word;
        }
        else {

            for (k = 0; k < word.length(); k++) {
                if (Arrays.asList(vowel).contains(String.valueOf(ca[k]))) {
                    ca[k] = '1';
                } else {
                    for (i = 1; i < word.length() - k; i++) {
                        if (Arrays.asList(vowel).contains(String.valueOf(ca[k + i]))) {
                            ca[k + i] = '1';
                            break;

                        }
                        else {
                            ca[k + i] = '1';

                        }
                    }
                    k = k + i;
                }
            }
            word2 = String.valueOf(ca);
            word2 = word2.replace("1", "");

        }


        return word2;
    }
}

