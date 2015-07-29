public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        
        for (int i=0; i < 32; i++) {
            if ( isBitSetInN(i, n) && isTheOnlyBitSetInN(i, n) ) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean isBitSetInN(int i, int n) {
        int others = n & (1 << i);
        return (others > 0);
    }
    
    private boolean isTheOnlyBitSetInN(int i, int n) {
        int others = n - (1 << i);
        return (others == 0);
    }
}
