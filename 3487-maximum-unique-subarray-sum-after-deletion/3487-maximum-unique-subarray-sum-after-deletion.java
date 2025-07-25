class Solution {
    public int maxSum(int[] nums) {
          Set<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        int currentSum = 0;
        int maxSum = 0;

        while (right < nums.length) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            currentSum += nums[right];
            maxSum = Math.max(maxSum, currentSum);
            right++;
        }

        return maxSum;
    }
}