class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] sl=new boolean[right+1];
        Arrays.fill(sl,true);
        sl[0]=sl[1]=false;
        for(int i=2;i*i<=right;i++){
            if(sl[i]){
                for(int j=i*i;j<=right;j+=i){
                    sl[j]=false;
                }
            }
        }
        List<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(sl[i]) li.add(i);
        }
        if(li.size()<2) return new int[]{-1,-1};    
        int min=Integer.MAX_VALUE;
        int[] res={-1,-1};
        for(int i=1;i<li.size();i++){
            int gap=li.get(i)-li.get(i-1);
            if(gap<min){
                min=gap;
                res[0]=li.get(i-1);
                res[1]=li.get(i);
            }
        }
        return res;
        }
}