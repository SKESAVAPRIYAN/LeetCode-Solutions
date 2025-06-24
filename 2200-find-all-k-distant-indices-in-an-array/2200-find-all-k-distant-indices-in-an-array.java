import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> resultSet = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(n - 1, i + k);
                for (int idx = start; idx <= end; idx++) {
                    resultSet.add(idx);
                }
            }
        }

        List<Integer> ans = new ArrayList<>(resultSet);
        Collections.sort(ans);
        return ans;
    }
}
