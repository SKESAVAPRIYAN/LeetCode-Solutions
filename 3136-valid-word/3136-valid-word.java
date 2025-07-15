class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) return false;
        int v=0;
        int co=0;
        for(char c:word.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    v++;
                }
                else co++;
            }
            else if(!Character.isDigit(c)){
                return false;
            }
        }
        if(v>0 && co>0) return true;
        else return false;
    }}