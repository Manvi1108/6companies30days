public class leetcode396 {
    public int maxRotateFunction(int[] nums) {
        int sum=0, f0=0;
        for(int i=0;i<nums.length;i++){
            f0= f0+ nums[i]*i;
            sum+=nums[i];
        }
        int ans= f0, n=nums.length;
        for(int i=0;i<nums.length;i++){
            f0 = sum + f0 - n* nums[n-i-1];
            ans = Math.max(ans,f0);
        }
        return ans;
    }
}
