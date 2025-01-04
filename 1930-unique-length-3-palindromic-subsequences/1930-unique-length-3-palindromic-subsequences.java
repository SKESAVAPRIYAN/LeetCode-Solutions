class Solution {
    public int countPalindromicSubsequence(String s) {
        int len = s.length();
        int count = 0;
        for(char c = 'a';c <= 'z';c++){
            int start = -1, last = -1;
            for(int i = 0;i < len;i++){
                if(s.charAt(i) == c){
                    if(start == -1){
                        start = i;
                    }
                    last = i;
                }
            }
            if(last != -1 && start != -1 && start < last){
                Set<Character> collect = new HashSet<>();
                for(int i = start+1;i < last;i++){
                    collect.add(s.charAt(i));
                }
                count += collect.size();
            }
        }
        return count;
    }
}