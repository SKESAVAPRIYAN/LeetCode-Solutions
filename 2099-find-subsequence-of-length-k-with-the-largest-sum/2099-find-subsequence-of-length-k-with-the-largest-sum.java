class Solution {
    
    int res[], maxSum;
    public int[] maxSubsequence(int[] nums, int k) {
        
        res = new int[k];
        
        PriorityQueue<Integer> mQ = new PriorityQueue<>((a,b) -> (nums[a]-nums[b]));
        for(int i = 0; i< nums.length; i++) {
            mQ.offer(i);
            if(mQ.size()>k){
                mQ.poll();
            }
        }

        PriorityQueue<Integer> resQ = new PriorityQueue<>((a,b) -> (a-b));
        resQ.addAll(mQ);
        int count = 0;
        for(int i = 0; i < k; i++) {
            res[i] = nums[resQ.poll()];
        }
        
        return res;
    }
}