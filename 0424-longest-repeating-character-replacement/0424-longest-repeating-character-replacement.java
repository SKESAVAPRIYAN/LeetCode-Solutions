class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> ans=new HashMap<>();
        int l=0;
        int res=0;
        int maxf=0;
        for(int r=0;r<s.length();r++){
            ans.put(s.charAt(r),ans.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,ans.get(s.charAt(r)));
            while(r-l+1-maxf>k){
                ans.put(s.charAt(l),ans.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;

    }
}
