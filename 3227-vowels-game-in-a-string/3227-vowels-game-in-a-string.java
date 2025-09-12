class Solution {
    public boolean doesAliceWin(String s) {
        char[] ar=s.toCharArray();
        int c=0;
        for(int i=0;i<ar.length;i++){
            if("aeiouAEIOU".indexOf(ar[i])!=-1){
                return true;
            }
        }
        return false;

    }
}