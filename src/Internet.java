import java.util.*;
    public class Internet {
        private HashMap<String, Set<String>> myMap = new HashMap<>();
        private int numPoint = 0;

        public int articulationPoints(String[] routers) {

            Integer temp1 = 0;
            for (String sets : routers) {
                String temp2 = temp1.toString();
                String[] friends = sets.split(" ");
                List<String> list = Arrays.asList(friends);
                myMap.put(temp2, new HashSet<>());
                myMap.get(temp2).addAll(list);
                temp1++;
            }

            for (int k = 0; k < routers.length; k++) {
                String vertex = "" + k;
                String start = "0";
                if (k == 0) start = "1";
                Set<String> set = gothrough(start, vertex);
                if (set.size() != routers.length - 1) numPoint++;
            }
            return numPoint;
        }



        private Set<String> gothrough(String start, String vertex){
            Set<String> visited = new HashSet<>();
            Queue<String> q = new LinkedList<>();
            visited.add(start);
            q.add(start);
            while (q.size() > 0){
                String router = q.remove();
                for(String connectedRouters : myMap.get(router)){
                    if (connectedRouters.equals(vertex)) continue;
                    if (!visited.contains(connectedRouters)) {
                        visited.add(connectedRouters);
                        q.add(connectedRouters);
                    }
                }
            }
            return visited;
        }


    }

