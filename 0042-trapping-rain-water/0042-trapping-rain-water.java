class Solution {
    public int trap(int[] height) {
        int res=0;
        int n=height.length;
        int[] l=new int[height.length];
        int[] r=new int[height.length];
        l[0]=height[0];
        r[n-1]=height[n-1];
            
        for(int j=1;j<n;j++){
                l[j]=Math.max(l[j-1],height[j]);
            }
        for(int j=n-2;j>0;j--){
                r[j]=Math.max(r[j+1],height[j]);
            }
        for(int i=1;i<n;i++){
            res+=Math.min(l[i],r[i])-height[i];
        }
        return res;
    }
}