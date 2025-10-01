class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrank += newBottles;
            emptyBottles = newBottles + (emptyBottles % numExchange);
        }

        return totalDrank;
    }
}
