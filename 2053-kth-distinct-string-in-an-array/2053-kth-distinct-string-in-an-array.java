class Solution {
    public String kthDistinct(String[] arr, int k) {
       Map<String,Integer> ans=new HashMap<>();
        for(String ar:arr){
            ans.put(ar,ans.getOrDefault(ar,0)+1);
        }
        int count=0;
        for(String s:arr){
            if(ans.get(s)==1) count++;
            if(count==k) return s;
        }
        return "";
    }
}