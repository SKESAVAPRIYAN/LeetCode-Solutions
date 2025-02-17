class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        PriorityQueue<Integer>p=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
        }
        for(int i=0;i<arr.length;i+=2){
            int a=p.poll();
            int b=p.poll();
            arr[i]=b;
            arr[i+1]=a;
        }
        return arr;
    }
}