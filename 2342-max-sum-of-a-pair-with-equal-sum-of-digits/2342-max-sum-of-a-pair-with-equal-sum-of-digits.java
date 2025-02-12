class Solution {
    private int sumOfDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum+=r;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
       int map[]=new int[82],max=-1;
       int n=nums.length;

       for(int i=0;i<n;i++)
       {
         int num=nums[i];
         int sum=sumOfDigits(num);
         if(map[sum]!=0)
         {
            max=Math.max(max,num+map[sum]);
            map[sum]=Math.max(map[sum],num);
         }
         else
         {
            map[sum]=num;
         }
       }
       return max; 
    }
}