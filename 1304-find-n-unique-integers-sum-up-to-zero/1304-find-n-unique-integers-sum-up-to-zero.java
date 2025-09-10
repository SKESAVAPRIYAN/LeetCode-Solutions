class Solution {
    public int[] sumZero(int n) {
        int[] ar=new int[n];
        int ind=0;
        if(n%2!=0){
            ar[ind++]=0;
        }
        for(int i=1;i<=n/2;i++){
            ar[ind++]=i;
            ar[ind++]=-i;
        }
        return ar;
    }
}