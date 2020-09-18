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


//Alternate Java Solution w/ Binary Search

class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        
        while (low <= high) {
            long k = (low + high) / 2;
            long curr = k * (k + 1) / 2;
            
            if (n == curr) {
                return (int) k;
            } else if (n < curr) {
                high = k - 1;
            } else {
                low = k + 1;
            }
        }
        
        return (int) high;
    }
}