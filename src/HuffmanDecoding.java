import java.util.HashMap;

public class HuffmanDecoding {
    private HashMap<String, String> myDictionary = new HashMap<>();
    public String decode(String archive, String[] dictionary) {
        // fill in code here

        Character c = 'A';
        for (int i = 0; i < dictionary.length; i++) {
            myDictionary.putIfAbsent(dictionary[i], c.toString());
            c++;
        }


        String str = "";
        int current = 0;
        for (int i = 0; i < archive.length() + 1; i++) {
            if (myDictionary.keySet().contains(archive.substring(current, i))) {
                str = str + letter(archive.substring(current, i));
                current = i;
            }
        }
        return str;



    }
    private String letter(String code) {
        for (int i = 0; i < code.length(); i++) {
            if (myDictionary.keySet().contains(code.substring(0, i + 1))) {
                return myDictionary.get(code.substring(0, i + 1));
            }
        }
        return "";
    }
}
