import java.util.Arrays;

public class OlympicCandles {
    public int numberOfNights(int[] candles){
        // write code
        int numnights = 1;
        while(true){
            Arrays.sort(candles);
            for(int i = 0; i < numnights; i++){
                int index = candles.length - i - 1;
                if(index < 0 || candles[index] == 0) return numnights-1;
                else candles[index] --;
            }
            numnights++;


    }

}}
