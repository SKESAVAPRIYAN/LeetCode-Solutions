class Solution {
    public int maxFrequencyElements(int[] nums) {
       int[] freq=new int[101];
       int max=0;
       int res=0;
       for(int num:nums){
        freq[num]++;
        if(freq[num]>max){
            max=freq[num];
        }
       }
       for(int f:freq){
        if(f==max){
            res+=f;
        }
       }
       return res;
    }
}