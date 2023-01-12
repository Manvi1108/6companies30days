public class leetcode299 {
    public String getHint(String secret, String guess) {
        int bull=0, cow=0;
        int[] sarr= new int[10];
        int[] garr= new int[10];
        for(int i=0;i<secret.length();i++){
            int s= Character.getNumericValue(secret.charAt(i));
            int g= Character.getNumericValue(guess.charAt(i));
            if(s==g)
                bull++;
            else{
                sarr[s]++;
                garr[g]++;
            }
        }
        for(int i=0;i<10;i++){
            cow+= Math.min(sarr[i],garr[i]);
        }
        return bull + "A" + cow + "B";
    }
}
