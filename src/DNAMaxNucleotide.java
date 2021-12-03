public class DNAMaxNucleotide {

    public String max(String[] strands, String nuc) {
        // fill in code here
        String ret = "";
        int max = 1;
        for (String s : strands){
            int nc = count(s,nuc);
            if (nc > max ||
                    (nc == max && s.length() > ret.length())){
                ret = s;
                max = nc;
            }

        }
        return ret;
    }

    private int count(String s, String nuc){
        int nc = 0;
        for ( char ch : s.toCharArray()){
            if (ch == nuc.charAt(0)) { nc += 1;}
        }
        return nc;
    }



}
