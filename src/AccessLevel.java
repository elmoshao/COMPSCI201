public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        // fill in code here
        String Access = "";
        if (rights == null){return Access;}
        for (int k = 0; k < rights.length; k++){
            if (rights[k] < minPermission){
                Access = Access + "D";

            }
            else{
                Access = Access + "A";
            }
        }
         return Access;





    }
}
