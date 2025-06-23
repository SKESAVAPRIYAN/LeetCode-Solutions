class Solution {
    public int maxSubArray(int[] nums) {
        int maxe=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            maxe=Math.max(maxe+nums[i],nums[i]);
            res=Math.max(maxe,res);
        }
        return res;
    }
}