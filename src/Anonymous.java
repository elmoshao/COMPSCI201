public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        // TODO: fill in code here
        int[] counts_h = new int[300];
        int fcounts = 0;

        for (String hs: headlines){
            String[] hs2 = hs.split(" ");
            counts_h = getCounts(hs2,counts_h);
        }
        for (String ms: messages){
            String[] ms2 = ms.split(" ");
            int[] counts_m = new int[300];
            counts_m = getCounts(ms2,counts_m);
            for(int i = 0; i < 300; i++){
                if(counts_h[i] < counts_m[i]){
                    fcounts += 1;
                    break;
                }
            }
        }




        return messages.length - fcounts;
    }
    private int[] getCounts(String[] strings, int[] counts){

        for (String s : strings){
            for(char ch : s.toLowerCase().toCharArray()){
                counts[ch] += 1;
            }
        }
        return counts;
    }
}
