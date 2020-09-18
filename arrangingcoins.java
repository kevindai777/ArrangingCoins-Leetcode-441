//Java Solution

class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int stairCase = 1;
        
        while (n >= stairCase) {
            n -= stairCase++;
            count++;
        }
        
        return count;
    }
}