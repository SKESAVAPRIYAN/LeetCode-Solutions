import java.util.PriorityQueue;

class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : nums) {
            if (num != 0) {
                pq.add(num);
            }
        }
        
        int c = 0;
        
        while (!pq.isEmpty()) {
            int x = pq.poll();
            c++;
            
            int size = pq.size();
            PriorityQueue<Integer> tempQueue = new PriorityQueue<>();
            
            for (int i = 0; i < size; i++) {
                int a = pq.poll();
                a = a - x;
                
                if (a != 0) {
                    tempQueue.add(a);
                }
            }
            
            pq = tempQueue;
        }
        
        return c;
    }
}
