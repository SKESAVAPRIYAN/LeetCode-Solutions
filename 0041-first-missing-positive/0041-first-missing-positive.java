class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]<=0 || nums[i]>n){
                i++;
                continue;
            }
            int ind=nums[i]-1;
            if(nums[ind]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
            }
            else{
                i++;
            }
        }
        i=0;
        while(i<n){
            if(nums[i]!=i+1) return i+1;
            i++;
        }
        return n+1;
            

        }
    }
