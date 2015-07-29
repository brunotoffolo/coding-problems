public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;
        int temp;
        for (int i=0; i < 32; i++) {
            temp = (1 << i) & n;
            if (temp != 0) {
                reversed |= (1 << (31-i));
            }
        }
        return reversed;
    }
}
