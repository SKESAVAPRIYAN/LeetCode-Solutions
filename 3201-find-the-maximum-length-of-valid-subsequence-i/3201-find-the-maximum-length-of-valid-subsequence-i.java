class Solution {
    public int maximumLength(int[] nums) {
        int odd = 0, even = 0;

        // Count odds and evens
        for (int num : nums) {
            if (num % 2 == 0) even++;
            else odd++;
        }

        // Find max length of alternating subsequence
        int maxAlt = 1;  // At least one element
        int prevParity = nums[0] % 2;
        for (int i = 1; i < nums.length; i++) {
            int currParity = nums[i] % 2;
            if (currParity != prevParity) {
                maxAlt++;
                prevParity = currParity;
            }
        }

        return Math.max(maxAlt, Math.max(odd, even));
    }
}
