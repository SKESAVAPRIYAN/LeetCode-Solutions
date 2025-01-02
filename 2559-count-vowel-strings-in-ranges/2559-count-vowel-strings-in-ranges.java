class Solution {
    public boolean isvowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'; 
    }
    public boolean is(String s){
        return isvowel(s.charAt(0)) && isvowel(s.charAt(s.length()-1));
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] pref=new int[words.length+1];
        int i=0;
        for(String s:words){
            if(is(s)) pref[i+1]=pref[i]+1;
            else pref[i+1]=pref[i];
            i++;
        }
        int[] ans=new int[queries.length];
        int j=0;
        for(int q[]:queries){
            int r=q[1];
            int l=q[0];
            ans[j++]=pref[r+1]-pref[l];
        }return ans;
    }
}