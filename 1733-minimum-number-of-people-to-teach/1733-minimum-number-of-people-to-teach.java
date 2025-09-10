class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer>user=new HashSet<>();
        for(int frnd[]:friendships){
            int u=frnd[0]-1;
            int v=frnd[1]-1;
            Set<Integer> ulang=new HashSet<>();
            boolean know=false;
            for(int lan:languages[u]){
                ulang.add(lan);
            }
            for(int lan:languages[v]){
                if(ulang.contains(lan)){
                    know=true;
                    break;
                }
            }
            if(!know){
                user.add(u);
                user.add(v);
            }
        }
        int[] langu=new int[n+1];
        int max=0;
        for(int us:user){
            for(int lan:languages[us]){
                langu[lan]++;
                max=Math.max(max,langu[lan]);
            }
        }
        return user.size()-max;
    }
}