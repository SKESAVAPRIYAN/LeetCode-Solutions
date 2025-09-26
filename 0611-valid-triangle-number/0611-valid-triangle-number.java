class Solution {
    public int triangleNumber(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
                int l=0;
                int r=i-1;
                while(l<r){
                    if((nums[l]+nums[r])>nums[i]) {
                    c+=(r-l);
                    r--;;
                    }
                    else l++;
                }
                }
        return c;
    }
}