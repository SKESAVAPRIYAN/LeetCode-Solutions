class Solution {
    public void flip(int[] nums,int n){
        nums[n]^=1;
        nums[n+1]^=1;
        nums[n+2]^=1;
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-2;++i){
            if(nums[i]==1){
                continue;
            }
        flip(nums,i);
        c++;}
        if(nums[n-2]==0 || nums[n-1]==0) return -1;
        return c;
    }
}