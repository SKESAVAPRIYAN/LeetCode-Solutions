class Solution {
    public boolean che(int num){
        String s=String.valueOf(num);
        if(s.contains("0")) return false;
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ar=new int[2];
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(i+j==n && che(j) && che(i)){
                    ar[0]=i;
                    ar[1]=j;
                    return ar;
                }
            }
        }return ar;
    }
}