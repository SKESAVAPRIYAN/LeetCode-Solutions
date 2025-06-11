class Solution {
    List<List<Integer>> result = new ArrayList<>();

    void printf(int index, List<Integer> current, int[] nums, int n) {
        if (index == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        printf(index + 1, current, nums, n);

        current.remove(current.size() - 1);
        printf(index + 1, current, nums, n);
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> current = new ArrayList<>();
        printf(0, current, nums, n);
        return result;
    }
}
