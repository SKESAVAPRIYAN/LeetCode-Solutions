class Solution {
    public int waysToSplitArray(int[] nums) {
        long tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        int c=0;
        long sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            if(sum>=tot-sum) c++;
        }
        return c;
    }
}