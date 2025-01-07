class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int [] fibo=new int[n+1];
        fibo[0]=1;
        fibo[1]=1;
        for(int i=2;i<n;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
             
        }
       return fibo[n-1];
    }
}