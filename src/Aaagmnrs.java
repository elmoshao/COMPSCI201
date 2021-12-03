import java.util.*;
import java.util.stream.Collectors;
public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        // TODO fill in code here

       // List<String> list = new ArrayList<>();
        for (int i = 0; i < phrases.length - 1; i++){
            for(int j = i+1; j<phrases.length;j++){
               if(anaword(phrases[i], phrases[j])){
                phrases[j] = phrases[i];
               // list.add(phrases[i]);

            }}
        }
        Set<String> ret = new LinkedHashSet<>();
        for(int i = 0;i<phrases.length; i++){
            ret.add(phrases[i]);
        }

        String[] arr = new String[ret.size()];
        ret.toArray(arr);
        return arr;
    }


    private boolean compare(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        String[] ra = a.split(" ");
        String[] rb = b.split(" ");
       List<String> lista = new ArrayList<>();
       List<String> listb = new ArrayList<>();
        for (int i = 0; i < ra.length; i++){
            if(! ra[i].equals(" ")){
                lista.add(ra[i]);
            }
        }
        Collections.sort(lista);

        for (int i = 0; i < rb.length; i++){
            if(! rb[i].equals(" ")){
                lista.add(rb[i]);
            }
        }
        Collections.sort(listb);

        return lista.equals(listb);


    }
    private boolean anaword(String a, String b){
        a = a.replaceAll("\\s+","");
        b = b.replaceAll("\\s+","");
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        boolean flag = Arrays.equals(ac, bc);
        return flag;

    }

}
