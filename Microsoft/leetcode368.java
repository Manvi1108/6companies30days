import java.util.*;

public class leetcode368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int[] dp= new int[nums.length];
        int[] prev= new int[nums.length];
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        int max=1, idx=0;
        prev[0]=-1;
        for(int i=1;i<nums.length;i++){
            prev[i]=-1;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[i]<dp[j]+1){
                        dp[i]= dp[j]+1;
                        prev[i]=j;
                    }
                }
            }
            if(dp[i]>max){
                max=dp[i];
                idx=i;
            }
        }
        while(idx!=-1){   
            ans.add(nums[idx]);
            idx= prev[idx];
        }
        return ans;
    }
}
