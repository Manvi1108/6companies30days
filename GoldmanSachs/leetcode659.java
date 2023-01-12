package GoldmanSachs;

public class leetcode659 {
    public boolean isPossible(int[] nums) {
        int size= nums[nums.length-1] - nums[0] + 2;
        int[] arr1= new int[size];
        int[] arr2= new int[size];
        int[] arr3= new int[size];
        
        for(int i: nums){
            i-=nums[0];
            if(arr1[i]!=0){
                arr1[i]--;
                arr2[i+1]++;
            }
            else if(arr2[i]!=0){
                arr2[i]--;
                arr3[i+1]++;
            }
            else if(arr3[i]!=0){
                arr3[i]--;
                arr3[i+1]++;
            }
            else
                arr1[i+1]++;
        }
        
        for(int i=0;i<size;i++){
            if(arr1[i]!=0 || arr2[i]!=0)
                return false;
        }
        return true;
    }
}
