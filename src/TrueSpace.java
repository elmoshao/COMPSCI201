public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // fill in code here
        long clusternumber = 0;
        for (int i = 0; i < sizes.length; i++){
            clusternumber += count(sizes[i],clusterSize);

            }


        long output = clusternumber * clusterSize;
        return output;
    }
    private long count(int size, int clusterSize){
        if(size <= clusterSize && size !=0){
            return 1;
        }
        if (size == 0){
            return 0;
        }
        if(size > clusterSize){
            double num = size / clusterSize;
            long m = size % clusterSize;
            if (m != 0){
                long number = (size - m)/clusterSize + 1;

                return  number;
            }
            else {
                long number  = (long) num;
                return number;
            }

        }
return 1;
    }
}
