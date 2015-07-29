public class Solution {
    public void sortColors(int[] nums) {
        int n;
        int[] colors = { 0, 0, 0 };
        
        for (n=0; n < nums.length; n++) {
            colors[ nums[n] ]++;
        }
        
        for (n=0; n < nums.length && n < colors[0]; n++) nums[n] = 0;
        colors[1] += colors[0];
        for (n=colors[0];  n < nums.length && n < colors[1]; n++) nums[n] = 1;
        colors[2] += colors[1];
        for (n=colors[1];  n < nums.length && n < colors[2]; n++) nums[n] = 2;
    }
}
