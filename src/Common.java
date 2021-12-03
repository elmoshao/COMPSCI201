public class Common {

    public int count (String a, String b) {
        // TODO: fill in code here
        int numberofdupe = 0;
        char[] cb = b.toCharArray();

        for (char ca: a.toCharArray()){
            for(int k = 0; k < b.length(); k++) {
                if (ca == cb[k]){
                    numberofdupe += 1;
                    cb[k] = '1';
                    break;
                }
            }
        }



        return numberofdupe;
    }

}
