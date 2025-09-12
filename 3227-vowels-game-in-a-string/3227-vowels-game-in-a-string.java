class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                return true;
            }
        }
        return false;

    }
}