class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int max=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c+=1;
            }
        while(c>k){
            if(nums[start]==0){
            c-=1;}
            start+=1;
        }
        max=Math.max(max,i-start+1);    
    }
    return max;
}}