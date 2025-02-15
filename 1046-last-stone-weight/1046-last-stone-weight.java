import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            q.add(stone);
        }

        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            if (a != b) {
                q.add(a - b);
            }
        }

        return q.isEmpty() ? 0 : q.poll();
    }
}
