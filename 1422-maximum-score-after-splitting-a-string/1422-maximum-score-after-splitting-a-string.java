class Solution {
    public int maxScore(String s) {
       int one=0;
       int tot=0;
       int zer=0;
       int bes=Integer.MIN_VALUE;
       for(char ch:s.toCharArray()){
        if(ch=='1') tot++;
       } 
       for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0') zer++;
        else one++;
        int cur=zer+(tot-one);
        bes=Math.max(bes,cur);
       }
       return bes;
    }
}