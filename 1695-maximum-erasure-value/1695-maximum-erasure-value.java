class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        boolean[] freq = new boolean[10001];
        int start = 0;
        int cur = 0;
        int maxx = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (freq[nums[i]]) {
                cur -= nums[start];
                freq[nums[start]] = false;
                start++;
            }
            cur += nums[i];
            freq[nums[i]] = true;
            maxx = Math.max(maxx, cur);
        }
        
        return maxx;
    }
}
