import java.util.*;

public class MedalTable {
    private class MedalCountry{
        String myName;
        int myGold;
        int mySilver;
        int myBronze;
        MedalCountry(String name){
            myName = name;
        }
        public int getGold(){
            return myGold;
        }
        public int getSilver(){
            return mySilver;
        }
        public int getBronze(){
            return myBronze;
        }
        public String getName(){
            return myName;
        }

        @Override
        public String toString(){
            return String.format("%s %d %d %d", myName, myGold, mySilver,myBronze);
        }

    }
    public String[] generate(String[] results) {
        // you fill in this code
        Map<String,MedalCountry> map = new HashMap<>();
        for(String s:results){
            String[] data = s.split(" ");
            for(int i = 0; i < data.length; i++){
                String c = data[i];
                if(!map.containsKey(c)){
                    map.put(c,new MedalCountry(c));
                }
                if(i == 0){map.get(c).myGold += 1;}
               if(i == 1){map.get(c).mySilver += 1;}
                if(i == 2){map.get(c).myBronze += 1;}

            }
        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparing(MedalCountry::getName));
        list.sort(Collections.reverseOrder(Comparator.comparing(MedalCountry::getBronze)));
        list.sort(Collections.reverseOrder(Comparator.comparing(MedalCountry::getSilver)));
        list.sort(Collections.reverseOrder(Comparator.comparing(MedalCountry::getGold)));
        String[] array = new String[list.size()];
        int j = 0;
        for(MedalCountry temp:list){
            array[j] = temp.toString();
            j += 1;
        }
        return array;


    }
}
