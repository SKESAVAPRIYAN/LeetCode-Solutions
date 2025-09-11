class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
            }
        int luck=-1;
        for(int key:ans.keySet()){
            if(ans.get(key)==key){
                luck=key;
            }
        }
    return luck;
    }
}