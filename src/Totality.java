public class Totality {
    public int sum(int[] a, String stype) {
        // you add code here
        int total = 0;
        if(stype.equals("even") ){
            for(int k = 0; k<a.length; k += 2) {
                total += a[k];
            }
        }
        if(stype.equals( "odd")){
            for(int k = 1; k<a.length; k += 2){
                total += a[k];
            }
        }
        if(stype.equals("all")){
            for(int k = 0; k<a.length; k += 1){
                total += a[k];
            }
        }


        return total;
    }
}
