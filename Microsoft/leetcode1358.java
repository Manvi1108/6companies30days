public class leetcode1358{
    public int numberOfSubstrings(String s) {
        int ans=0,j=0;
        int[] flag= new int[3];
        for(int i=0;i<s.length();i++){
            flag[s.charAt(i)- 'a']++;
            while(flag[0]>0 && flag[1]>0 && flag[2]>0){
                flag[s.charAt(j++) - 'a']--;
            }
            ans+=j;
        }
        return ans;    
    }
}